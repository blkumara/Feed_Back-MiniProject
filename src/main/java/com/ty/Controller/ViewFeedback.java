package com.ty.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.FeedBackService;
import com.ty.dto.FeedBack;

@WebServlet(value = "/viewFeedBack")
public class ViewFeedback extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FeedBackService feedBackService= new FeedBackService();
		List<FeedBack> feedBacks=feedBackService.getAllFeedBack();
		if (feedBacks.size() > 0) {
			req.setAttribute("viewfeedback", feedBacks);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("FeedbackView.jsp");
			requestDispatcher.forward(req, resp);
		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("FeedbackView.jsp");
			requestDispatcher.include(req, resp);

		}
	}
}
