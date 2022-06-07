<%@page import="com.ty.dto.CoOrdinate"%>
<%@page import="com.ty.Service.CoOrdinateService"%>
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
		CoOrdinateService coOrdinateService=new CoOrdinateService();
		 CoOrdinate coOrdinate=(CoOrdinate)request.getAttribute("coordinates");
		 
		
		%>
		
	<h1>	Thank You For Register The CoOrdinate <br> CoOrdinate Id Is<%=coOrdinate.getId() %></h1>
</body>
</html>