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

@WebServlet(value = "/deleteFeedBack")
public class DeleteFeedBack extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FeedBackService feedBackService=new FeedBackService();
		int id=Integer.parseInt((String)req.getParameter("id"));
		FeedBack feedBack=feedBackService.deleteFeedBack(id);
		if(feedBack != null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("FeedbackView.jsp");
			requestDispatcher.forward(req, resp);
		}else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Home.jsp");
			requestDispatcher.include(req, resp);
		}
	}
			
}
