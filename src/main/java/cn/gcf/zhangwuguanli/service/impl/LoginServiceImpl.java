package cn.gcf.zhangwuguanli.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.gcf.zhangwuguanli.mapper.UserloginMapper;
import cn.gcf.zhangwuguanli.pojo.Userlogin;
import cn.gcf.zhangwuguanli.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	UserloginMapper loginMapper;
	
	@Override
	public Userlogin selectLoginUser(Userlogin user) {
		if(user.getUsername()!=null) {
			if(user.getPassword()!=null) {
				Userlogin loginUser = loginMapper.selectLoginUser(user);
				if((loginUser.getPassword()).equals(user.getPassword())) {
					return loginUser;
				}else {
					return null;
				}
			}
		}
		return null;
	}

}
