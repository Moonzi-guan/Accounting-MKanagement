package cn.gcf.zhangwuguanli.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gcf.zhangwuguanli.mapper.InterviewMapper;
import cn.gcf.zhangwuguanli.mapper.NewinMapper;
import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.pojo.Newin;
import cn.gcf.zhangwuguanli.service.NewinService;
import cn.gcf.zhangwuguanli.utils.PagesUtils;

@Service
public class NewinServiceImpl implements NewinService {

	@Autowired
	NewinMapper newinMapper;
	@Autowired
	InterviewMapper interviewMapper;

	//添加功能
	@Override
	public int insertNewin(Newin newin) {
		return newinMapper.insert(newin);
	}
	
	
	@Override
	public List<Newin> selectNewinList() {
		List<Newin> list = newinMapper.selectByExample(null);
		return list;
	}
	//实现查询
	@Override
	public PagesUtils<Newin> selectNewin(int page, int limit) {
		PagesUtils<Newin> pageutils = new PagesUtils<Newin>();
		List<Newin> list ;
		page=(page-1)*limit;
        try {
        	pageutils.setCode(0);
            Long num = newinMapper.queryCount();
            pageutils.setCount(num);//获取记录总数
            Map<String,Integer> map = new HashMap<>();
            map.put("page",page);//从第几页开始
            map.put("limit",limit);//每页显示多少条记录
            list = newinMapper.queryData(map);
            pageutils.setData(list);
            pageutils.setMsg("请求成功");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return pageutils;

	}
	//添加新职员
	@Override
	public int insertInterview(Interview interview) {
		return interviewMapper.insert(interview);
	}
	

}
