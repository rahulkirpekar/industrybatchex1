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

public class LoginServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		ServletContext context = getServletContext();
		
		Student s  = (Student)context.getAttribute("sobj");
		
		PrintWriter out =response.getWriter();
		
		out.print("LoginServlet - "+s.getRno() + " " + s.getName() + " " +s.getStd());
		
		
		
		
//		Student s1 = new Student();
//		s1.setRno(1);
//		s1.setName("rahul kirpekar");
//		s1.setStd(12);
		
//		HttpSession session = request.getSession();
		
//		session.setAttribute("studentObject", s1);

//		System.out.println("LoginServlet called and s1 object stored in session object");
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
