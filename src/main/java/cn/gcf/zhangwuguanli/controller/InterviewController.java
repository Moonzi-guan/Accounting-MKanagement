package cn.gcf.zhangwuguanli.controller;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.service.InterviewService;
import cn.gcf.zhangwuguanli.utils.Page;
import cn.gcf.zhangwuguanli.utils.PagesUtils;
import cn.gcf.zhangwuguanli.utils.ResultMap;

@Controller
public class InterviewController {

	@Autowired
	InterviewService interviewService;
	//查询页面，按条件查询
	@RequestMapping(value="/interview/list",method = RequestMethod.GET)
	@ResponseBody
	public ResultMap<List<Interview>> selectInterview(Page page, @RequestParam("limit") int limit){
		//设置一次查询的条数
	    page.setRows(limit);
	    //查询数据
	    List<Interview> List= interviewService.selectPageList(page);
	    //查询总条数
	    int totals= interviewService.selectPageCount(page);
	    page.setTotalRecord(totals);
	    //返回给结果集
	    return new ResultMap<List<Interview>>("",List,0,totals);
	
	}
	
	//查询点击该行的员工信息
	@RequestMapping(value="/interview/check",method = RequestMethod.GET)
	public String showEmployee_check(@PathParam("iid") int iid,ModelMap  modelmap) {
		List<Interview> list = interviewService.selectInterviewByIid(iid);
		modelmap.addAttribute("list", list);
		System.out.println(iid);
		return "personal-management-pages/information_chack";
	}
	
	
	//打开员工编辑页面
	@RequestMapping(value="/interview/edit",method = RequestMethod.GET)
	public String showEmployee_eidt(@PathParam("iid") int iid,ModelMap  modelmap) {
		List<Interview> list = interviewService.selectInterviewByIid(iid);
		modelmap.addAttribute("list", list);
		System.out.println(iid);
		return "personal-management-pages/information_edit";
	}
	
	//更新员工信息
	@RequestMapping(value="/interview/eidtInterview",method = RequestMethod.GET)
	public void updateInterview(@PathParam("iid") Integer iid,String iusername,Integer isex,String iapplicant,String icontact,String iedu
			,String ischool,String iprofession,String imanning,Integer istatus,String iexperience) {
		Interview interview = new Interview();
		interview.setIid(iid);
		interview.setIusername(iusername);
		interview.setIsex(isex);
		interview.setIapplicant(iapplicant);
		interview.setIcontact(icontact);
		interview.setIedu(iedu);
		interview.setIschool(ischool);
		interview.setIprofession(iprofession);
		interview.setImanning(imanning);
		interview.setIstatus(istatus);
		interview.setIexperience(iexperience);
		int i = interviewService.updateInterviewByIid(interview);
		System.out.println(i);
		System.out.println(iid);
		System.out.println(iusername);
	}
	
	
	
	@RequestMapping(value="/interview/delete",method = RequestMethod.GET)
	@ResponseBody
	public void deleteInterview(@PathParam("iid") Integer iid) {
		interviewService.deleteInterviewById(iid);
		
	}
	
}
