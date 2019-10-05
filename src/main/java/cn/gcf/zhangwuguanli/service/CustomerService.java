package cn.gcf.zhangwuguanli.service;

import java.util.List;

import cn.gcf.zhangwuguanli.pojo.Customer;
import cn.gcf.zhangwuguanli.pojo.CustomerAndInterview;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.utils.Page;

public interface CustomerService {

	//查询关联职员
	List<Interview> selectInterview();
	
	//添加客户
	int insetCustomer(Customer customer);
	//查询客户列表
	List<Customer> selectPageList(Page page);

	int selectPageCount(Page page);
	//查询客户详细信息
	List<Customer> selectCustomerByCid(int cid);
	//查询关联员工，回显问题
	List<CustomerAndInterview> selectCustomerAndInterviewbyCid(int cid);
	//更新客户信息
	void updateCustomerByCid(Customer customer);
	//删除客户
	void deleteCustomerById(Integer cid);

	List<Customer> selectCustomerName();
}
