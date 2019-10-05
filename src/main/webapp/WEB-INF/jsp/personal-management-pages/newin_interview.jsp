<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>layout - Layui</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/layui.css">
</head>
<style>
        .layui-textarea_1{
        	width: 600px;
        	height: 200px;
        }
</style>
<body scrolling="yes">
              
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>新员工入职</legend>
</fieldset>
 
<form class="layui-form" action="${pageContext.request.contextPath }/interviewAdd" enctype="multipart/form-data">
<input type="hidden" name="newIpicture"  id="newIpicture"> </input>
    <div class="layui-form-item">
    	 <label class="layui-form-label">编号</label>
	    <div class="layui-input-inline">
	      <input type="text" name="iid" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    
	    <label class="layui-form-label">姓名</label>
	    <div class="layui-input-inline">
	      <input type="text" name="iusername" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    
	    <label class="layui-form-label">性别</label>
	    <div class="layui-input-inline">
	      <input type="radio" name="isex" value="0" title="男" checked>
	      <input type="radio" name="isex" value="1" title="女" >
	    </div>
	     </div>
	     
	     <div class="layui-form-item">
		<label class="layui-form-label">应聘职位</label>
	    <div class="layui-input-inline">
	      <select name="iapplicant" lay-filter="aihao">
	        <option value=" ">请选择</option>
	        <option value="程序员" selected="">程序员</option>
	        <option value="工程师">工程师</option>
	        <option value="主管">主管</option>
	        <option value="项目经理">项目经理</option>
	      </select>
	    </div>
	    
	    <label class="layui-form-label">联系方式</label>
	    <div class="layui-input-inline">
	      <input type="text" name="icontact" lay-verify="required" placeholder="请输入"  class="layui-input">
	    </div>
	    
    	 <label class="layui-form-label">学历</label>
	     <div class="layui-input-inline">
	      <select name="iedu" lay-filter="aihao">
	        <option value=" ">请选择</option>
	        <option value="高中" selected="">高中</option>
	        <option value="大专">大专</option>
	        <option value="本科">本科</option>
	        <option value="研究生及以上">研究生及以上</option>
	      </select>
	    </div>
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">毕业院校</label>
	    <div class="layui-input-inline">
	      <input type="text" name="ischool" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    
	    <label class="layui-form-label">专业</label>
	    <div class="layui-input-inline">
	      <input type="text" name="iprofession" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	      
	    <label class="layui-form-label">人员类型</label>
	    <div class="layui-input-inline">
	      	<select name="imanning" lay-filter="aihao">
	        <option value="">请选择</option>
	        <option value="编程人员" selected="">编程人员</option>
	        <option value="管理人员" >管理人员</option>
	        <option value="维护人员">维护人员</option>
	      </select>
	    </div>
    </div>
    
    <div class="layui-form-item">
    <label class="layui-form-label">简历</label>
    <div class="layui-input-block">
      <textarea name="iresume" placeholder="请输入内容" class="layui-textarea_1"></textarea>
    </div>
    </div>
    
   <div class="layui-form-item">
   	<label class="layui-form-label">简历详情</label>
	<div class="layui-upload" >
	  <button type="button" name="idetail" class="layui-btn layui-btn-normal" id="test8">选择文件</button>
	  <button type="button" class="layui-btn" id="test9">开始上传</button>
	</div>
  </div>
  <!--图片上传-->
  <div class="layui-form-item">
  	<label class="layui-form-label">上传头像</label>
  <div class="layui-upload">
    <button type="button" class="layui-btn" id="test1">选择图片</button>
	  <div class="layui-upload-list">
	    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
	    <img class="layui-upload-img" id="demo1" width="300px" height="350px"  >
	    <p id="demoText"></p>
    </div>
  </div>
  </div>   
  
    <div class="layui-form-item layui-form-text">
    <label class="layui-form-label">导师评价</label>
    <div class="layui-input-block">
      <textarea name="ievaluate" placeholder="请输入内容" class="layui-textarea_1"></textarea>
    </div>
    </div>
    <div class="layui-form-item">
	<label class="layui-form-label">导师评分</label>
    <div class="layui-input-inline">
      <input type="text" name="igrade" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
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
	<iframe src="${pageContext.request.contextPath}/personal-management-pages/newin2" frameborder="0" width="99%" height="500px"></iframe>
</div>
<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<script>
layui.use(['form', 'layedit', 'laydate','jquery','upload'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
    var $ = layui.jquery
  ,upload = layui.upload;
  
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
        $('#newIpicture').attr('value', res.pictureName); 
    	
      //如果上传失败

      
//       if(res.code > 0){
//         return layer.msg(result);
//       }
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
  
  //选完文件后不自动上传
  upload.render({
    elem: '#test8'
    ,url: '/upload/file'
    ,field:'idetail'
    ,accept: 'file' //普通文件
    ,auto: false
    ,multiple: false
    ,bindAction: '#test9'
    ,size: 1024*40
    ,done: function(res){
      if(res.msg!=true){
    	  layer.msg(result.msg, {icon:1});
      }else if(result.msg == true){
      	layer.msg("上传成功!",{icon:1});
          }else{
          	layer.msg("上传失败，文件必须为文档!",{icon:1});
      }
    }
});
});
</script>
</body>
</html>