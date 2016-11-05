<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>showLoginInfo</title>
</head>
<body>
<%
	String[] isUseCookies = request.getParameterValues("isUseCookie");
	if(isUseCookies!=null && isUseCookies.length>0){
		String username = URLEncoder.encode(request.getParameter("username"), "utf-8");
		String password = URLEncoder.encode(request.getParameter("password"), "utf-8");
		Cookie usernameC = new Cookie("username",username);
		Cookie passwordC = new Cookie("password",password);
		usernameC.setMaxAge(86400);
		passwordC.setMaxAge(86400);
		response.addCookie(usernameC);
		response.addCookie(passwordC);
	}
	else{
		Cookie[] cookies = request.getCookies();
		if(cookies!=null && cookies.length>0){
			for(Cookie c : cookies){
				if("username".equals(c.getName()) || "password".equals(c.getName())){
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
		}
	}
%>
<a href="success.jsp">登录用户信息</a>
</body>
</html>