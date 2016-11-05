package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String username = req.getParameter("username");
		String pwd = req.getParameter("password");
		if("admin".equals(username) && "admin".equals(pwd)) {
			req.getSession().setAttribute("username", username);
			resp.sendRedirect(req.getContextPath()+"/success.jsp");
		}
		else {
			resp.sendRedirect(req.getContextPath()+"/fail.jsp");
		}
	}

}
