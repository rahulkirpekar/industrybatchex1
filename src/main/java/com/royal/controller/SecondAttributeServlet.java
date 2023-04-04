package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SecondAttributeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Object obj=	request.getAttribute("studentObject");
		Student s = (Student)obj;

		System.out.println("SecondAttributeServlet===> " + s.getRno() + " "+ s.getName() + " " +s.getStd());
		response.setContentType("text/html");
		request.getRequestDispatcher("ThirdAttributeServlet").forward(request, response);
		
//		out.print("<b>SecondAttributeServlet - Rno : </b>"+s.getRno() + "<br>");
//		out.print("<b>SecondAttributeServlet - Name : </b>"+s.getName() + "<br>");
//		out.print("<b>SecondAttributeServlet - Std : </b>"+s.getStd() + "<br>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
