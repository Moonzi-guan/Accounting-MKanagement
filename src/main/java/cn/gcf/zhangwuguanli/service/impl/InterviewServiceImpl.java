package cn.gcf.zhangwuguanli.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.gcf.zhangwuguanli.mapper.InterviewMapper;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.pojo.InterviewExample;
import cn.gcf.zhangwuguanli.pojo.InterviewExample.Criteria;
import cn.gcf.zhangwuguanli.pojo.InterviewSearchPojo;
import cn.gcf.zhangwuguanli.service.InterviewService;
import cn.gcf.zhangwuguanli.utils.Page;
import cn.gcf.zhangwuguanli.utils.PagesUtils;

@Service
public class InterviewServiceImpl implements InterviewService {

	@Autowired
	InterviewMapper interviewMapper;
	
	//按条件查询
	@Override
	public List<Interview> selectPageList(Page page) {
		return interviewMapper.selectPageList(page);
	}
	//查询总条数
	@Override
	public int selectPageCount(Page page) {
		return interviewMapper.selectPageCount(page);
	}
	@Override
	public List<Interview> selectInterviewByIid(int iid) {
		
		InterviewExample example = new InterviewExample();
		Criteria criteria = example.createCriteria();
		criteria.andIidEqualTo(iid);
		List<Interview> list = interviewMapper.selectByExample(example);
		return list;
	}
	//更新员工信息
	@Override
	public int updateInterviewByIid(Interview interview) {
		return interviewMapper.updateById(interview);
	}
	@Override
	public void deleteInterviewById(Integer iid) {
		interviewMapper.deleteByPrimaryKey(iid);
	}
	@Override
	public List<Interview> selectInterviewName() {
		return interviewMapper.selectName();
	}

}
