package cn.gcf.zhangwuguanli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gcf.zhangwuguanli.mapper.OrdersMapper;
import cn.gcf.zhangwuguanli.pojo.Orders;
import cn.gcf.zhangwuguanli.pojo.OrdersExample;
import cn.gcf.zhangwuguanli.pojo.OrdersExample.Criteria;
import cn.gcf.zhangwuguanli.service.OrdersService;
import cn.gcf.zhangwuguanli.utils.Page;

@Service
public class OrdersServiceImpl  implements OrdersService{

	@Autowired
	OrdersMapper ordersMapper;
	
	@Override
	public List<Orders> selectPageListAndTwoSearch(Page page) {
		return ordersMapper.selectPageListTwo(page);
	}

	@Override
	public int selectPageCountAndTwoSearch(Page page) {
		return ordersMapper.selectPageCountTwo(page);
	}
	
	@Override
	public List<Orders> selectPageList(Page page) {
		return ordersMapper.selectPageList(page);
	}

	@Override
	public int selectPageCount(Page page) {
		return ordersMapper.selectPageCount(page);
	}

	@Override
	public List<Orders> selectInterviewByOid(int oid) {
		OrdersExample example = new OrdersExample();
		Criteria criteria = example.createCriteria();
		criteria.andOidEqualTo(oid);
		List<Orders> list = ordersMapper.selectByExample(example);
		return list;
	}

	@Override
	public void insertOrders(Orders orders) {
		ordersMapper.insert(orders);
	}

	@Override
	public List<Orders> selectOrdersByOid(int oid) {
		OrdersExample example = new OrdersExample();
		Criteria criteria = example.createCriteria();
		criteria.andOidEqualTo(oid);
		List<Orders> list = ordersMapper.selectByExample(example);
		return list;
	}

	@Override
	public void deleteOrdersByOid(Integer oid) {
		ordersMapper.deleteByPrimaryKey(oid);
		
	}

	
	

}
