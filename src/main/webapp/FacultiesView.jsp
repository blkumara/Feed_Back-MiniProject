<%@page import="com.ty.dto.Faculties"%>
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
			List<Faculties> faculties = (List<Faculties>)request.getAttribute("viewfaculties");
		%>
		<table border="3" cellpadding=10>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Phone</th>
				<th>Password</th>
				<th>Salary</th>
				<th>Skills</th>
				<th>Edit</th>
				<th>Delete</th>
			</tr>
				
		<%
		for (Faculties faculty : faculties) {
		%>
			<tr>
				<th><%=faculty.getId()%></th>
				<th><%=faculty.getName()%></th>
				<th><%=faculty.getEmail()%></th>
				<th><%=faculty.getPhone()%></th>
				<th><%=faculty.getPassword()%></th>
				<th><%=faculty.getSalary()%></th>
				<th><%=faculty.getSkills()%></th>
				<th> <a href="edit?id=<%=faculty.getId()%>">Edit</a> </th>
				<th> <a href="delete?id=<%=faculty.getId()%>">Delete</a> </th>
			</tr>
		<%
		}
		%>
</body>
</html>