package cn.gcf.zhangwuguanli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gcf.zhangwuguanli.mapper.CustomerMapper;
import cn.gcf.zhangwuguanli.mapper.InterviewMapper;
import cn.gcf.zhangwuguanli.pojo.Customer;
import cn.gcf.zhangwuguanli.pojo.CustomerAndInterview;
import cn.gcf.zhangwuguanli.pojo.CustomerExample;
import cn.gcf.zhangwuguanli.pojo.CustomerExample.Criteria;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.service.CustomerService;
import cn.gcf.zhangwuguanli.utils.Page;

@Service
public class CustomerServiewImpl implements CustomerService{

	@Autowired
	InterviewMapper interviewMapper;
	
	@Autowired
	CustomerMapper customerMapper;
	
	//查询关联职员的信息
	@Override
	public List<Interview> selectInterview() {
		List<Interview> interviewList = interviewMapper.selectByExample(null);
		return interviewList;
	}
	@Override
	public int insetCustomer(Customer customer) {
		return customerMapper.insert(customer);
	}
	@Override
	public List<Customer> selectPageList(Page page) {
		return customerMapper.selectPageList(page);
	}
	@Override
	public int selectPageCount(Page page) {
		return customerMapper.selectPageCount(page);
	}
	//查询客户详细信息
	@Override
	public List<Customer> selectCustomerByCid(int cid) {
		CustomerExample example = new CustomerExample();
		Criteria criteria = example.createCriteria();
		criteria.andCidEqualTo(cid);
		List<Customer> list = customerMapper.selectByExample(example);
		return list;
	}
	
	@Override
	public List<CustomerAndInterview> selectCustomerAndInterviewbyCid(int cid) {
		return customerMapper.selectCustomerAndInterviewbyCid(cid);
	}
	//更新客户信息
	@Override
	public void updateCustomerByCid(Customer customer) {
		customerMapper.updateCustomer(customer);
	}
	//删除客户
	@Override
	public void deleteCustomerById(Integer cid) {
		customerMapper.deleteByPrimaryKey(cid);
	}
	@Override
	public List<Customer> selectCustomerName() {
		return customerMapper.selectName();
	}
}
