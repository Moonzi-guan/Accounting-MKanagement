<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout 后台大布局 - Layui</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/layui.css">
	   <style>
        .layui-form-label{
            width: 100px;
            line-height: 40px;
            font-weight: 600;
        }
        .layui-form-label_2{
           position: relative;
           float: left;
           display: block;
           padding: 19px 0px; 
           width: 750px; 
           font-weight: 400;
           line-height: 20px;
        }
        .layui-form-label_3{
           position: relative;
           float: left;
           display: block;
              padding: 19px 0px; 
               width: 100px; 
               font-weight: 400;
                line-height: 20px;
                 text-align: left;
        }
        
        a{
          position: relative;
           float: left;
           display: block;
              padding: 19px 0px; 
               width: 200px; 
               font-weight: 400;
                line-height: 20px;
                 text-align: left;	
        	
        	
        }
    </style>
</head>
<body scrolling="yes">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>员工信息</legend>
</fieldset>
 
<form class="layui-form" action="">
        <div class="layui-form-item">
	    <label class="layui-form-label">职员头像</label>
	       <img class="layui-upload-img" name="ipicture" id="ipicture" width="200px" height="280px" src="/picture/${list[0].ipicture}" >
	    </div>
	    
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">姓名：</label>
	    <label class="layui-form-label_3" name="iusername" id="iusername" >${list[0].iusername}</label>      
         <label class="layui-form-label">性别：</label> 
         <label class="layui-form-label_3" name="isex" id="isex" >${list[0].isex}</label>   
         <label class="layui-form-label">在职岗位：</label> 
         <label class="layui-form-label_3" name="iapplicant" id="iapplicant" >${list[0].iapplicant}</label>   
	    </div>

	    <div class="layui-form-item">
	    <label class="layui-form-label">联系方式：</label>
	    <label class="layui-form-label_3" name="icontact" id="icontact" >${list[0].icontact}</label>  
         <label class="layui-form-label">学历：</label>
         <label class="layui-form-label_3" name="iedu" id="iedu" >${list[0].iedu}</label>  
         <label class="layui-form-label">毕业院校</label>
         <label class="layui-form-label_3" name="ischool" id="ischool" >${list[0].ischool}</label>  
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">专业：</label>     
	    <label class="layui-form-label_3" name="iprofession" id="iprofession" >${list[0].iprofession}</label>  
         <label class="layui-form-label">人员类型：</label> 
         <label class="layui-form-label_3" name="imanning" id="imanning" >${list[0].imanning}</label>  
         <label class="layui-form-label">在职状态：</label> 
         <label class="layui-form-label_3" name="istatus" id="istatus" >${list[0].istatus}</label>  
	    </div>
    	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    		  <legend>简历信息</legend>
		</fieldset>
	    <div class="layui-form-item">
	    <label class="layui-form-label">简历</label>        
		<label class="layui-form-label_2" name="iresume" id="iresume" >
		 &nbsp;&nbsp;&nbsp;${list[0].iresume}
		</label>
	    </div>
		
	    <div class="layui-form-item">
	    <label class="layui-form-label">简历详情</label>     
	    <a name="idetail" href="http://localhost:8080/file/${list[0].idetail}">${list[0].idetail}</a>
	    
	    <label class="layui-form-label"  >导师评分</label> 
	    <label class="layui-form-label_3" name="igrade" id="igrade" >${list[0].igrade}</label>  
	    </div>
	    
	   <div class="layui-form-item">
	    <label class="layui-form-label" >导师评语</label>     
	    <label class="layui-form-label_2" name="ievalute" id="ievalute" >
 		&nbsp;&nbsp;&nbsp;${list[0].ievaluate}
		</label>
	    </div>
	    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    		  <legend>在职经历</legend>
		</fieldset>
	    <div class="layui-form-item">
	    <label class="layui-form-label">在职经历</label>     
	    <label class="layui-form-label_2" name="iexperience" id="iexperience" >
  		&nbsp;&nbsp;&nbsp;${list[0].iexperience} 
		</label>
	    </div>
  		<!-- 下面用于顶格用 -->
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
</form>

<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<script>
layui.use(['form', 'layedit', 'laydate','jquery','upload'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
    var $ = layui.jquery
  ,upload = layui.upload;
});
</script>
</body>
</html>