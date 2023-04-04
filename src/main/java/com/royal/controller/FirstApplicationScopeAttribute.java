package com.royal.controller;

import java.io.IOException;

import com.royal.bean.Student;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstApplicationScopeAttribute extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("START :: FirstApplicationScopeAttribute");
		Student s = new Student();
		s.setRno(1);
		s.setName("Rahul Kirpekar");
		s.setStd(12);

		// request---[servlet1-servlet2]
		// session[start---1---2---3--4--END]
		// application[Application deploy[ServletContext object]--1-2-3-4--5-6-7-8-9--11--12-13-14---Undeploy/Server Shutdown]
		
		ServletContext application = getServletContext();
		
		application.setAttribute("sobj", s);
		
		System.out.println("END :: FirstApplicationScopeAttribute");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
}
