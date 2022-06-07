<%@page import="com.ty.dto.Participates"%>
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
		List<Participates> participates = (List<Participates>)request.getAttribute("viewparticipates");
	%>
	<table border="3" cellpadding=10>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Gender</th>
			
		</tr>
			
	<%
	for(Participates participates2 : participates) {
	%>
		<tr>
			<th><%=participates2.getId()%></th>
			<th><%=participates2.getName()%></th>
			<th><%=participates2.getEmail()%></th>
			<th><%=participates2.getGender()%></th>
			
		</tr>
	<%
	}
	%>
	
	</table>
</body>
</html>