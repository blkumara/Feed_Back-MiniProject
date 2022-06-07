package com.ty.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.CourseService;
import com.ty.dto.Courses;

@WebServlet(value = "/viewcourses")
public class ViewCourses extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CourseService coursesService = new CourseService();
		List<Courses> courses = coursesService.getAllCourses();
		if (courses.size() > 0) {
			req.setAttribute("viewcourses", courses);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("CourseView.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("CourseView.jsp");
			requestDispatcher.include(req, resp);

		}

	}
}
