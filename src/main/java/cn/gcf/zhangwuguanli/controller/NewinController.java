package cn.gcf.zhangwuguanli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import cn.gcf.zhangwuguanli.pojo.Interview;
import cn.gcf.zhangwuguanli.pojo.Newin;
import cn.gcf.zhangwuguanli.service.NewinService;
import cn.gcf.zhangwuguanli.utils.PagesUtils;

@Controller
public class NewinController {

	@Autowired
	private NewinService newinService;
	
	//面试添加功能
	@RequestMapping("/newinAdd")
	public String insertNewin(int nid,String nusername,int nsex ,String napplicant,String ncontact
			,String nedu,String nprofession,String nschool,String nmanning ) {
		Newin newin = new Newin();
		newin.setNid(nid);
		newin.setNusername(nusername);
		newin.setNsex(nsex);
		newin.setNapplicant(napplicant);
		newin.setNcontact(ncontact);
		newin.setNedu(nedu);
		newin.setNprofession(nprofession);
		newin.setNschool(nschool);
		newin.setNmanning(nmanning);
		newinService.insertNewin(newin);
		return "personal-management-pages/newin_add";
	}
	
	//面试查询功能
	@RequestMapping(value="/newin/list",method = RequestMethod.GET)
	@ResponseBody
	public PagesUtils<Newin> selectNewinAll(int page ,int limit) {
		
		return newinService.selectNewin(page, limit);
	}
	
	
	//添加职员
	@RequestMapping(value="/interviewAdd")
	public String insertInterview(int iid ,String iusername
			,int isex,String iapplicant,String icontact,String iedu
			, String ischool, String iprofession, String imanning
			, String iresume, String idetail,@RequestParam("newIpicture") String ipicture
			, String ievaluate, String iexperience, String igrade) {
		Interview interview = new Interview();
		interview.setIid(iid);
		interview.setIusername(iusername);
		interview.setIsex(isex);
		interview.setIapplicant(iapplicant);
		interview.setIcontact(icontact);
		interview.setIedu(iedu);
		interview.setIschool(ischool);
		interview.setIprofession(iprofession);
		interview.setImanning(imanning);
		interview.setIresume(iresume);
		interview.setIdetail(idetail);
		interview.setIstatus(1);
		interview.setIpicture(ipicture);
		interview.setIevaluate(ievaluate);
		interview.setIexperience(iexperience);
		interview.setIgrade(igrade);
		//补全参数status
		interview.setIstatus(1);
		newinService.insertInterview(interview);
		return "personal-management-pages/newin_interview";
	}
	
	
}
