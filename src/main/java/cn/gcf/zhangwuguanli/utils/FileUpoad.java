package cn.gcf.zhangwuguanli.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class FileUpoad {
	//图片上传
		@RequestMapping(value = "/upload/picture", method = RequestMethod.POST)
	    @ResponseBody
	    public ReturnResult uploadPicture(@RequestParam("ipicture") MultipartFile file) {
			ReturnResult rr=new ReturnResult();
	        try {
	            if (file != null) {
	                //获取文件名
	                String fileName = file.getOriginalFilename();
	                //截取扩展名
	                String extName = fileName.substring(fileName.lastIndexOf("."));
	                List list = new ArrayList();
	                list.add(".jpg");
	                list.add(".png");
	                list.add(".jpeg");
	                list.add(".gif");
	                if(list.contains(extName.toLowerCase())){
	                
	                    //01获取服务器项目部署的路径，并在根目录下创建 myphoto 目录
	                    //String realPath = session.getServletContext().getRealPath("myphoto");
	                    //02也可以直接定义文件路径
	                    String realPath = "E:\\picture";
	                    //这里直接用图片原来的名字
	                    String photoFileName = fileName;
	                    file.transferTo(new File(realPath,photoFileName));
	                    
	                    rr.setCode(1);//成功
	                    rr.setPictureName(fileName);
	                }else {
	                    rr.setCode(-1);//文件类型不正确
	                    rr.setPictureName("");
	                }
	            }else {
	                   rr.setCode(0);//上传文件为空
	                   rr.setPictureName("");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            //上传异常
	        }
	        return rr;
	    }

		//文件上
		@RequestMapping(value = "/upload/file", method = RequestMethod.POST)
	    @ResponseBody
	    public FileUploadReturn uploadFile(@RequestParam("idetail") MultipartFile file) {
			FileUploadReturn filemsg = new FileUploadReturn();
			int index = file.getOriginalFilename().lastIndexOf(".");
			String fileName = file.getOriginalFilename().substring(0, index);
			//获取后缀的名字
			String suffixNamefile = file.getOriginalFilename().substring(index);
			if(!suffixNamefile.equals(".doc")||!suffixNamefile.equals(".docx")||!suffixNamefile.equals(".pdf")) {
				filemsg.setMsg(false);//如不是以上格式的后缀则返回false;
			}
	         try {     		
	    		 String realPath = "E:\\file";
	    		 String FileName =fileName+suffixNamefile;
				file.transferTo(new File(realPath,FileName));
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
	         
			return filemsg;
		}
}
