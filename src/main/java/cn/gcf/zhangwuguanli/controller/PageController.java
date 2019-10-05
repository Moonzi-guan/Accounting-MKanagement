package cn.gcf.zhangwuguanli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class PageController {

/*	@RequestMapping("/")
	public String showIndex() {
		return "index";
	}*/
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page) {
		return page;
	}
	
	//跳转到面试添加页面
	@RequestMapping("/personal-management-pages/newin_add")
	public String showAdd() {
		return "personal-management-pages/newin_add";
	}
	//加载到面试人员页面
	@RequestMapping("/personal-management-pages/newin")
	public String showNewin() {
		return "personal-management-pages/newin";
	}
	@RequestMapping("/personal-management-pages/newin2")
	public String showNewin2() {
		return "personal-management-pages/newin2";
	}
	//跳转到员工添加页面
	@RequestMapping("/personal-management-pages/newin_interview")
	public String showInterview() {
		return "personal-management-pages/newin_interview";
	}
	//跳转到员工信息页面
	@RequestMapping("/personal-management-pages/employee_information")
	public String showEmployee() {
		return "personal-management-pages/employee_information";
	}
	//跳转到客户信息页面
	@RequestMapping("/customer-pages/customer_information")
	public String showCustomer() {
		return "customer-pages/customer_information";
	}

	//跳转到商品列表页面
	@RequestMapping("/apporach-pages/apporach_bill")
	public String showApporach_bill() {
		return "apporach-pages/apporach_bill";
	}
		
	//跳转到账务列表页面
	@RequestMapping("/bill-pages/bill_information")
	public String showBill() {
		return "bill-pages/bill_information";
	}
	//跳转到账务列表页面
	@RequestMapping("/sale-pages/sale_bill")
	public String showSale_bill() {
		return "sale-pages/sale_bill";
	}
	//跳转到登陆页面
	@RequestMapping("/")
	public String showLogin() {
		return "login_1";
	}
} 
