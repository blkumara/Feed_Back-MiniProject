package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.CoOrdinateService;
import com.ty.dto.CoOrdinate;

@WebServlet(value = "/createCoOrdinate")
public class CreateCoOrdinate extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		String gender=req.getParameter("gender");
		
		CoOrdinate coOrdinate=new CoOrdinate();
		coOrdinate.setName(name);
		coOrdinate.setEmail(email);
		coOrdinate.setPassword(password);
		coOrdinate.setGender(gender);
		
		PrintWriter printWriter=resp.getWriter();
		
		CoOrdinateService coOrdinateService=new  CoOrdinateService();
		CoOrdinate coOrdinate2=coOrdinateService.saveCoOrdinate(coOrdinate);
		if(coOrdinate2!=null) {
			req.setAttribute("coordinates", coOrdinate2);
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("saveCoOrdinate.jsp");
			requestDispatcher.forward(req, resp);
			
		} else {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("RegisterCoOrdinate.jsp");
			requestDispatcher.include(req, resp);
			
		}
	}

}
