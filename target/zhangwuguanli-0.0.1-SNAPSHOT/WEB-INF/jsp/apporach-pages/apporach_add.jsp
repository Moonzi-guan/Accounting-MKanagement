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
</head>
<style>
        .layui-textarea_1{
        	width: 600px;
        	height: 200px;
        }
</style>
<body scrolling="yes">
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>商品创建</legend>
	</fieldset>
	<form class="layui-form" action="${pageContext.request.contextPath }/apporachAdd">
	<input type="hidden" name="apicture"  id="apicture"/>
		<div class="layui-form-item">
			<label class="layui-form-label">表单编号</label>
			<div class="layui-input-inline">
				<input type="text" name="aid" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">商品编号</label>
			<div class="layui-input-inline">
				<input type="text" name="ano" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">商品名称</label>
			<div class="layui-input-inline">
				<input type="text" name="aname" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
		</div>
		



		<div class="layui-form-item">
			<label class="layui-form-label">商品数量</label>
			<div class="layui-input-inline">
				<input type="text" name="anumber" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>

			<label class="layui-form-label">单价</label>
			<div class="layui-input-inline">
				<input type="text" name="amoney" lay-verify="required"
					placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">类别</label>
			<div class="layui-input-inline">
				<select name="acategory" lay-filter="aihao">
					<option value="">请选择类别</option>
					<option value="食品类" selected="">食品类</option>
					<option value="电器类" >电器类</option>
					<option value="服装类">服装类</option>
					<option value="家具类">家具类</option>
				</select>
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">存储仓库</label>
			<div class="layui-input-inline">
				<select name="awarehouse" lay-filter="aihao">
					<option value="">请选择仓库</option>
					<option value="1号仓库" selected="">1号仓库</option>
					<option value="2号仓库" >2号仓库</option>
					<option value="3号仓库">3号仓库</option>
					<option value="4号仓库">4号仓库</option>
					<option value="5号仓库">5号仓库</option>
				</select>
			</div>
			<label class="layui-form-label">管理员工</label>
			<div class="layui-input-inline">
				<select name="ino" lay-filter="aihao">
		        <option value="">请选择管理员工</option>
				<c:forEach items="${interviewList}" var="list">
		        <option value="${list.iid}">${list.iusername}</option>
		        </c:forEach>
		      </select>
			</div>
		</div>
		<!--图片上传-->
		<div class="layui-form-item">
			<label class="layui-form-label">上传头像</label>
			<div class="layui-upload">
				<button type="button" class="layui-btn" id="test1">选择图片</button>
				<div class="layui-upload-list">
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; <img
						class="layui-upload-img" id="demo1" width="300px" height="200px">
					<p id="demoText"></p>
				</div>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label">商品描述</label>
			<div class="layui-input-block">
				<textarea name="aexpress"  placeholder="请输入内容" class="layui-textarea_1"></textarea>
			</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">商品信息</label>
			<div class="layui-input-block">
				<textarea name="ainformation" placeholder="请输入内容" class="layui-textarea_1"></textarea>
			</div>
		</div>

		<div class="layui-form-item">
			<div class="layui-input-block" align="left">
				<button class="layui-btn" lay-submit="" lay-filter="demo1">提交订单</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
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
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
	</form>


<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
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
	            $('#apicture').attr('value', res.pictureName); 
	        	
	          //如果上传失败
	         //  if(res.code > 0){
	         //    return layer.msg(result);
	         //  }
	          //上传成功
	        }
	        ,error: function(){
	          //演示失败状态，并实现重传
	          var demoText = $('#demoText');
	          demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
	          demoText.find('.demo-reload').on('click', function(){
	            uploadInst.upload();
	          });
	        }
	      });
	
});
</script>
</body>

</html>