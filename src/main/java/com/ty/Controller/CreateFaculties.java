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
import com.ty.Service.FacultiesService;
import com.ty.dto.Courses;
import com.ty.dto.Faculties;

@WebServlet(value = "/registerfaculties")
public class CreateFaculties extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		long phone=Long.parseLong(req.getParameter("phone"));
		String password=req.getParameter("password");
		Double salary=Double.parseDouble(req.getParameter("salary"));
		String skills=req.getParameter("skills");
		
		Faculties faculties=new Faculties();
		faculties.setName(name);
		faculties.setEmail(email);
		faculties.setGender(gender);
		faculties.setPassword(password);
		faculties.setPhone(phone);
		faculties.setSalary(salary);
		faculties.setSkills(skills);
		
		PrintWriter printWriter=resp.getWriter();
		
		FacultiesService facultiesService=new FacultiesService();
		Faculties faculties2=facultiesService.saveFaculties(faculties);
		if(faculties2!=null) {
			req.setAttribute("faculties", faculties2);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveFaculties.jsp");
			requestDispatcher.forward(req, resp);
			
		} else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RegisterFaculties.jsp");
			requestDispatcher.include(req, resp);
			
		}
	}
}
