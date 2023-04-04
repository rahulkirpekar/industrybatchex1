package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.Student;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		
		Student s  = (Student)context.getAttribute("sobj");
		
		PrintWriter out =response.getWriter();
		
		out.print("LogoutServlet - "+s.getRno() + " " + s.getName() + " " +s.getStd());
		
		
		
//		HttpSession session = request.getSession(false);
//		session.invalidate();// session destroy
//		System.out.println("LogoutServlet --- Session Destroyed");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
