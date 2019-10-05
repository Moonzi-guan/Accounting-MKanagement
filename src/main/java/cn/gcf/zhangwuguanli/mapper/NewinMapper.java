package cn.gcf.zhangwuguanli.mapper;

import cn.gcf.zhangwuguanli.pojo.Newin;
import cn.gcf.zhangwuguanli.pojo.NewinExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface NewinMapper {
    int countByExample(NewinExample example);

    int deleteByExample(NewinExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Newin record);

    int insertSelective(Newin record);

    List<Newin> selectByExample(NewinExample example);

    Newin selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Newin record, @Param("example") NewinExample example);

    int updateByExample(@Param("record") Newin record, @Param("example") NewinExample example);

    int updateByPrimaryKeySelective(Newin record);

    int updateByPrimaryKey(Newin record);

	Long queryCount();

	List<Newin> queryData(Map<String, Integer> map);
}