package com.bit.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.bo.LoginValidatorBO;

public class LoginValidatorServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		String userName = req.getParameter("userName");
		String password = req.getParameter("password");

		res.setContentType("text/html");

		ServletOutputStream out = res.getOutputStream();

		out.println("<HTML><HEAD><TITLE>Bharath Institute Of Technology</TITLE></HEAD>");
		LoginValidatorBO loginValidatorBO = new LoginValidatorBO();
		boolean authenticated = loginValidatorBO.validate(userName, password);

		if (authenticated) {
			out.println("<h1>Welcome to BITs " + userName + "</h1>");
		} else {
			out.println("<b>Invalid User Name or Password</b>");
		}

		out.println("</BODY></HTML>");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}
}