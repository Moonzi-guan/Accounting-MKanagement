<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
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
               width: 100px; 
               font-weight: 400;
                line-height: 20px;
                 text-align: left;	
        	
        	
        }
    </style>
</head>
<body scrolling="yes">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户详细信息</legend>
</fieldset>
 
<form class="layui-form" action="">
        <div class="layui-form-item">
	    <label class="layui-form-label">客户头像</label>
	       <img class="layui-upload-img" name="cpicture" id="cpicture" width="200px" height="280px" src="/picture/${list[0].cpicture}" >
	    </div>
	    
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">姓名：</label>
	    <label class="layui-form-label_3" name="cname" id="cname" >${list[0].cname}</label>      
         <label class="layui-form-label" >性别：</label> 
         <label class="layui-form-label_3" name="csex" id="csex" >${list[0].csex}</label>   
         <label class="layui-form-label">所属公司：</label> 
         <label class="layui-form-label_3" name="ccompony" id="ccompony" >${list[0].ccompony}</label>   
	    </div>

	    <div class="layui-form-item">
	    <label class="layui-form-label">职称：</label>
	    <label class="layui-form-label_3" name="capplicant" id="capplicant" >${list[0].capplicant}</label>  
         <label class="layui-form-label" >联系方式：</label>
         <label class="layui-form-label_3" name="ccontact" id="ccontact" >${list[0].ccontact}</label>  
         <label class="layui-form-label">地址：</label>
         <label class="layui-form-label_3" name="caddr" id="caddr" >${list[0].caddr}</label>  
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">是否在职：</label>     
	    <label class="layui-form-label_3" name="cstatic" id="cstatic" >${list[0].cstatic}</label>  
         <label class="layui-form-label">关联员工：</label> 
         <label class="layui-form-label_3" name="ino" id="ino" >${list[0].ino}</label>  

	    </div>
	    
    	<div class="layui-form-item">
  			<div class="layui-input-block" align="left">
      			<button class="layui-btn" lay-submit="" lay-filter="demo1">返回</button>
    		</div>
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