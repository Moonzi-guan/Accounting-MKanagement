package cn.gcf.zhangwuguanli.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.gcf.zhangwuguanli.pojo.Userlogin;
import cn.gcf.zhangwuguanli.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	//验证用户的登陆，并且将用户的登陆信息保存到session当中
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@RequestParam("username") String username ,@RequestParam("password") String password,HttpSession session) {
		Userlogin user = new Userlogin();
		user.setUsername(username);
		user.setPassword(password);
		Userlogin loginUser = loginService.selectLoginUser(user);
		session.setAttribute("username",loginUser.getUsername());
		return "index";
	}
}
