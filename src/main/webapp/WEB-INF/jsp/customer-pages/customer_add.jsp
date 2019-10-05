<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<title>layout 后台大布局 - Layui</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layui.css">
	</head>

	<body scrolling="yes">
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
			<legend>客户创建</legend>
		</fieldset>
		<form class="layui-form" action="${pageContext.request.contextPath}/customer/add">
		<!--图片上传hidden域  -->
		<input type="hidden" name="cpicture"  id="cpicture"> </input>
			<!--图片上传-->
			<div class="layui-form-item">
				<label class="layui-form-label">上传头像</label>
				<div class="layui-upload">
					<button type="button" class="layui-btn" id="test1">选择图片</button>
					<div class="layui-upload-list">
						&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
						<img class="layui-upload-img" id="demo1" width="300px" height="350px">
						<p id="demoText"></p>
					</div>
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">客户编号</label>
				<div class="layui-input-inline">
					<input type="text" name="cid" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			
				<label class="layui-form-label">姓名</label>
				<div class="layui-input-inline">
					<input type="text" name="cname" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>

				<label class="layui-form-label">性别</label>
				<div class="layui-input-inline">
					<input type="radio" name="csex" value="0" title="男" checked>
					<input type="radio" name="csex" value="1" title="女" >
				</div>
				</div>
				
				<div class="layui-form-item">
				<label class="layui-form-label">所属公司</label>
				<div class="layui-input-inline">
					<input type="text" name="ccompony" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			
				<label class="layui-form-label">职称</label>
				<div class="layui-input-inline">
					<input type="text" name="capplicant" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
				<label class="layui-form-label">联系方式</label>
				<div class="layui-input-inline">
					<input type="text" name="ccontact" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
				</div>
				
				<div class="layui-form-item">
				<label class="layui-form-label">地址</label>
				<div class="layui-input-inline">
					<input type="text" name="caddr" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			
				<label class="layui-form-label">是否在职</label>
				<div class="layui-input-inline">
				<select name="cstatic" lay-filter="aihao">
			        <option value="">请选择在职状态</option>
			        <option value="0">是</option>
			        <option value="1">否</option>
		      	</select>
	     </div>
				<label class="layui-form-label">关联员工</label>
				<div class="layui-input-inline">
				<select name="ino" lay-filter="aihao">
		        <option value="">请选择关联员工</option>
				<c:forEach items="${interviewList}" var="list">
		        <option value="${list.iid}">${list.iusername}</option>
		        </c:forEach>
		      </select>
	      </div>
			</div>
			
		  <div class="layui-form-item">
  			<div class="layui-input-block" align="left">
      			<button class="layui-btn" lay-submit="" lay-filter="demo1">提交更改</button>
      			<button class="layui-btn" lay-submit="" lay-filter="demo1">返回</button>
      			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
    		</div>
  		</div>

		</form>
		<script src="${pageContext.request.contextPath}/js/layui.js" charset="utf-8"></script>
		<script>
			layui.use(['form', 'layedit', 'laydate', 'jquery', 'upload'], function() {
				var form = layui.form,
					layer = layui.layer,
					layedit = layui.layedit,
					laydate = layui.laydate;
				var $ = layui.jquery,
					upload = layui.upload;
				//普通图片上传
				var uploadInst = upload.render({
			    elem: '#test1'
			    ,url: '/upload/picture'
			    ,field:'ipicture'
			    ,before: function(obj){
			      //预读本地文件示例，不支持ie8
			      obj.preview(function(index, file, result){
			        $('#demo1').attr('src', result); //图片链接（base64）
			      });
			    }
			    ,done: function(res,result){
			        $('#cpicture').attr('value', res.pictureName); 
			    },
					error: function() {
						//演示失败状态，并实现重传
						var demoText = $('#demoText');
						demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
						demoText.find('.demo-reload').on('click', function() {
							uploadInst.upload();
						});
					}
				});
				
			});
		</script>
	</body>

</html>