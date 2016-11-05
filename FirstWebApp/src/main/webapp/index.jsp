<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<%-- --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- html注释 -->
<%-- JSP注释，客户端不可见 --%>
<%!
String s = "nononono";
public int sum(int x,int y){
	return x+y;
}
%>
<%
//脚本注释
out.print("welcome to learn J2EE\n");
%>
<hr />
<h1>lalala </h1>
<br>
s=<%=s %>
<br>
x+y=<%=sum(1,2) %>
</body>
</html>