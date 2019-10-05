package cn.gcf.zhangwuguanli.service;

import java.util.List;

import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.pojo.Newin;
import cn.gcf.zhangwuguanli.utils.PagesUtils;

public interface NewinService {

	//面试人员添加
	public int insertNewin(Newin newin);
	
	//查询面试人员(弃用)
	List<Newin> selectNewinList();
	
	//查询面试人员
	public PagesUtils<Newin> selectNewin(int page, int limit);
	
	//插入面试人员（成为职员）
	public int insertInterview(Interview interview);
	
}
