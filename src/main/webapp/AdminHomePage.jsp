<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}
</style>
</head>
<body>

<ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="RegisterAdmin.jsp">RegisterAdmin</a></li>
  <li><a href="AdminLogIn.jsp">LogIn Admin</a></li>
  <li><a href=CoOrdinateLogIn.jsp>CoOrdinateLogIn</a></li>
  <li><a href="viewcoordinate">View CoOrdinates</a></li>
  <li><a href="viewparticipates">View Participates</a></li>
  
</ul>

</body>
</html>

