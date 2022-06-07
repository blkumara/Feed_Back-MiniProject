<%@page import="com.ty.dto.Faculties"%>
<%@page import="com.ty.Service.FacultiesService"%>
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
			FacultiesService facultiesService=new FacultiesService();
			
			Faculties faculties=(Faculties)request.getAttribute("faculties");
			
			
			%>
			
			<h1>Thank YouFor Register The faculties <br> Faculties Id Is:<%=faculties.getId() %> </h1>
			
			
</body>
</html>