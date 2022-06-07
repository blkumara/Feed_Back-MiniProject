package com.ty.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.TraingProgramsService;
import com.ty.dto.TrainingPrograms;

@WebServlet(value = "/viewtrainingprograms")
public class ViewTrainingPrograms extends HttpServlet{
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
			TraingProgramsService traingProgramsService=new TraingProgramsService();
			List<TrainingPrograms> trainingPrograms=traingProgramsService.getAllTrainingPrograms();
			if (trainingPrograms.size() > 0) {
				req.setAttribute("viewTrainings", trainingPrograms);
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("trainingprograms.jsp");
				requestDispatcher.forward(req, resp);
			} else {
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("trainingprograms.jsp");
				requestDispatcher.include(req, resp);

			}
			
		}
}
