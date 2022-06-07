<%@page import="com.ty.dto.TrainingPrograms"%>
<%@page import="java.util.List"%>
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
		List<TrainingPrograms> list=(List<TrainingPrograms>)request.getAttribute("viewTrainings");
	%>
	<table border="3px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Starting Date</th>
			<th>Ending Date</th>
			<th>Faculty Name</th>
			<th>Edit</th>
			<th>Delete</th>
			<th>FeedBack</th>
		</tr>
		
		<%
			for(TrainingPrograms tPrograms: list){
		%>
		<tr>
			<th><%=tPrograms.getId()%></th>
			<th><%=tPrograms.getName()%></th>
			<th><%=tPrograms.getStartingDate()%></th>
			<th><%=tPrograms.getEndingDate()%></th>
			<th><%=tPrograms.getFaculitiesName()%></th>
			<th><a href="edit?id?=<%=tPrograms.getId()%>">Edit</a></th>
			<th><a href="delete?id?=<%=tPrograms.getId()%>">Delete</a></th>
			<th><a href="RegisterFeedBack.jsp?id=<%=tPrograms.getId()%>">Click Here</a></th>
		</tr>
		<%} %>
	</table>
</body>
</html>