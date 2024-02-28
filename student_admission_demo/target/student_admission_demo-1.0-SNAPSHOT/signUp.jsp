<!DOCTYPE html>
<html class="h-100">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
	<title>StudentReg - Sign Up</title>
</head>
<body class="d-flex flex-column h-100">
	<jsp:include page="WEB-INF/header.jsp" />
	<!-- First part -->
	<div class="container py-5 mt-5 mx-auto">
		<form class="w-25 mx-auto my-5 needs-validation" action="./signUp" id="signUp" method="post" novalidate>
		  <div class="mb-3">
		  	<p class="text-center fs-4 pb-3">Sign Up Form</p>
		    <label for="inputEmail" class="form-label">Email address</label>
		    <input type="email" class="form-control" id="inputEmail" aria-describedby="emailHelp" name="email" required>
			<div class="invalid-feedback">
				Please enter a valid email address.
			</div>
		  </div>
		  <div class="mb-3">
		    <label for="inputPassword" class="form-label">Password</label>
		    <input type="password" class="form-control" id="inputPassword" name="password" required>
			<div class="invalid-feedback">
		        Please choose a password.
		    </div>
		  </div>
		  <div class="mb-3">
		    <label for="inputPasswordAgain" class="form-label">Confirm Password</label>
		    <input type="password" class="form-control" id="inputPasswordAgain" name="passwordConfirm" required>
			<div class="invalid-feedback">
		        Please choose a password.
		    </div>
		  </div>
		  <button type="submit" class="btn btn-primary">Sign Up</button>
		</form>
	</div>
	<!-- footer	   -->
	<jsp:include page="WEB-INF/footer.jsp" />

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
	<script type="text/javascript" src="script2.js"></script>
</body>
</html>