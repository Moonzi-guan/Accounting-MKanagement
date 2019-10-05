package cn.gcf.zhangwuguanli.service;

import java.util.List;

import cn.gcf.zhangwuguanli.pojo.Orders;
import cn.gcf.zhangwuguanli.utils.Page;

public interface OrdersService {

	List<Orders> selectPageList(Page page);

	int selectPageCount(Page page);

	List<Orders> selectInterviewByOid(int oid);

	void insertOrders(Orders orders);

	List<Orders> selectOrdersByOid(int oid);

	List<Orders> selectPageListAndTwoSearch(Page page);

	int selectPageCountAndTwoSearch(Page page);

	void deleteOrdersByOid(Integer oid);

}
