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
  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->
</head>
<body >
 
<table class="layui-hide" id="test"></table>
              
          
<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'/newin/list'
    ,page: true
    ,limit:'6'
    ,limits:[10,20]
    ,method:'get'
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
    	{field:'nid', minWidth:80, title: '编号', sort: true}
        ,{field:'nusername', minWidth:100, title: '姓名'}
        ,{field:'nsex', minWidth:80, title: '性别', sort: true}
        ,{field:'napplicant', minWidth:135, title: '应聘岗位'}
        ,{field:'ncontact', title: '联系方式', minWidth: 135}
        ,{field:'nedu', minWidth:80, title: '学历', sort: true}
        ,{field:'nprofession', minWidth:80, title: '专业', sort: true}
        ,{field:'nschool', minWidth:135, title: '毕业院校'}
        ,{field:'nmanning', minWidth:135, title: '人员类型', sort: true}
    ]]
    
  });
});
</script>

</body>
</html>