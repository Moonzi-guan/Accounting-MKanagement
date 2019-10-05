package cn.gcf.zhangwuguanli.mapper;

import cn.gcf.zhangwuguanli.pojo.Apporach;
import cn.gcf.zhangwuguanli.pojo.ApporachExample;
import cn.gcf.zhangwuguanli.utils.Page;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApporachMapper {
    int countByExample(ApporachExample example);

    int deleteByExample(ApporachExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Apporach record);

    int insertSelective(Apporach record);

    List<Apporach> selectByExample(ApporachExample example);

    Apporach selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Apporach record, @Param("example") ApporachExample example);

    int updateByExample(@Param("record") Apporach record, @Param("example") ApporachExample example);

    int updateByPrimaryKeySelective(Apporach record);

    int updateByPrimaryKey(Apporach record);

	List<Apporach> selectPageList(Page page);

	int selectPageCount(Page page);
}