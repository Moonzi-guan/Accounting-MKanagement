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

<body scrolling="yes">
	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
		<legend>订单创建</legend>
	</fieldset>
	<form class="layui-form" action="${pageContext.request.contextPath }/ordersAdd">
		<input type="hidden" name="opicture"  id="opicture"/>
			<div class="layui-form-item">
				<label class="layui-form-label">账单编号</label>
				<div class="layui-input-inline">
					<input type="text" name="oid" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
				<label class="layui-form-label">订单编号</label>
				<div class="layui-input-inline">
					<input type="text" name="ono" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
				<label class="layui-form-label">项目名称</label>
				<div class="layui-input-inline">
					<input type="text" name="oname" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				</div>
			</div>
			
		<div class="layui-form-item">
			<label class="layui-form-label">商品选择</label>
		    <div class="layui-input-inline">
		      	<select name="oaid" id="oaid" lay-filter="oaid" >
		        <option value="">请选择商品</option>
				<c:forEach items="${apporachList}" var="alist">
		        <option value="${alist.aid}">${alist.aname}</option>
		        </c:forEach>
		      </select>
		    </div>
		<!--图片显示-->
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
			<img class="layui-upload-img" name="apicture" id="apicture" width="300px" height="200px" >
		</div>

			<div class="layui-form-item">
					<label class="layui-form-label">商品数量</label>
					<div class="layui-input-inline">
						<input type="text" name="onumber" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
					</div>
					<label class="layui-form-label">单价</label>
					<div class="layui-input-inline">
						<input type="text" name="omoney" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
					</div>
					<label class="layui-form-label">类别</label>
				<div class="layui-input-inline">
			      	<select name="ocategory" lay-filter="aihao">
					<option value="">请选择类别</option>
					<option value="食品类" selected="">食品类</option>
					<option value="电器类" >电器类</option>
					<option value="服装类">服装类</option>
					<option value="家具类">家具类</option>
				</select>
			   	</div>
			</div>
			
			<div class="layui-form-item">
			<label class="layui-form-label">总价</label>
			<div class="layui-input-inline">
				<input type="text" name="osum" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			
			<label class="layui-form-label">客户</label>
			<div class="layui-input-inline">
				<select name="cname" id="cname" lay-filter="" >
		        <option value="">请选择客户</option>
				<c:forEach items="${customerList}" var="clist">
		        <option value="${clist.cname}">${clist.cname}</option>
		        </c:forEach>
		        </select>
			</div>
			<label class="layui-form-label">联系方式</label>
			<div class="layui-input-inline">
				<input type="text" name="ocontact" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			
			</div>
			
			<div class="layui-form-item">
			<label class="layui-form-label">经手职员</label>
			<div class="layui-input-inline">
				<select name="iname" lay-filter="">
			    <option value="">请选择职员</option>
				<c:forEach items="${interviewList}" var="ilist">
		        <option value="${ilist.iusername}">${ilist.iusername}</option>
		        </c:forEach>
			    </select>
			</div>
			<label class="layui-form-label">创建时间</label>
			<div class="layui-input-inline">
				<input type="text" name="onewdate" id="onewdate" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			<label class="layui-form-label">提交时间</label>
			<div class="layui-input-inline">
				<input type="text" name="ofinishdate" id="ofinishdate" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
			</div>
			</div>
			
			<div class="layui-form-item">
			<label class="layui-form-label">地址</label>
			<div class="layui-input-inline">
				<input type="text" name="oaddr" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
			</div>	
		    </div>
		
	  <div class="layui-form-item">
		<div class="layui-input-block" align="left">
  			<button class="layui-btn" lay-submit="" lay-filter="demo1">提交订单</button>
  			<button type="reset" class="layui-btn layui-btn-primary">重置</button>
		</div>
	</div>
	</form>

</script>
<script src="${pageContext.request.contextPath}/js/layui.js" charset="utf-8"></script>
<script>
	layui.use(['form', 'layedit', 'laydate', 'jquery', 'upload','laydate'], function() {
		var form = layui.form;
			 layer = layui.layer,
			layedit = layui.layedit,
			laydate = layui.laydate;
		var $ = layui.jquery,
			upload = layui.upload;
		
		  laydate.render({
		    elem: '#onewdate',
		    value: new Date(1534766888000)//指定元素
		  });
		  
		  laydate.render({
			    elem: '#ofinishdate',
			    value: new Date(1534766888000)
			   //指定元素
		  });
		
			// 绑定表单下拉框事件
			form.render();
			form.on('select(oaid)', function(data){   
				 var val=data.value;
				//console.info(val);
				//alert(oaid);
				 $.ajax({
		        url:"/apporach/searchPicture",      //请求后台的地址
		        type:"get",//请求方式
		        async: false,
		        contentType:"applicant/json",
		        data:{    					//这里是你要传给后台的data值
		            "oaid":val
		        },
		        dataType:"json",    		//数据类型为json类型
		        success:function(data){    //成功时返回的data值，注意这个data是后台返回的值，上面的data是要传给后台的值
		        	//var data = JSON.parse(data);
		        	var picture = "";
		            if(data.SuccessCode!="0"){    //如果后台返回的data.SuccessCode不等于0执行后面的语句
		            	picture = data.data[0].apicture;  //这里一定要注意的是如何获取数据节点
		            	 $("#apicture").attr("src","/picture/"+picture);
		            	 $("#opicture").attr('value',picture);
		            }else{
		            	layer.msg('图片不存在');
		            }
		        },
		        error:function(){   //请求失败执行的操作
		            layer.msg('图片加载失败');
		        }
		        
		    }); 
				 return false; 
	                       });
	}); 

		    //document.apicture.src=data.value;
		    
		    
		

</script>
</body>

</html>