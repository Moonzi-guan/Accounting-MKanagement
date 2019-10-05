package cn.gcf.zhangwuguanli.mapper;

import cn.gcf.zhangwuguanli.pojo.Userlogin;
import cn.gcf.zhangwuguanli.pojo.UserloginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserloginMapper {
    int countByExample(UserloginExample example);

    int deleteByExample(UserloginExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Userlogin record);

    int insertSelective(Userlogin record);

    List<Userlogin> selectByExample(UserloginExample example);

    Userlogin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByExample(@Param("record") Userlogin record, @Param("example") UserloginExample example);

    int updateByPrimaryKeySelective(Userlogin record);

    int updateByPrimaryKey(Userlogin record);
    
    Userlogin selectLoginUser(Userlogin user);
}