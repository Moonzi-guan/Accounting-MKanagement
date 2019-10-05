package cn.gcf.zhangwuguanli.service;

import java.util.List;

import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.utils.Page;

public interface InterviewService {
	
	//查询所有职员
	//按条件查询职员
	public List<Interview> selectPageList(Page page);
	//查询条数
	public int selectPageCount(Page page);
	//查询编辑页面
	List<Interview> selectInterviewByIid(int iid);
	//更新员工
	public int updateInterviewByIid(Interview interview);
	//删除员工
	public  void deleteInterviewById(Integer iid);
	
	public List<Interview> selectInterviewName();
}
