<%@page import="com.ty.dto.CoOrdinate"%>
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
		List<CoOrdinate> coOrdinates = (List<CoOrdinate>)request.getAttribute("viewcoordinate");
	%>
	<table border="3" cellpadding=10>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Gender</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
			
	<%
	for(CoOrdinate ordinate : coOrdinates) {
	%>
		<tr>
			<th><%=ordinate.getId()%></th>
			<th><%=ordinate.getName()%></th>
			<th><%=ordinate.getEmail()%></th>
			<th><%=ordinate.getPassword()%></th>
			<th><%=ordinate.getGender()%></th>
			<th> <a href="edit?id=<%=ordinate.getId()%>">Edit</a> </th>
			<th> <a href="delete?id=<%=ordinate.getId()%>">Delete</a> </th>
		</tr>
	<%
	}
	%>
	
	</table>
</body>
</html>