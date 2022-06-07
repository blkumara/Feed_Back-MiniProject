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

@WebServlet(value = "/registeradmin")
public class createAdmin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");

		Admin admin = new Admin();
		admin.setName(name);
		admin.setEmail(email);
		admin.setPhone(phone);
		admin.setPassword(password);

		PrintWriter printWriter = resp.getWriter();

		AdminService adminService = new AdminService();
		Admin admin2 = adminService.saveAdmin(admin);
		if (admin2 != null) {
			req.setAttribute("admin", admin);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveAdmin.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterAdmin.jsp");
			requestDispatcher.include(req, resp);

		}

	}

}
