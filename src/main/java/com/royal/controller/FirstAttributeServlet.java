package com.royal.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.royal.bean.Student;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstAttributeServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context = getServletContext();
		
		Student s  = (Student)context.getAttribute("sobj");
		
		PrintWriter out =response.getWriter();
		
		out.print("FirstAttributeServlet - "+s.getRno() + " " + s.getName() + " " +s.getStd());
		
		
		
		
//		Student sObj = new Student();
//		sObj.setRno(1);
//		sObj.setName("rahul kirpekar");		
//		sObj.setStd(12);
//		request.setAttribute("studentObject", sObj);
//		RequestDispatcher rd =	request.getRequestDispatcher("SecondAttributeServlet");
//		rd.forward(request, response);
//		request.getRequestDispatcher("SecondAttributeServlet").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
