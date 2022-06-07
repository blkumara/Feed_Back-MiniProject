<%@page import="com.ty.dto.Participates"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Add icon library -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

.input-container {
	display: -ms-flexbox; /* IE10 */
	display: flex;
	width: 100%;
	margin-bottom: 15px;
}

.icon {
	padding: 10px;
	background: dodgerblue;
	color: white;
	min-width: 50px;
	text-align: center;
}

.input-field {
	width: 100%;
	padding: 10px;
	outline: none;
}

.input-field:focus {
	border: 2px solid dodgerblue;
}

/* Set a style for the submit button */
.btn {
	background-color: dodgerblue;
	color: white;
	padding: 15px 20px;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.btn:hover {
	opacity: 1;
}
</style>
</head>
<body>
	<% Participates participates=(Participates) session.getAttribute("pname");
	%>
	<form action="createfeedback" style="max-width: 500px; margin: auto">
		<h2>Register Form</h2>
		<div class="input-container">
			<i class="fa fa-user icon"></i> <input class="input-field"
				type="text" placeholder="ParticipateName" name="participateName" value="<%=participates.getName()%>">
		</div>

		<div class="input-container">
			<i class="fa fa-cogs icon"></i> <label for="Ratings">Ratings:</label>
			<select name="ratings" id="ratings">
				<option value="ratings">Ratings</option>
				<option value="5-Excellent">5-Excellent</option>
				<option value="4-Good">4-Good</option>
				<option value="3-Average">3-Average</option>
				<option value="2-Below">3-2-Below</option>
				<option value="1-Poor">1-Poor</option>
			</select>
		</div>

		<div class="input-container">
			<i class="fa fa-envelope icon"></i>
			<textarea rows="5" cols="10" name="description"
				placeholder="enter description"></textarea>
		</div>


		<button type="submit" class="btn">Register</button>
	</form>

</body>
</html>
</body>
</html>