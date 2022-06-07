<%@page import="com.ty.dto.Admin"%>
<%@page import="com.ty.Service.AdminService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Admin</title>
</head>
<body>
	<%
	AdminService adminService = new AdminService();

	Admin admin = (Admin) request.getAttribute("admin");
	%>
	<h1>
		Admin Saved SuccesFully <br> Your Id Is<%=admin.getId()%>
	</h1>
</body>
</html>