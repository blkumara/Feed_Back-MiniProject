<%@page import="com.ty.dto.TrainingPrograms"%>
<%@page import="com.ty.Service.TraingProgramsService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
		TraingProgramsService traingProgramsService=new TraingProgramsService();
		
		TrainingPrograms trainingPrograms=(TrainingPrograms)request.getAttribute("traingPrograms");
		%>
		
		<h1>Thank You For Register The TrainingProgramms <br>TrainingProgram Id Is:<%=trainingPrograms.getId() %> </h1>
		
</body>
</html>