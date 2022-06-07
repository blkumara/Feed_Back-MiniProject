<%@page import="com.ty.dto.FeedBack"%>
<%@page import="com.ty.Service.FeedBackService"%>
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
	FeedBackService feedBackService = new FeedBackService();

	FeedBack feedBack = (FeedBack) request.getAttribute("feedback");
	%>

	<h1>
		Thank You For Register The Feedback <br> FeedBack Id Is:<%=feedBack.getId()%>
	</h1>
</body>
</html>