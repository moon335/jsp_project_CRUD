package com.cgv.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/connector")
public class Connector extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Connector() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("index".equals(action)) {
			response.sendRedirect("index.jsp");
		} else if("login".equals(action)) {
			response.sendRedirect("login.jsp");
		} else if("signUp".equals(action)) {
			response.sendRedirect("signUp.jsp");
		} else if("delete".equals(action)) {
			response.sendRedirect("deleteAccount.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
