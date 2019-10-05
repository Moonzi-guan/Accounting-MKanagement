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
  
</head>
<body>  
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>员工个人信息表</legend>
</fieldset>
 	
 	<div class="layui-form-item">
	<label class="layui-form-label">&emsp;</label>
	<div class="layui-input-inline">
		<input type="text" name="searchCode" id="searchReload" value="" placeholder="请输入员工姓名" autocomplete="off" class="layui-input">
	</div>
	<button class="layui-btn" data-type="reload" >查询员工</button>
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
	<a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="detail">查看</a>
  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
              
          
<script src="${pageContext.request.contextPath }/js/layui.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 
<script>


layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'/interview/list'
    ,toolbar: '#toolbarDemo'
    ,title: '用户数据表'
   	,method:'get'
   	,id:'contenttable'
   	,limit:'13'
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
	  ,{field:'iid', minWidth:70,sort: true,title:'编号'}        
	  ,{field:'iusername', minWidth:70,title:'姓名'}       
	  ,{field:'isex',minWidth:70, sort: true,title:'性别'}       
	  ,{field:'iapplicant', minWidth:70, title:'在职岗位'}          
	  ,{field:'icontact', minWidth:135, title:'联系方式'}         
	  ,{field:'igrade', minWidth:70, sort: true, title:'导师评分'}         
	  ,{field:'iresume',minWidth:70, title:'简历'}        
	  ,{field:'istatus', minWidth:70,sort: true, title:'在职状态'}        
	  ,{field:'imanning', minWidth:70, title:'人员类型'}         
	  ,{field:'iprofession', minWidth:70, sort:true, title:'所学专业'}          
	  ,{field:'ischool', minWidth:135, sort: true,title:'毕业院校'}         
	  ,{minWidth:250, align:'center',toolbar: '#barDemo',title:'操作'}
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
    var data = obj.data//获得当前行数据（json格式的键值对）
    ,layEvent = obj.event//获得 lay-event 对应的值（编辑、删除、添加）
    ,editList=[]; //存放获取到的那条json数据中的value值（不放key）
    $.each(data,function(name,value) {//循环遍历json数据
        editList.push(value);//将json数据中的value放入数组中（下面的子窗口显示的时候要用到）
    });
    
    //console.log(obj)
    if(obj.event === 'detail'){
      layer.open({
      	type:2,
      	content:'${pageContext.request.contextPath }/interview/check?iid='+data.iid,
      	area: ['1000px', '800px'],
      	maxmin: true,
      	shadeClose: true,
      	offset: '5px'
      });
      layer.msg('ID：'+ data.iid + ' 的查看操作');
      
    } else if(obj.event === 'del'){
      layer.confirm('真的删除行么', function(index){
        //console.log(data);
        $.ajax({
            url: "/interview/delete",
            type: "get",
            data:{"iid":data.iid},
            dataType: "json",
            success: function(data){
                obj.del();
                //layer.msg("删除成功", {icon: 6});
            }
      });
        //关闭弹框
		window.location.reload();//刷新页面
		layer.close();//关闭当前页
      });
      
    } else if(layEvent=== 'edit'){
      
      // var name = encodeURIComponent(data.toolName);
         // console.log(data.toolName);
             layer.open({
                type: 2,
                title: '编辑员工信息', 
                //area: ['1000px', '800px'],
                area: ['70%', '70%'],
                shadeClose: true,
                //shade: 0.8,
                maxmin: true,
                offset: '15px',
                content: '${pageContext.request.contextPath }/interview/edit?iid='+data.iid,//设置你要弹出的jsp页面
                		//
                 /*success: function(layero, index){  
                    var body = layer.getChildFrame('body', index);  
                    var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();  
                    var inputList = body.find("input");//获取到子窗口的所有的input标签
                    for (var i = 0; i < inputList.length; i++ ) { 
                       $(inputList[i]).val(editList[i]); //遍历子窗口的input标签，将之前数组中的值一次放入显示
                    }    
                } */ 
             });
             layer.msg('ID：'+ data.iid + ' 的查看操作');
 			 
    } 
    
  });

  
  
});
</script>

</body>
</html>