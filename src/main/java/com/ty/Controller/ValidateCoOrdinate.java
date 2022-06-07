package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.CoOrdinateService;
import com.ty.dto.CoOrdinate;

@WebServlet(value = "/validateCoOrdinate")
public class ValidateCoOrdinate extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CoOrdinateService coOrdinateService = new CoOrdinateService();
		CoOrdinate coOrdinate = coOrdinateService.validateCoOrdinate(req.getParameter("email"),req.getParameter("password"));
		
		if (coOrdinate != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("HomePageCoOrdinate.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterCoOrdinate.jsp");
			requestDispatcher.forward(req, resp);
		}
	}

}
