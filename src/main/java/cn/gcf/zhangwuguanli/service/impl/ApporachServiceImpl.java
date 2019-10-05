package cn.gcf.zhangwuguanli.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gcf.zhangwuguanli.mapper.ApporachMapper;
import cn.gcf.zhangwuguanli.mapper.InterviewMapper;
import cn.gcf.zhangwuguanli.pojo.Apporach;
import cn.gcf.zhangwuguanli.pojo.ApporachExample;
import cn.gcf.zhangwuguanli.pojo.ApporachExample.Criteria;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.service.ApporachService;
import cn.gcf.zhangwuguanli.utils.Page;

@Service
public class ApporachServiceImpl implements ApporachService {

	@Autowired
	InterviewMapper interviewMapper;
	@Autowired
	ApporachMapper apporachMapper;
	
	@Override
	public int insertApporach(Apporach apporach) {
		return apporachMapper.insert(apporach);
	}

	//查询关联职员的信息
	@Override
	public List<Interview> selectInterview() {
		List<Interview> interviewList = interviewMapper.selectByExample(null);
		return interviewList;
	}

	@Override
	public List<Apporach> selectPageList(Page page) {
		return apporachMapper.selectPageList(page);
	}

	@Override
	public int selectPageCount(Page page) {
		return apporachMapper.selectPageCount(page);
	}

	@Override
	public List<Apporach> selectApporachByAid(int aid) {
		ApporachExample example = new ApporachExample();
		Criteria criteria = example.createCriteria();
		criteria.andAidEqualTo(aid);
		List<Apporach> list = apporachMapper.selectByExample(example);
		return list;
	}

	@Override
	public void deleteApporachByAId(Integer aid) {
		apporachMapper.deleteByPrimaryKey(aid);
	}

	@Override
	public List<Apporach> selectApporachAll() {
		List<Apporach> list = apporachMapper.selectByExample(null);
		return list;
	}

}
