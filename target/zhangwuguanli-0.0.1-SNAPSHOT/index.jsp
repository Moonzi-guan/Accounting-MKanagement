<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>账单管理系统</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">账单管理系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">人力资源</a></li>
      <li class="layui-nav-item"><a href="">客户管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          贤心
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item">
                    <a class="" href="javascript:;">人事管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-id="1" data-title="新员工入职" data-url="${pageContext.request.contextPath }/personal-management-pages/newin_add"
                               class="site-demo-active" data-type="tabAdd">新员工入职</a></dd>
                        <dd><a href="javascript:;" data-id="2" data-title="新员工面试记录" data-url="${pageContext.request.contextPath }/personal-management-pages/newin_interview"
                               class="site-demo-active" data-type="tabAdd">新员工面试记录</a></dd>
                        <dd><a href="javascript:;" data-id="3" data-title="员工个人信息表" data-url="${pageContext.request.contextPath }/personal-management-pages/employee_information"
                               class="site-demo-active" data-type="tabAdd">员工个人信息表</a></dd>       
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">客户管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-id="4" data-title="客户创建" data-url="${pageContext.request.contextPath }/customer-pages/customer_add"
                               class="site-demo-active" data-type="tabAdd">客户创建</a></dd>
                        <dd><a href="javascript:;" data-id="5" data-title="客户列表" data-url="${pageContext.request.contextPath }/customer-pages/customer_information"
                               class="site-demo-active" data-type="tabAdd">客户列表</a></dd>
                        <dd><a href="javascript:;" data-id="6" data-title="客户与职员关联表" data-url="${pageContext.request.contextPath }/customer-pages/customer_bill"
                               class="site-demo-active" data-type="tabAdd">客户与职员关联表</a></dd>       
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">账单管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-id="7" data-title="账单列表" data-url="${pageContext.request.contextPath }/bill-pages/bill_information"
                               class="site-demo-active" data-type="tabAdd">账单列表</a>
                        </dd>   
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">采购管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-id="8" data-title="采购商品" data-url="${pageContext.request.contextPath }/apporach-pages/apporach_add"
                               class="site-demo-active" data-type="tabAdd">采购商品</a>
                        </dd>   
                        <dd><a href="javascript:;" data-id="9" data-title="库存商品" data-url="${pageContext.request.contextPath }/apporach-pages/apporach_bill"
                               class="site-demo-active" data-type="tabAdd">库存商品</a>
                        </dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">销售管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;" data-id="10" data-title="销售订单创建" data-url="${pageContext.request.contextPath }/sale-pages/sale_add"
                               class="site-demo-active" data-type="tabAdd">销售订单创建</a>
                        </dd>   
                        <dd><a href="javascript:;" data-id="11" data-title="销售列表" data-url="${pageContext.request.contextPath }/sale-pages/sale_bill"
                               class="site-demo-active" data-type="tabAdd">销售列表</a>
                        </dd>
                    </dl>
                </li>
            </ul>
        </div>
  </div>
  
    <!--tab标签-->
    <div class="layui-tab" lay-filter="demo" lay-allowclose="true" style="margin-left: 200px;">
        <ul class="layui-tab-title"></ul>
        <div class="layui-tab-content"></div>
    </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    MooZi开发
  </div>
</div>
<script src="${pageContext.request.contextPath}/js/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
//实现右侧窗口的显示
  layui.use(['element', 'layer', 'jquery'], function () {
        var element = layui.element;
        // var layer = layui.layer;
        var $ = layui.$;
        // 配置tab实践在下面无法获取到菜单元素
        $('.site-demo-active').on('click', function () {
            var dataid = $(this);
            //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
            if ($(".layui-tab-title li[lay-id]").length <= 0) {
                //如果比零小，则直接打开新的tab项
                active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
            } else {
                //否则判断该tab项是否以及存在
                var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
                $.each($(".layui-tab-title li[lay-id]"), function () {
                    //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
                    if ($(this).attr("lay-id") == dataid.attr("data-id")) {
                        isData = true;
                    }
                })
                if (isData == false) {
                    //标志为false 新增一个tab项
                    active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
                }
            }
            //最后不管是否新增tab，最后都转到要打开的选项页面上
            active.tabChange(dataid.attr("data-id"));
        });

        var active = {
            //在这里给active绑定几项事件，后面可通过active调用这些事件
            tabAdd: function (url, id, name) {
                //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
                //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
                element.tabAdd('demo', {
                    title: name,
                    content: '<iframe data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url + '" style="width:100%;height:99%;"></iframe>',
                    id: id //规定好的id
                })
                FrameWH();  //计算ifram层的大小
            },
            tabChange: function (id) {
                //切换到指定Tab项
                element.tabChange('demo', id); //根据传入的id传入到指定的tab项
            },
            tabDelete: function (id) {
                element.tabDelete("demo", id);//删除
            }
        };
        function FrameWH() {
            var h = $(window).height();
            $("iframe").css("height",h+"px");
        }
    });
</script>

</body>
</html>