<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="exception.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>九九乘法表</title>
</head>
<body>
  <%!
  String multiTable(){
	  String s="";
	  for(int i=1;i<=9;i++){
		  for(int j=1;j<=i;j++){
			  s+=i+"x"+j+"="+(i*j)+"&nbsp;&nbsp;";
		  }
		  s+="<br>";
	  }
	  return s;
  }
  %>
  <%
  //response.sendRedirect("**.jsp");//重定向
  //request.getRequestDispatcher("**.jsp").forward(ServletRequest, ServletResponse);//转发
  //response
  %>
  <h1>九九乘法表</h1>
  <hr>
  <%=multiTable() %>
  <form action="sdfdfs.jsp" method="get">
  </form>
</body>
</html>