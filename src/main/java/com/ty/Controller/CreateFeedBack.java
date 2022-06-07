package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.FeedBackService;
import com.ty.dto.FeedBack;

@WebServlet(value = "/createfeedback")
public class CreateFeedBack extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String participateName = req.getParameter("participateName");
		String ratings = req.getParameter("ratings");
		String description = req.getParameter("description");

		FeedBack feedBack = new FeedBack();
		feedBack.setParticipateName(participateName);
		feedBack.setRating(ratings);
		feedBack.setDescription(description);

		PrintWriter printWriter = resp.getWriter();

		FeedBackService feedBackService = new FeedBackService();
		FeedBack feedBack2 = feedBackService.saveFeedBack(feedBack);
		if (feedBack2 != null) {
			req.setAttribute("feedback", feedBack2);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveFeedBack.jsp");
			requestDispatcher.forward(req, resp);
		} else {

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterFeedBack.jsp");
			requestDispatcher.include(req, resp);

		}
	}

}
