package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.FacultiesService;
import com.ty.dto.Faculties;

@WebServlet(value = "/deleteFaculties")
public class DeleteFaculties extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FacultiesService facultiesService = new FacultiesService();

		int id = Integer.parseInt(req.getParameter("id"));
		Faculties faculties = facultiesService.deleteFaculties(id);
		if(faculties != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("FacultiesView.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("HomePage.jsp");
			requestDispatcher.include(req, resp);
		}

	}

}
