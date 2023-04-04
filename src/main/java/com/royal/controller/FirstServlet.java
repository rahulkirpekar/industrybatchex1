package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.Student;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		
		Student s  = (Student)context.getAttribute("sobj");
		
		PrintWriter out =response.getWriter();
		
		out.print("FirstServlet - "+s.getRno() + " " + s.getName() + " " +s.getStd());
		
//		response.setContentType("text/html");
//		
//		HttpSession session = request.getSession(false);// "old session"
//		
//		Student s = (Student)session.getAttribute("studentObject");
//
//		PrintWriter out =response.getWriter();
//		
//		out.print("FirstServlet - "+s.getRno() + " " + s.getName() + " " +s.getStd());
//		
		
		
//		ServletContext context	= request.getServletContext();
		
//		String step1 = context.getInitParameter("step1");
//		String step2 = context.getInitParameter("step2");
//		String step3 = context.getInitParameter("step3");
		
//		PrintWriter out =response.getWriter();
//		out.print("FirstServlet - step1 - " + step1+"</br>");
//		out.print("FirstServlet - step2 - " + step2+"</br>");
//		out.print("FirstServlet - step3 - " + step3+"</br>");
		
		
		
//		// get FirstServlet---ServletConfig Object
//		ServletConfig config = getServletConfig();
//		String c = config.getInitParameter("C");
//		String cplus = config.getInitParameter("C++");
//		String java = config.getInitParameter("Java");
//		String python = config.getInitParameter("Python");
//
//		PrintWriter out =   response.getWriter();
//		out.print("C Language - " + c+"<br>");
//		out.print("C++ Language - " + cplus+"<br>");
//		out.print("Java Language - " + java+"<br>");
//		out.print("Python Language - " + python+"<br>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
