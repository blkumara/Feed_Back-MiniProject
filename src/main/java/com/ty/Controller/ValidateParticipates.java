package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.Service.ParticipatesService;
import com.ty.dto.Participates;

@WebServlet(value = "/validateparticipates")
public class ValidateParticipates extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ParticipatesService participatesService = new ParticipatesService();
		Participates participates = participatesService.validateparticipate(req.getParameter("email"),req.getParameter("password"));

		if (participates != null) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("pname", participates);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("HomeParticipatePage.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterParticipate.jsp");
			requestDispatcher.forward(req, resp);
		}
	}
}
