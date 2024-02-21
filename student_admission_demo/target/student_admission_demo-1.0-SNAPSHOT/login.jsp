<!DOCTYPE html>
<html class="h-100">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>StudentReg - Login</title>
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
	<div class="container py-5 mt-5 mx-auto">
		<form class="w-25 mx-auto my-5 needs-validation" action="./login" method="post" id="login" novalidate>
		  <div class="mb-3">
		  	<p class="text-center fs-4 pb-3">Login Form</p>
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" required>
			<div class="invalid-feedback">
				Please enter a valid email address.
			</div>
		  </div>
		  <div class="mb-3">
		    <label for="exampleInputPassword1" class="form-label">Password</label>
		    <input type="password" class="form-control" id="exampleInputPassword1" name="password" required>
			<div class="invalid-feedback">
		        Please choose a password.
		    </div>
		  </div>
		  <div class="mb-3 form-check">
		    <input type="checkbox" class="form-check-input" id="exampleCheck1">
		    <label class="form-check-label" for="exampleCheck1">Remember me</label>
		  </div>
		  <button type="submit" class="btn btn-primary">Login</button>
		</form>
	</div>
	<!-- footer	   -->
	<footer class="p-3 mt-5 bg-light text-black text-center position-relative">
		<div class="container pt-2">
			<p class="lead">Copyright &copy; 2024 Luc Bapu Batavia</p>

			<a href="" class="position-absolute bottom-0 end-0 p-3">
				<i class="bi bi-arrow-up-circle h1"></i>
			</a>
		</div>
	</footer>	

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
	<script type="text/javascript" src="script.js"></script>
	<script type="text/javascript" src="script2.js"></script>

</body>
</html>