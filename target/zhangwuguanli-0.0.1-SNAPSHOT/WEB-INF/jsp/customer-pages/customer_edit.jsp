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
.layui-form-label_2 {
	position: relative;
	float: left;
	display: block;
	padding: 9px 0px;
	width: 750px;
	font-weight: 400;
	line-height: 20px;
}

.layui-form-label_3 {
	position: relative;
	float: left;
	display: block;
	padding: 9px 0px;
	width: 100px;
	font-weight: 400;
	line-height: 20px;
	text-align: left;
}

.layui-textarea_1 {
	width: 800px;
	height: 200px;
}

a {
	position: relative;
	float: left;
	display: block;
	padding: 9px 0px;
	width: 100px;
	font-weight: 400;
	line-height: 20px;
	text-align: left;
}

.layui-layer-btn0{
   width:30px;
}
 .layui-layer-btn1{
  width:30px
}
</style>
</head>
<body scrolling="yes">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户信息修改</legend>
</fieldset>
 
<form class="layui-form" action="${pageContext.request.contextPath }/customer/editCustomer" id="changeForm">
        <input type="hidden" name="cid" id="cid" value="${list[0].cid}"/>
        <div class="layui-form-item">
	    <label class="layui-form-label">客户头像</label>
	       <img class="layui-upload-img" width="300px" height="200px"  src="/picture/${list[0].cpicture}">
	    </div>	   
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">姓名：</label>
	    <div class="layui-input-inline">
	      <input type="text" name="cname" value="${list[0].cname}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    <label class="layui-form-label">性别</label>
	    <div class="layui-input-inline">
	      <input type="radio" value="${list[0].csex}" name="csex" title="男" checked>
	      <input type="radio" value="${list[0].csex}" name="csex" title="女" >
	    </div> 
         <label class="layui-form-label" >所属公司：</label> 
        	    <div class="layui-input-inline">
	      <input type="text" name="ccompony"  value="${list[0].ccompony}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
	    </div>

	    <div class="layui-form-item">
	    <label class="layui-form-label">职称：</label>
	    	    <div class="layui-input-inline">
	      <input type="text"  name="capplicant" value="${list[0].capplicant}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
         <label class="layui-form-label">联系方式：</label>
         	    <div class="layui-input-inline">
	      <input type="text" name="ccontact"  value="${list[0].ccontact}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
         <label class="layui-form-label">地址：</label>
         	    <div class="layui-input-inline">
	      <input type="text" name="caddr"  value="${list[0].caddr}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label" >是否在职：</label>   
	    <div class="layui-input-inline">
				<select name="cstatic" lay-filter="aihao">
					<c:if test="${list[0].cstatic == 0}">
	                <option value="${list[0].cstatic}" selected="selected">是</option>
					<option value="1">否</option>
	            	</c:if>
					<c:if test="${list[0].cstatic == 1}">
					<option value="0">是</option>
	                <option value="${list[0].cstatic}" selected="selected">否</option>
	            	</c:if>
		      	</select> 
		</div>
		      	
         <label class="layui-form-label" >关联员工：</label> 
         <div class="layui-input-inline">
				<select name="ino" lay-filter="aihao">
		       	<option value="${CIList[0].ino}">${CIList[0].iusername}</option>
				<c:forEach items="${interviewList}" var="list">
		        <option value="${list.iid}">${list.iusername}</option>
		        </c:forEach>
		      </select>
	      </div>

	    </div>
  		
  		<div class="layui-form-item">
  			<div class="layui-input-block" align="left">
      			<button class="layui-btn" lay-submit="" lay-filter="editCustomer">提交更改</button>
      			<button class="layui-btn" lay-submit="" lay-filter="demo1">返回</button>
      			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
    		</div>
  		</div>
</form>

<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<script>
layui.use('form',function(){
	  var $ = layui.jquery
	  ,form = layui.form;

	form.on('submit(editCustomer)', function(data) {
			layui.layer.confirm('是否提交请求?', {
				icon : 1,
				title : '提示',
				btn : [ '确定', '取消' ]
			},function(index) {
				$("#changeForm").submit();
				var index = parent.layer.getFrameIndex(window.name);
				window.parent.location.reload();//刷新父页面
				parent.layer.close(index);//关闭当前页
				//return false;
			}, function() {

				layer.msg('已取消..');
				return false;
			});
			return false;
		});
	});
</script>
</body>
</html>