package com.ty.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.ParticipatesService;
import com.ty.dto.Participates;

@WebServlet(value = "/viewparticipates")
public class ViewParticipates extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ParticipatesService participatesService=new ParticipatesService();
		List<Participates> participates=participatesService.getAllParticipates();
		if (participates.size() > 0) {
			req.setAttribute("viewparticipates", participates);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ParticipatesView.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("ParticipatesView.jsp");
			requestDispatcher.include(req, resp);

		}
	}

}
