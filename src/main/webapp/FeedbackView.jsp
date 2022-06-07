<%@page import="com.ty.dto.FeedBack"%>
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
	List<FeedBack> feedBacks = (List<FeedBack>) request.getAttribute("viewfeedback");
	%>
	<table border="3px">
		<tr>
			<th>Id</th>
			<th>Description</th>
			<th>Ratings</th>
			<th>ParticipateName</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%
		for (FeedBack feedBack : feedBacks) {
		%>
		<tr>
			<th><%=feedBack.getId()%></th>
			<th><%=feedBack.getDescription()%></th>
			<th><%=feedBack.getRating()%></th>
			<th><%=feedBack.getParticipateName()%></th>
			<th><a href="edit?id=<%=feedBack.getId()%>">Edit</a></th>
			<th><a href="delete?id=<%=feedBack.getId()%>">Delete</a></th>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>