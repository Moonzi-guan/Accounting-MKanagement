<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
	用户名：<input type="text" name="username"/>
	密码：<input type="text" name="password"/>
	<input name="" type="submit" value="提交" /> 
</form>

</body>
</html>