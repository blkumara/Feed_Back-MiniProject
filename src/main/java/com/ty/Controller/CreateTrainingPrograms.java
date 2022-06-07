package com.ty.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.Service.TraingProgramsService;
import com.ty.dto.TrainingPrograms;

@WebServlet(value = "/traingprograms")
public class CreateTrainingPrograms extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		LocalDate startingDate = LocalDate.parse(req.getParameter("startingDate"));
		LocalDate endingDate = LocalDate.parse(req.getParameter("endingDate"));
		String facultiesName = req.getParameter("facultiesName");

		TrainingPrograms trainingPrograms = new TrainingPrograms();
		trainingPrograms.setName(name);
		trainingPrograms.setStartingDate(startingDate);
		trainingPrograms.setEndingDate(endingDate);
		trainingPrograms.setFaculitiesName(facultiesName);

		TraingProgramsService traingProgramsService = new TraingProgramsService();
		TrainingPrograms trainingPrograms2 = traingProgramsService.saveTrainingPrograms(trainingPrograms);

		if (trainingPrograms2 != null) {
			req.setAttribute("traingPrograms", trainingPrograms2);
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("saveTrainingPrograms.jsp");
			requestDispatcher.forward(req, resp);

		} else {
			RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterTrainingPrograms.jsp");
			requestDispatcher.forward(req, resp);

		}

	}
}
