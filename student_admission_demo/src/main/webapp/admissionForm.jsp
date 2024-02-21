<!DOCTYPE html>
<html class="h-100">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>StudentReg - Registration</title>
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
	<div class="container py-2 my-5 mx-auto">
		<form class="w-50 mx-auto my-3 row g-3 needs-validation" action="./admission" method="post" id="enrolment" enctype="multipart/form-data" novalidate>
		  	<p class="text-center fs-4 pb-4">Student Admission Form</p>
			<div class="col-md-6">
			    <label for="inputFirstName" class="form-label">First Name</label>
			    <input type="text" class="form-control" id="inputFirstName" name="fName" required>
			</div>
			<div class="col-md-6">
			    <label for="inputLastName" class="form-label">Last Name</label>
			    <input type="text" class="form-control" id="inputLastName" name="lName" required>
			</div>
			<div class="col-md-6 ">
			    <label for="inputID" class="form-label">Student ID</label>
			    <input type="text" class="form-control " id="inputID" name="studentId" required>
			</div>
			<div class="col-md-6">
			    <label for="inputDepartment" class="form-label">Faculty</label>
			    <input type="text" class="form-control" id="inputFaculty" name="fac" required>
			</div>
			<div class="col-md-6">
			    <label for="inputPosition" class="form-label">Department</label>
			    <input type="text" class="form-control" id="inputDepartment" name="dep" required>
			</div>
			<div class="col-md-6">
			    <label for="inputSem" class="form-label">Semester</label>
			    <select id="inputSem" class="form-select" name="semester" required>
			      <option selected>Semester I</option>
			      <option>Semester II</option>
			      <option>Semester III</option>
			      <option>Semester IV</option>
			      <option>Semester V</option>
			      <option>Semester VI</option>
				</select>
			</div>
			<div class="col-12">
			    <label for="inputAddress" class="form-label">Address</label>
			    <input type="text" class="form-control" id="inputAddress" placeholder="34 KG 14 Ave." name="address_one" required>
			</div>
			<div class="col-md-6">
			    <label for="inputFile" class="form-label">Upload passport picture(.jpg/.png)</label>
			    <input type="file" class="form-control" id="inputFile" name="filePicture" required>
			</div>
			<div class="col-md-6">
			    <label for="inputFile" class="form-label">Upload receipt (PDF only)</label>
			    <input type="file" class="form-control" id="inputFile" name="filePdf" required>
			</div>
			<div class="col-md-5 mb-3 form-check">
			    <input type="checkbox" class="form-check-input" id="termValidationCheck" required>
			    <label class="form-check-label" for="termValidationCheck">I agree to terms and conditions</label>

		  </div>
		  <button type="submit" name="submit" class="btn btn-primary">Register</button>
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
</body>
</html>