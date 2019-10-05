package cn.gcf.zhangwuguanli.service;

import java.util.List;

import cn.gcf.zhangwuguanli.pojo.Apporach;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.utils.Page;

public interface ApporachService {

	//插入商品
	int insertApporach(Apporach apporach);
	//查询管理员工
	List<Interview> selectInterview();
	//查询商品
	List<Apporach> selectPageList(Page page);
	
	int selectPageCount(Page page);
	//
	List<Apporach> selectApporachByAid(int aid);
	//
	void deleteApporachByAId(Integer aid);
	//查询商品的全部内容
	List<Apporach> selectApporachAll();
}
