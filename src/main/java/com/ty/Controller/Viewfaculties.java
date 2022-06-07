package com.ty.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.FacultiesService;
import com.ty.dto.Faculties;

@WebServlet(value = "/viewfaculties")
public class Viewfaculties extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FacultiesService facultiesService=new FacultiesService();
		List<Faculties> faculties=facultiesService.getAllFaculties();
		if (faculties.size() > 0) {
			req.setAttribute("viewfaculties", faculties);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("FacultiesView.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("FacultiesView.jsp");
			requestDispatcher.include(req, resp);

		}
	}
}
