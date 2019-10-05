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
        .layui-form-label_2{
           position: relative;
           float: left;
           display: block;
           padding: 9px 0px; 
           width: 750px; 
           font-weight: 400;
           line-height: 20px;
        }
        .layui-form-label_3{
           position: relative;
           float: left;
           display: block;
              padding: 9px 0px; 
               width: 100px; 
               font-weight: 400;
                line-height: 20px;
                 text-align: left;
        }
        .layui-textarea_1{
        	width: 800px;
        	height: 200px;
        }
        a{
          position: relative;
           float: left;
           display: block;
              padding: 9px 0px; 
               width: 200px; 
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
  <legend>员工信息</legend>
</fieldset>
 
<form class="layui-form" id="changeForm" action="${pageContext.request.contextPath }/interview/eidtInterview">
		<input type="hidden" name="iid" id="iid" value="${list[0].iid}"/>
        <div class="layui-form-item">
	    <label class="layui-form-label">职员头像</label>
	       <img class="layui-upload-img" src="/picture/${list[0].ipicture}" id="ipicture" width="200px" height="280px"  >
	    </div>	   
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">姓名：</label>
	    <div class="layui-input-inline">
	      <input type="text" name="iusername" id="iusername" value="${list[0].iusername}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>
	    <label class="layui-form-label">性别</label>
	    <div class="layui-input-inline">
	      <input type="radio" name="isex" value="0" title="男" checked>
	      <input type="radio" name="isex" value="1" title="女" >
	    </div>
         <label class="layui-form-label">在职岗位：</label> 
        	    <div class="layui-input-inline">
	      <input type="text" name="iapplicant" value="${list[0].iapplicant}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
	    </div>

	    <div class="layui-form-item">
	    <label class="layui-form-label">联系方式：</label>
	    	    <div class="layui-input-inline">
	      <input type="text" name="icontact" value="${list[0].icontact}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
         <label class="layui-form-label">学历：</label>
         	    <div class="layui-input-inline">
	      <input type="text" name="iedu" value="${list[0].iedu}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
         <label class="layui-form-label">毕业院校</label>
         	    <div class="layui-input-inline">
	      <input type="text" name="ischool" value="${list[0].ischool}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
	    </div>
	    
	    <div class="layui-form-item">
	    <label class="layui-form-label">专业：</label>     
	    	    <div class="layui-input-inline">
	      <input type="text" name="iprofession" value="${list[0].iprofession}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
         <label class="layui-form-label">人员类型：</label> 
         	    <div class="layui-input-inline">
	      <input type="text" name="imanning" value="${list[0].imanning}" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
	    </div>  
         <label class="layui-form-label">在职状态：</label> 
         	    <div class="layui-input-inline">
	      		<select name="istatus" lay-filter="aihao">
					<c:if test="${list[0].istatus == 0}">
	                <option value="${list[0].istatus}" selected="selected">是</option>
					<option value="1" >否</option>	
	            	</c:if>
					<c:if test="${list[0].istatus == 1}">
					<option value="0" >是</option>
	                <option value="${list[0].istatus}" selected="selected">否</option>
	            	</c:if>
		      	</select>
	    </div>  
	    </div>
    	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    		  <legend>简历信息</legend>
		</fieldset>
	    <div class="layui-form-item">
	    <label class="layui-form-label">简历</label>        
		<label class="layui-form-label_2" name="iresume" value="${list[0].iresume}">
		 &nbsp;&nbsp;&nbsp;${list[0].iresume}
		</label>
	    </div>
		
	    <div class="layui-form-item">
	    <label class="layui-form-label">简历详情</label>     
	    <a name="idetail"  href="http://localhost:8080/file/${list[0].idetail}">${list[0].idetail}</a>
	    
	    <label class="layui-form-label">导师评分</label> 
	    <label class="layui-form-label_3" name="igrade"  id="igrade" >${list[0].igrade}</label>  
	    </div>
	    
	   <div class="layui-form-item">
	    <label class="layui-form-label">导师评语</label>     
	    <label class="layui-form-label_2" name="ievaluate" id="ievaluate">
	    &nbsp;&nbsp;&nbsp;${list[0].ievaluate}
		</label>
	    </div>
	    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    		  <legend>在职经历</legend>
		</fieldset>
	    <div class="layui-form-item">
	    <label class="layui-form-label">在职经历</label>
	    <div class="layui-input-block">
         <textarea name="iexperience" id="iexperience" placeholder="请输入内容" class="layui-textarea_1">${list[0].iexperience}</textarea>
    	</div>
	    </div>
	    
  		<div class="layui-form-item">
  			&nbsp;&nbsp;&nbsp;
  		</div>
  		
  		<div class="layui-form-item">
  			<div class="layui-input-block" align="left">
      			<button class="layui-btn" lay-submit lay-filter="editInterview" >提交更改</button>
      			<button class="layui-btn" lay-submit lay-filter="">返回</button>
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

</form>

<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<script>
layui.use('form',function(){
	  var $ = layui.jquery
	  ,form = layui.form;

/* 	form.on('submit(editInterview)', function(data) {
		    layer.confirm("是否提交请求",function(){
		    	
		    });
			var index = parent.layer.getFrameIndex(window.name);
			parent.layer.close(index);//关闭当前页
			return false;
		}); */
	

	form.on('submit(editInterview)', function(data) {
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