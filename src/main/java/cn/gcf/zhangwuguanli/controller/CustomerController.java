package cn.gcf.zhangwuguanli.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gcf.zhangwuguanli.mapper.OrdersMapper;
import cn.gcf.zhangwuguanli.pojo.Customer;
import cn.gcf.zhangwuguanli.pojo.CustomerAndInterview;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.pojo.Orders;
import cn.gcf.zhangwuguanli.service.CustomerService;
import cn.gcf.zhangwuguanli.service.OrdersService;
import cn.gcf.zhangwuguanli.utils.Page;
import cn.gcf.zhangwuguanli.utils.ResultMap;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	@Autowired
	OrdersService ordersService;
	
	//跳转到员工信息页面,并且查询关联职员
	@RequestMapping("/customer-pages/customer_add")
	public String showCustomer(Model model) {
		List<Interview> interviewList = customerService.selectInterview();
		model.addAttribute("interviewList", interviewList);
		return "/customer-pages/customer_add";
	}
	
	
	@RequestMapping("customer/add")
	public String insertCustomer(Integer cid,String cpicture, String cname,Integer csex, String ccompony
			,String capplicant,String ccontact,String caddr,Integer cstatic,Integer ino ) {
		Customer customer = new Customer();
		customer.setCid(cid);
		customer.setCpicture(cpicture);
		customer.setCname(cname);
		customer.setCsex(csex);
		customer.setCcompony(ccompony);
		customer.setCapplicant(capplicant);
		customer.setCcontact(ccontact);
		customer.setCaddr(caddr);
		customer.setCstatic(cstatic);
		customer.setIno(ino);
		customerService.insetCustomer(customer);
		return "/customer-pages/customer_add";
	}
	
	//查询客户列表页面
	@RequestMapping(value="/customer/list",method = RequestMethod.GET)
	@ResponseBody
	public ResultMap<List<Customer>> selectCustomer(Page page, @RequestParam("limit") int limit){
		//设置一次查询的条数
	    page.setRows(limit);
	    //查询数据
	    List<Customer> List= customerService.selectPageList(page);
	    //查询总条数
	    int totals= customerService.selectPageCount(page);
	    page.setTotalRecord(totals);
	    //返回给结果集
	    return new ResultMap<List<Customer>>("",List,0,totals);
	
	}
	
	//查询客户的详细信息
	@RequestMapping(value="/customer/check",method = RequestMethod.GET)
	public String showCustomer_check(@PathParam("cid") int cid,ModelMap  modelmap) {
		List<Customer> list = customerService.selectCustomerByCid(cid);
		modelmap.addAttribute("list", list);
		return "customer-pages/customer_chack";
	}
	
	//打开员工编辑页面
	@RequestMapping(value="/customer/edit",method = RequestMethod.GET)
	public String showCustomer_eidt(@PathParam("cid") int cid,ModelMap  modelmap,Model model) {
		List<Customer> list = customerService.selectCustomerByCid(cid);
		List<Interview> interviewList = customerService.selectInterview();
		int ino = list.get(0).getIno();
		List<CustomerAndInterview> CIList = customerService.selectCustomerAndInterviewbyCid(ino);
		model.addAttribute("CIList", CIList);
		model.addAttribute("interviewList", interviewList);
		modelmap.addAttribute("list", list);
		return "customer-pages/customer_edit";
	}
	//更新客户信息
	@RequestMapping(value="/customer/editCustomer",method = RequestMethod.GET)
	public void updateCustomer(@PathParam("cid") Integer cid,String cname,Integer csex,String ccompony,String capplicant,String ccontact
			,String caddr,Integer cstatic,Integer ino) {
		Customer customer = new  Customer();
		customer.setCid(cid);
		customer.setCname(cname);
		customer.setCsex(csex);
		customer.setCcompony(ccompony);
		customer.setCapplicant(capplicant);
		customer.setCcontact(ccontact);
		customer.setCaddr(caddr);
		customer.setCstatic(cstatic);
		customer.setIno(ino);
		customerService.updateCustomerByCid(customer);
	}
	
	//删除客户信息
	@RequestMapping(value="/customer/delete",method = RequestMethod.GET)
	@ResponseBody
	public void deleteCustomer(@PathParam("cid") Integer cid) {
		customerService.deleteCustomerById(cid);
		
	}
	
	
	//跳转到客户与员工关联信息页面
	@RequestMapping("/customer-pages/customer_bill")
	public String showCustomer_bill(Model model) {
		//查询关联员工表
		List<Interview> interviewList = customerService.selectInterview();
		model.addAttribute("interviewList", interviewList);
		return "customer-pages/customer_bill";
	}
	
	//查询客户列表页面
	@RequestMapping(value="customer_bill/list",method = RequestMethod.GET)
	@ResponseBody
	public ResultMap<List<Orders>> selectCustomer_bill(Page page, @RequestParam("limit") int limit){

		//设置一次查询的条数
	    page.setRows(limit);
	    //查询数据
	    List<Orders> List= ordersService.selectPageListAndTwoSearch(page);
	    //查询总条数
	    int totals= ordersService.selectPageCountAndTwoSearch(page);
	    page.setTotalRecord(totals);
	    //返回给结果集
	    return new ResultMap<List<Orders>>("",List,0,totals);
	
	}
	//查询点击该行的员工信息
	@RequestMapping(value="/customer_bill/check",method = RequestMethod.GET)
	public String showOrders_check(@PathParam("oid") int oid,ModelMap  modelmap) {
		List<Orders> list = ordersService.selectInterviewByOid(oid);
		modelmap.addAttribute("list", list);
		return "customer-pages/customer_bill_chack";
	}
	
	
	
		
}
