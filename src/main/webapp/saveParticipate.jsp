<%@page import="com.ty.dto.Participates"%>
<%@page import="com.ty.Service.ParticipatesService"%>
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
		ParticipatesService participatesService=new ParticipatesService();
		Participates participates=(Participates)request.getAttribute("participates");
		%>
		
		<h1>Thank you for register the Participates <br>participateId Is <%=participates.getId() %> </h1>
</body>
</html>