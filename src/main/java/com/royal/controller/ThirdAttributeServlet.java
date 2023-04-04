package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdAttributeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Object obj=	request.getAttribute("studentObject");
		Student s = (Student)obj;

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.print("<b>ThirdAttributeServlet - Rno : </b>"+s.getRno() + "<br>");
		out.print("<b>ThirdAttributeServlet - Name : </b>"+s.getName() + "<br>");
		out.print("<b>ThirdAttributeServlet - Std : </b>"+s.getStd() + "<br>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}