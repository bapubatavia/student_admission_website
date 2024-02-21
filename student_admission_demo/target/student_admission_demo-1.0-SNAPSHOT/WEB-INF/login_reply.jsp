<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>Ipsum - Registration Details</title>
</head>
<body class="d-flex flex-column h-100">
	<nav class="navbar navbar-expand-md bg-light navbar-light pt-0" margin-top=>
		<div class="container">
			<a href="signUp.jsp" class="navbar-brand"><img src="./img/student_logo.jpg" width="120" height="80" alt="Brand Logo" /></a>

			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navmenu">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="collapse navbar-collapse" id="navmenu">
				<ul class="navbar-nav mx-auto fw-semibold fs-5">
					<li class="nav-item me-5">
						<a href="admissionForm.jsp" class="nav-link">Admission Form</a>
					</li>										
				</ul>	
			    <span class="navbar-text">
					<a class="btn btn-primary text-white me-3" href="login.jsp" role="button">Login</a>
			    	<a class="btn btn-primary text-white" href="signUp.jsp" role="button">Sign Up</a>
			    </span>	
			</div>
		</div>
	</nav>
	<!-- First part -->
	<div class="container pt-5 mt-4 text-center">
        <h1><%= request.getAttribute("message") %></h1>
    </div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>