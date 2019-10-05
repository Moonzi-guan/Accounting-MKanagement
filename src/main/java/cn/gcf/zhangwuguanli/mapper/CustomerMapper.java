package cn.gcf.zhangwuguanli.mapper;

import cn.gcf.zhangwuguanli.pojo.Customer;
import cn.gcf.zhangwuguanli.pojo.CustomerAndInterview;
import cn.gcf.zhangwuguanli.pojo.CustomerExample;
import cn.gcf.zhangwuguanli.utils.Page;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

	List<Customer> selectPageList(Page page);

	int selectPageCount(Page page);
	//查询客户关联的员工表
	List<CustomerAndInterview> selectCustomerAndInterviewbyCid(int cid);
	
	void updateCustomer(Customer customer);

	List<Customer> selectName();
}