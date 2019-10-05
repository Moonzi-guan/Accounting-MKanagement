<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout 后台大布局 - Layui</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/layui.css">
</head>
<body scrolling="yes">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>新员工入职</legend>
</fieldset>
 
<form class="layui-form" action="${pageContext.request.contextPath }/newinAdd">
    <div class="layui-form-item">
	    <label class="layui-form-label">编号</label>
	    <div class="layui-input-inline">
	      <input type="text" name="nid" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	      
	    <label class="layui-form-label">姓名</label>
	    <div class="layui-input-inline">
	      <input type="text" name="nusername" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    
	    <label class="layui-form-label">联系方式</label>
	    <div class="layui-input-inline">
	      <input type="text" name="ncontact" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
		</div>
		
		<div class="layui-form-item">
	    <label class="layui-form-label">毕业院校</label>
	    <div class="layui-input-inline">
	      <input type="text" name="nschool" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    
	     
	    <label class="layui-form-label">性别</label>
	    <div class="layui-input-inline">
	      <input type="radio" name="nsex" value="0" title="男" checked>
	      <input type="radio" name="nsex" value="1" title="女" >
	    </div>
      
    	 <label class="layui-form-label">学历</label>
	    <div class="layui-input-inline">
	      <select name="nedu" lay-filter="aihao">
	        <option value=" ">请选择</option>
	        <option value="高中" selected="">高中</option>
	        <option value="大专">大专</option>
	        <option value="本科">本科</option>
	        <option value="研究生及以上">研究生及以上</option>
	      </select>
	    </div>
	     </div>
	     
	     <div class="layui-form-item">
	    <label class="layui-form-label">专业</label>
	    <div class="layui-input-inline">
	      <input type="text" name="nprofession" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    
	    <label class="layui-form-label">应聘职位</label>
	    <div class="layui-input-inline">
	      <select name="napplicant" lay-filter="aihao">
	        <option value=" ">请选择</option>
	        <option value="程序员" selected="">程序员</option>
	        <option value="工程师">工程师</option>
	        <option value="主管">主管</option>
	        <option value="项目经理">项目经理</option>
	      </select>
	    </div>

	    <label class="layui-form-label">人员类型</label>
	    <div class="layui-input-inline">
	      	<select name="nmanning" lay-filter="aihao">
	        <option value="">请选择</option>
	        <option value="编程人员" selected="">编程人员</option>
	        <option value="管理人员" >管理人员</option>
	        <option value="维护人员">维护人员</option>
	      </select>
	    </div>
 		</div>
    
    <div class="layui-form-item">
    <div class="layui-input-block" align="left">
      <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
    </div>
  </div>
</form>

<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>未筛选人员</legend>
</fieldset>
<div >
	<iframe src="${pageContext.request.contextPath}/personal-management-pages/newin" frameborder="0" width="99%" height="550px"></iframe>
</div>
<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
});
</script>
</body>
</html>