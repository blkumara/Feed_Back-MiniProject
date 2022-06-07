<%@page import="com.ty.dto.Courses"%>
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
		List<Courses> list = (List<Courses>)request.getAttribute("viewcourses");
	%>
	<table border="3" cellpadding=10>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Fees</th>
			<th>Duration</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
			
	<%
	for(Courses courses : list) {
	%>
		<tr>
			<th><%=courses.getId()%></th>
			<th><%=courses.getCourseName()%></th>
			<th><%=courses.getFees()%></th>
			<th><%=courses.getDuration()%></th>
			<th> <a href="edit?id=<%=courses.getId()%>">Edit</a> </th>
			<th> <a href="delete?id=<%=courses.getId()%>">Delete</a> </th>
		</tr>
	<%
	}
	%>
	
	</table>
		

</body>
</html>