package cn.gcf.zhangwuguanli.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gcf.zhangwuguanli.pojo.Apporach;
import cn.gcf.zhangwuguanli.pojo.Customer;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.service.ApporachService;
import cn.gcf.zhangwuguanli.service.InterviewService;
import cn.gcf.zhangwuguanli.utils.Page;
import cn.gcf.zhangwuguanli.utils.ResultMap;

@Controller
public class ApporachController {

	
	@Autowired
	ApporachService apporachService;
	
	//跳转到商品添加页面
	@RequestMapping("/apporach-pages/apporach_add")
	public String showApporach_add(Model model) {
		
		List<Interview> interviewList = apporachService.selectInterview();
		model.addAttribute("interviewList", interviewList);
		return "apporach-pages/apporach_add";
	}
	//商品添加操作
	@RequestMapping("/apporachAdd")
	public String insertApporach(Integer aid,String ano,String aname,String apicture,String aexpress,String ainformation,
			Integer anumber,double amoney,String acategory,String awarehouse,Integer ino) {
		Apporach apporach = new Apporach();
		apporach.setAid(aid);
		apporach.setAno(ano);
		apporach.setAname(aname);
		apporach.setApicture(apicture);
		apporach.setAexpress(aexpress);
		apporach.setAinformation(ainformation);
		apporach.setAnumber(anumber);
		apporach.setAmoney(amoney);
		apporach.setAcategory(acategory);
		apporach.setAwarehouse(awarehouse);
		apporach.setIno(ino);
		apporachService.insertApporach(apporach);
		return "apporach-pages/apporach_add";
	}
	
	//查询商品列表
	@RequestMapping(value="/apporach/bill",method = RequestMethod.GET)
	@ResponseBody
	public ResultMap<List<Apporach>> selectApporach(Page page, @RequestParam("limit") int limit){
		//设置一次查询的条数
	    page.setRows(limit);
	    //查询数据
	    List<Apporach> List= apporachService.selectPageList(page);
	    //查询总条数
	    int totals= apporachService.selectPageCount(page);
	    page.setTotalRecord(totals);
	    //返回给结果集
	    return new ResultMap<List<Apporach>>("",List,0,totals);
	
	}
	
	//查询商品的详细信息
	@RequestMapping(value="/apporach/check",method = RequestMethod.GET)
	public String showApporach_check(@PathParam("aid") int aid,ModelMap  modelmap) {
		List<Apporach> list = apporachService.selectApporachByAid(aid);
		modelmap.addAttribute("list", list);
		return "apporach-pages/apporach_chack";
	}
	
	//删除商品信息
	@RequestMapping(value="/apporach/delete",method = RequestMethod.GET)
	@ResponseBody
	public void deleteApporach(@PathParam("aid") Integer aid) {
		apporachService.deleteApporachByAId(aid);
		
	}
	
}
