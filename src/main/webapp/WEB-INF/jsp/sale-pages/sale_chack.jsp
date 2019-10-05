<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout 后台大布局 - Layui</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layui.css">
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
  <legend>销售详情</legend>
</fieldset>
 

	    <div class="layui-form-item">
	    <label class="layui-form-label">订单编号：</label>
	    <label class="layui-form-label_3">${list[0].ono}</label>      
         <label class="layui-form-label" >项目名称：</label> 
         <label class="layui-form-label_3" >${list[0].oname}</label>   
         <div class="layui-form-item">
	    <label class="layui-form-label">商品图片</label>
	       <img class="layui-upload-img" id="demo1" width="300px" height="200px"  src="/picture/${list[0].opicture}">
	    </div> 
	    </div>

	    <div class="layui-form-item">
	    <label class="layui-form-label" >商品数量：</label>
	    <label class="layui-form-label_3" >${list[0].onumber}</label>  
         <label class="layui-form-label" >单价：</label>
         <label class="layui-form-label_3" >${list[0].omoney}</label>
         <label class="layui-form-label" >类别：</label>
         <label class="layui-form-label_3" >${list[0].ocategory}</label>  
         <label class="layui-form-label" >总价：</label>
         <label class="layui-form-label_3" >${list[0].osum}</label>  
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label" >客户：</label>     
	    <label class="layui-form-label_3" >${list[0].cname}</label>  
         <label class="layui-form-label" >经手职员：</label> 
         <label class="layui-form-label_3" >${list[0].iname}</label>  
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label" >创建时间：</label>     
	    <label class="layui-form-label_3" >${list[0].onewdate}</label>  
         <label class="layui-form-label" >提交时间：</label> 
         <label class="layui-form-label_3" >${list[0].ofinishdate}</label>  
	    </div>
	    <div class="layui-form-item">
	    <label class="layui-form-label" >地址：</label>     
	    <label class="layui-form-label_3" >${list[0].oaddr}</label>  
 
	    </div>	    
	    
	    <div class="layui-form-item">
  			<div class="layui-input-block" align="left">
      			<button class="layui-btn" lay-submit="" lay-filter="demo1">确定</button>
    		</div>
  		</div>

<script src="${pageContext.request.contextPath}/js/layui.js" charset="utf-8"></script>
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