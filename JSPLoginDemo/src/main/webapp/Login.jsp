<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  <div id="container">
  	<div class="logo">
  		<a href="#">...</a>
  	</div>
  	<div id="box">
  	  <form name="loginForm" action="doLogin.jsp" method="post">
  	  <p class="main">
  	    <label>用户名:</label>
  	    <input type="text" name="username" value=""></input>
  	    <label>密码:</label>
  	    <input type="password" name="password" value=""></input>
  	  </p>
  	  <p class="space">
  	  	<input type="submit" value="登录" class="login"></input>
  	  </p>
  	  </form>
  	</div>
  </div>
</body>
</html>