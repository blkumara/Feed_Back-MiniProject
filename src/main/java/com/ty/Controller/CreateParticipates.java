package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.ParticipatesService;
import com.ty.dto.Participates;

@WebServlet(value = "/cretaeParticipate")
public class CreateParticipates extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String password = req.getParameter("password");

		Participates participates = new Participates();
		participates.setName(name);
		participates.setEmail(email);
		participates.setGender(gender);
		participates.setPassword(password);

		ParticipatesService participatesService = new ParticipatesService();
		Participates participates2 = participatesService.saveParticipates(participates);
		if (participates2 != null) {
			req.setAttribute("participates", participates2);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveParticipate.jsp");
			requestDispatcher.forward(req, resp);

		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterParticipate.jsp");
			requestDispatcher.include(req, resp);

		}
	}

}
