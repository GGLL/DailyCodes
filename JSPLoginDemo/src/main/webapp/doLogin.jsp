<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="myUserDao" class="com.dao.UserDao" scope="page"></jsp:useBean>
<jsp:useBean id="myUser" class="com.po.MyUser" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="myUser"/>
<%
/* String username = request.getParameter("username");
String password = request.getParameter("pwd");

if("admin".equals(username) && "admin".equals(password)){
	request.getRequestDispatcher("success.jsp").forward(request, response);
}
else{
	response.sendRedirect("failure.jsp");
} */
String username = myUser.getUsername();
String password = myUser.getPassword();

if(myUserDao.checkUser(myUser)){
	request.getRequestDispatcher("success.jsp").forward(request, response);
}
else{
	response.sendRedirect("failure.jsp");
}
%>