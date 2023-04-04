package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
//		ServletContext context	= request.getServletContext();
		
		ServletContext context	= getServletContext();
		
		String step1 = context.getInitParameter("step1");
		String step2 = context.getInitParameter("step2");
		String step3 = context.getInitParameter("step3");
		
		PrintWriter out =response.getWriter();
		out.print("ThirdServlet - step1 - " + step1+"</br>");
		out.print("ThirdServlet - step2 - " + step2+"</br>");
		out.print("ThirdServlet - step3 - " + step3+"</br>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
