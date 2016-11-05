<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Success</title>
</head>
<body>
<h1>登录用户信息</h1>
<%
request.setCharacterEncoding("utf-8");
	String username="";
	String password="";
	Cookie[] cookies = request.getCookies();
	if(cookies!=null && cookies.length>0){
		for(Cookie c : cookies){
			if("username".equals(c.getName())){
				username = URLDecoder.decode(c.getValue(), "utf-8");
			}
			else if("password".equals(c.getName())){
				password = URLDecoder.decode(c.getValue(), "utf-8");
			}
		}
	}
%>
<hr>
用户名：<%=username %><br>
密码：<%=password %><br>
</body>
</html>