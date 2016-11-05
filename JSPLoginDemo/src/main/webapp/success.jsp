<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Success</title>
</head>
<body>
<%-- <h1>欢迎<%=request.getParameter("username") %>登录成功</h1> --%>
<h1>setProperty使用方法</h1>
<jsp:useBean id="myUser" class="com.po.MyUser" scope="page"></jsp:useBean>
<!-- 表单自动匹配所有字段 -->
<jsp:setProperty property="*" name="myUser"/>
用户名:<%=myUser.getUsername() %><br>
密码:<%=myUser.getPassword() %>
</body>
</html>