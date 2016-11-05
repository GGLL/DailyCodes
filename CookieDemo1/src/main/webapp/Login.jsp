<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<%
String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="container">
  	<div class="logo">
  		<a href="#">TTTTTTTTTT</a>
  	</div>
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
  	<div id="box">
  	  <form name="loginForm" action="doLogin.jsp" method="post">
  	  <table>
  	    <tr>
  	      <td>用户名</td>
  	      <td><input type="text" name="username" value="<%=username %>"/></td>
  	    </tr>
  	    <tr>
  	      <td>密码</td>
  	      <td><input type="password" name="password" value="<%=password%>"/></td>
  	    </tr>
  	    <tr>
  	      <td colspan="2"><input type="checkbox" name="isUseCookie" checked="checked"/>是否使用cookies</td>
  	    </tr>
  	    <tr>
  	      <td colspan="2"><input type="submit" name="login" value="登录"/></td>
  	    </tr>
  	  </table>
  	  </form>
  	</div>
  </div>
  <a href="servlet/HelloServlet">相对helloServlet</a><br>
  <a href="<%=path %>/servlet/HelloServlet">jue对helloServlet</a>
</body>
</html>