package com.ty.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.FeedBackService;
import com.ty.dto.FeedBack;

@WebServlet(value = "/editFeedBack")
public class UpdateFeedBack extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String ratings = req.getParameter("ratings");
		String description = req.getParameter("description");

		FeedBack feedBack = new FeedBack();
		feedBack.setRating(ratings);
		feedBack.setDescription(description);

		FeedBackService feedBackService = new FeedBackService();
		FeedBack feedBack2 = feedBackService.updateFeedBack(feedBack);

		if (feedBack2 != null) {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("FeedbackView.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
			requestDispatcher.include(req, resp);
		}
	}

}
