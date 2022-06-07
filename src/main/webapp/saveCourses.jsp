<%@page import="com.ty.dto.Courses"%>
<%@page import="com.ty.Service.CourseService"%>
<%@page import="com.ty.Service.AdminService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Courses</title>

</head>
<body>



	<%
	CourseService courseService = new CourseService();
	Courses courses = (Courses) request.getAttribute("mycourse");
	%>

	<h1>
		Courses Added SuccessFully <br> Course Id Is:<%=courses.getId()%>
	</h1>
</body>
</html>