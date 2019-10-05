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
import cn.gcf.zhangwuguanli.pojo.Orders;
import cn.gcf.zhangwuguanli.service.ApporachService;
import cn.gcf.zhangwuguanli.service.CustomerService;
import cn.gcf.zhangwuguanli.service.InterviewService;
import cn.gcf.zhangwuguanli.service.OrdersService;
import cn.gcf.zhangwuguanli.utils.Page;
import cn.gcf.zhangwuguanli.utils.PictureResultMap;
import cn.gcf.zhangwuguanli.utils.ResultMap;

@Controller
public class SaleController {

	@Autowired
	ApporachService apporachService;
	@Autowired
	CustomerService customerService;
	@Autowired
	InterviewService interviewService;
	@Autowired
	OrdersService ordersService;
	
	
	@RequestMapping(value="/apporach/searchPicture", method=RequestMethod.GET)
	@ResponseBody
	public PictureResultMap<List<Apporach>> searchApporachAPicture(@PathParam("oaid") Integer oaid){
		List<Apporach> list = apporachService.selectApporachByAid(oaid);
		return new PictureResultMap<List<Apporach>>("success",list);
	}
	
	
	//跳转到员工添加页面
	@RequestMapping("/sale-pages/sale_add")
	public String showSale_add(Model model) {
		List<Apporach> apporachList = apporachService.selectApporachAll();
		List<Customer> customerList = customerService.selectCustomerName();
		List<Interview> interviewList = interviewService.selectInterviewName();
		
		model.addAttribute("apporachList", apporachList);
		model.addAttribute("customerList", customerList);
		model.addAttribute("interviewList", interviewList);
		
		return "sale-pages/sale_add";
	}
	
	//商品添加操作
	@RequestMapping("/ordersAdd")
	public String insertApporach(Integer oid,String ono,String cname,String iname,String oname,Integer oaid,
			String opicture,Long onumber,double omoney,String ocategory,double osum,String onewdate,String ofinishdate,
			String oaddr,String ocontact) {
		Orders orders = new Orders();
		orders.setOid(oid);
		orders.setOno(ono);
		orders.setCname(cname);
		orders.setIname(iname);
		orders.setOname(oname);
		orders.setOaid(oaid);
		orders.setOpicture(opicture);
		orders.setOnumber(onumber);
		orders.setOmoney(omoney);
		orders.setOcategory(ocategory);
		orders.setOsum(osum);
		orders.setOnewdate(onewdate);
		orders.setOfinishdate(ofinishdate);
		orders.setOaddr(oaddr);
		orders.setOcontact(ocontact);
		ordersService.insertOrders(orders);
		return "sale-pages/sale_add";
	}
	
	//查看账单列表
	@RequestMapping(value="/orders/bill",method = RequestMethod.GET)
	@ResponseBody
	public ResultMap<List<Orders>> selectOrders(Page page, @RequestParam("limit") int limit){
		//设置一次查询的条数
	    page.setRows(limit);
	    //查询数据
	    List<Orders> List= ordersService.selectPageList(page);
	    //查询总条数
	    int totals= ordersService.selectPageCount(page);
	    page.setTotalRecord(totals);
	    //返回给结果集
	    return new ResultMap<List<Orders>>("",List,0,totals);
	}
	
	//查询账单的详细信息
	@RequestMapping(value="/orders/check",method = RequestMethod.GET)
	public String showOrders_check(@PathParam("oid") int oid,ModelMap  modelmap) {
		List<Orders> list = ordersService.selectOrdersByOid(oid);
		modelmap.addAttribute("list", list);
		return "sale-pages/sale_chack";
	}
	//删除账单的详细信息
	@RequestMapping(value="/orders/delete",method = RequestMethod.GET)
	public void deleteOrders(@PathParam("oid") Integer oid) {
		ordersService.deleteOrdersByOid(oid);
	}
}
