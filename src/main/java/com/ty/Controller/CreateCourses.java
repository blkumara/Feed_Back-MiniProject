package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.CourseService;
import com.ty.dto.Courses;

@WebServlet(value = "/registercourses")
public class CreateCourses extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("name");
		double fees=Double.parseDouble(req.getParameter("fees"));
		String duration=req.getParameter("duration");
		
		Courses courses=new Courses();
		courses.setCourseName(name);
		courses.setFees(fees);
		courses.setDuration(duration);
		
		PrintWriter printWriter=resp.getWriter();
		
		CourseService courseService=new CourseService();
		Courses courses2=courseService.saveCourses(courses);
		if(courses2!=null) {
			req.setAttribute("courses", courses2);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveCourses.jsp");
			requestDispatcher.forward(req, resp);
			
		} else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RegisterCourses.jsp");
			requestDispatcher.include(req, resp);
			
		}
		
		
		
	
		
	}
}
