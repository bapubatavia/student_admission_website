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
	<jsp:include page="WEB-INF/header.jsp" />
	<!-- First part -->
	<div class="container pt-0 mt-1 pb-5 my-5 mx-auto mb-5">
		<form class="w-50 mx-auto my-3 row g-3 needs-validation" action="./admission" method="post" id="enrolment" enctype="multipart/form-data" novalidate>
		  	<p class="text-center fs-4 pb-2">Student Admission Form</p>
			<div class="col-md-6">
			    <label for="inputFirstName" class="form-label">First Name</label>
			    <input type="text" class="form-control" id="inputFirstName" name="fName" required>
			</div>
			<div class="col-md-6">
			    <label for="inputLastName" class="form-label">Last Name</label>
			    <input type="text" class="form-control" id="inputLastName" name="lName" required>
			</div>
			<div class="col-md-6">
			    <label for="inputGender" class="form-label">Gender</label>
			    <select id="inputGender" class="form-select" name="gender" required>
					<option selected>Male</option>
					<option>Female</option>
				  </select>
			</div>			
			<div class="col-md-6 ">
			    <label for="inputDob" class="form-label">Date of Birth</label>
			    <input type="date" class="form-control " id="inputDob" name="dateOfBirth" required>
			</div>
			<div class="col-md-6 ">
			    <label for="inputPhoneNum" class="form-label">Phone Number</label>
			    <input type="text" class="form-control " id="inputPhoneNum" name="phoneNumber" required>
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
			    <input type="text" class="form-control" id="inputAddress" placeholder="34 KG 14 Ave." name="address" required>
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
				<input type="hidden" name="formType" value="admission">
		  </div>
		  <button type="submit" name="submit" class="btn btn-primary">Register</button>
		</form>
	</div>
	<!-- footer	   -->
	<jsp:include page="WEB-INF/footer.jsp" />
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>