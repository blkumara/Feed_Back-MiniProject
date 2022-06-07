package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.AdminService;
import com.ty.dto.Admin;

@WebServlet(value = "/validateadmin")
public class ValidateAdmin extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminService adminService = new AdminService();
		Admin admin = adminService.validateAdmin(req.getParameter("email"), req.getParameter("password"));

		if (admin != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("AdminHomePage2.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterAdmin.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
