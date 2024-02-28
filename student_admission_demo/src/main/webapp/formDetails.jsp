<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html class="h-100">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>StudentReg - Forms</title>
</head>
<body>
<div class="container mt-5">
    <div class="card p-4 rounded">
        <h1 class="text-center mb-4">Enrollment Form Details</h1>


        <!-- Profile Picture -->
        <div class="position-relative mb-4">
            <img src="data:image/jpeg;base64,${enrollmentForm.base64Image}" alt="Passport Picture" class="img-fluid rounded-circle" style="max-width: 100px; max-height: 100px; position: absolute; top: -20px; right: 20px;">
        </div>

        <div class="row justify-content-center">
            <!-- Details -->
            <div class="col-md-6">
                <p class="fw-bold">Form ID: ${enrollmentForm.formId}</p>
                <p class="fw-bold">First Name: ${enrollmentForm.firstName}</p>
                <p class="fw-bold">Phone Number: ${enrollmentForm.phoneNumber}</p>
                <p class="fw-bold">Department: ${enrollmentForm.department}</p>
            </div>
            <div class="col-md-6">
                <p class="fw-bold">Last Name: ${enrollmentForm.lastName}</p>
                <p class="fw-bold">Gender: ${enrollmentForm.gender}</p>
                <p class="fw-bold">Semester: ${enrollmentForm.semester}</p>
                <p class="fw-bold">Address: ${enrollmentForm.address}</p>
            </div>
        </div>

        <!-- Download Certificate Button -->
        <div class="text-center mb-4">
            <a class="btn btn-primary mb-3" href="downloadCertificate?id=${enrollmentForm.formId}" role="button">Download Certificate</a> <!-- Added button for downloading certificate -->
        </div>
        
        <div class="text-center mt-4">
            <!-- Action Buttons -->
            <div class="d-flex justify-content-center">
                <a class="btn btn-success me-3" href="updateStatus?id=${enrollmentForm.formId}&status=Accepted" role="button">Accept</a>
                <a class="btn btn-danger" href="updateStatus?id=${enrollmentForm.formId}&status=Rejected" role="button">Deny</a>
            </div>

            <!-- Notification area -->
            <div id="notification" style="display: none;" class="alert alert-dismissible fade show mt-4" role="alert">
                <strong id="notificationMessage"></strong>
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        </div>
    </div>
</div>

<script>
    function showNotification(message) {
        var notification = document.getElementById('notification');
        var notificationMessage = document.getElementById('notificationMessage');
        notificationMessage.textContent = message;
        notification.style.display = 'block';

        setTimeout(function() {
            notification.style.display = 'none';
        }, 3000);
    }
</script>    
</body>
</html>
