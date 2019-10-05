package cn.gcf.zhangwuguanli.mapper;

import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.pojo.InterviewExample;
import cn.gcf.zhangwuguanli.utils.Page;
import cn.gcf.zhangwuguanli.utils.ResultMap;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface InterviewMapper {
    int countByExample(InterviewExample example);

    int deleteByExample(InterviewExample example);

    int deleteByPrimaryKey(Integer iid);

    int insert(Interview record);

    int insertSelective(Interview record);

    List<Interview> selectByExample(InterviewExample example);

    Interview selectByPrimaryKey(Integer iid);

    int updateByExampleSelective(@Param("record") Interview record, @Param("example") InterviewExample example);

    int updateByExample(@Param("record") Interview record, @Param("example") InterviewExample example);

    int updateByPrimaryKeySelective(Interview record);

    int updateByPrimaryKey(Interview record);

	List<Interview> selectPageList(Page page);

	int selectPageCount(Page page);
	
	int updateById(Interview record);

	List<Interview> selectName();

	
}