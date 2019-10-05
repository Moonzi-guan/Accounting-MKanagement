<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta charset="utf-8">
  <title>layui</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${pageContext.request.contextPath }/css/layui.css"  media="all">
        
</style>
  
</head>
<body>  
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>销售列表</legend>
</fieldset>
	
 <div class="layui-form-item">
	<label class="layui-form-label">&emsp;</label>
	<div class="layui-input-inline">
		<input type="text" name="searchCode" id="searchReload" value="" placeholder="请输入订单编号" autocomplete="off" class="layui-input">
	</div>
	<button class="layui-btn" data-type="reload" >查询订单编号</button>
	</div>
<table class="layui-hide" id="test" lay-filter="test"></table>
 
<script type="text/html" id="toolbarDemo">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
  </div>
</script>
 
<script type="text/html" id="barDemo">
		<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看详情</a>
		  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
              
          
<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>
layui.use('table', function(){
  var table = layui.table;
  table.render({
	    elem: '#test'
	    ,url:'/orders/bill'
	    ,toolbar: '#toolbarDemo'
	    ,title: '用户数据表'
	  	,method:'get'
	  	,id:'contenttable'
	  	,limit:'14'
	  	,limits:[10,20,30]
	    ,height:690
	  	,request: {
	  	   	    pageName: 'page' //页码的参数名称，默认：page
	  	   	    ,limitName: 'limit' //每页数据量的参数名，默认：limit
	  	   	  }
	 	,parseData: function(res){ //res 即为原始返回的数据
	  		    return {
	  		      "code": res.code, //解析接口状态
	  		      "msg": res.msg, //解析提示文本
	  		      "count": res.count, //解析数据长度
	  		      "data": res.data //解析数据列表
	  		    };
	       	}
	    ,cols: [[
	      {type: 'checkbox', fixed: 'left'}
	      ,{field:'oid', title:'编号', minwidth:80, unresize: true, sort: true}
	      ,{field:'ono', title:'订单编号', minwidth:120}
	      ,{field:'iname', title:'经手职员', minwidth:150}
	      ,{field:'oname', title:'项目名称', minwidth:80, sort: true}
	      ,{field:'oaid', title:'创建时间', minwidth:100}
	      ,{field:'omoney', title:'结算时间', minwidth:100}
	      ,{field:'onumber', title:'商品名称', minwidth:80, sort: true}
	      ,{field:'osum', title:'单价', minwidth:120}
	      ,{field:'osum', title:'数量', minwidth:120}
	      ,{field:'ofinishdate', title:'总价', minwidth:100, sort: true}
	      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:200}
	    ]]
	    ,page: true
	  });
  
//搜索框的参数获取
  var $ = layui.$, active = {
  reload:function () {
      var searchReload=$("#searchReload").val();
      table.reload('contenttable',{
          method:'get',
         where:{searchCode:searchReload}
      });
    }
  };
  $('.layui-btn').on('click', function () {
      var type = $(this).data('type');
      active[type] ? active[type].call(this) : '';
  });
  
  
  //头工具栏事件
  table.on('toolbar(test)', function(obj){
    var checkStatus = table.checkStatus(obj.config.id);
    switch(obj.event){
      case 'getCheckData':
        var data = checkStatus.data;
        layer.alert(JSON.stringify(data));
      break;
      case 'getCheckLength':
        var data = checkStatus.data;
        layer.msg('选中了：'+ data.length + ' 个');
      break;
      case 'isAll':
        layer.msg(checkStatus.isAll ? '全选': '未全选');
      break;
    };
  });
  
  //单击行勾选checkbox事件
  $(document).on("click",".layui-table-body table.layui-table tbody tr", function () {
   var index = $(this).attr('data-index');
   var tableBox = $(this).parents('.layui-table-box');
   //存在固定列
   if (tableBox.find(".layui-table-fixed.layui-table-fixed-l").length>0) {
    tableDiv = tableBox.find(".layui-table-fixed.layui-table-fixed-l");
   } else {
    tableDiv = tableBox.find(".layui-table-body.layui-table-main");
   }
   var checkCell = tableDiv.find("tr[data-index=" + index + "]").find("td div.laytable-cell-checkbox div.layui-form-checkbox I");
   if (checkCell.length>0) {
    checkCell.click();
   }
  });
   
  $(document).on("click", "td div.laytable-cell-checkbox div.layui-form-checkbox", function (e) {
   e.stopPropagation();
  });
  
  
  //监听行工具事件
  table.on('tool(test)', function(obj){
    var data = obj.data;
    //console.log(obj)
   if(obj.event === 'detail'){
	      layer.open({
	        	type:2,
	        	content:'${pageContext.request.contextPath }/orders/check?oid='+data.oid,
	        	area: ['1000px', '800px'],
	        	maxmin: true,
	        	shadeClose: true,
	        	offset: '5px'
	        });
	        layer.msg('ID：'+ data.oid + ' 的查看操作');
	        
	      } else if(obj.event === 'del'){
	        layer.confirm('真的删除行么', function(index){
	          $.ajax({
	              url: "/orders/delete",
	              type: "get",
	              data:{"oid":data.oid},
	              dataType: "json",
	              success: function(data){
	                  obj.del();
	              }
	        });
	          //关闭弹框
	  		window.location.reload();//刷新页面
	  		layer.close();//关闭当前页
	        });
	        
	      }
  });
  
  
});
</script>

</body>

</html>