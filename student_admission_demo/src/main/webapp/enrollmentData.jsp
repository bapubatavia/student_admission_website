<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
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
    <jsp:include page="WEB-INF/header.jsp" />

    <!-- First part -->
    <h1 class="text-center pb-3 mb-3">Enrollment Data</h1>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-9">
                <table class="table table-hover mx-auto px-2 rounded-3">
                    <thead class="table-primary">
                        <tr>
                            <th>No.</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Phone Number</th>
                            <th>Faculty</th>
                            <th>Status</th>
                            <th>Option</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:set var="counter" value="0" />
                        <c:forEach var="form" items="${enrollmentForms}">
                            <c:set var="counter" value="${counter + 1}" />
                            <tr>
                                <td>${counter}</td>
                                <td>${form.firstName}</td>
                                <td>${form.lastName}</td>
                                <td>${form.phoneNumber}</td>
                                <td>${form.faculty}</td>
                                <c:choose>
                                    <c:when test="${form.status == 'Pending'}">
                                        <td class="table-secondary">${form.status}</td>
                                    </c:when>
                                    <c:when test="${form.status == 'Accepted'}">
                                        <td class="table-success">${form.status}</td>
                                    </c:when>                            
                                    <c:otherwise>
                                        <td class="table-warning">${form.status}</td>
                                    </c:otherwise>                        
                                </c:choose>
                                <td><a href="#" onClick="MyWindow=window.open('formDetails?id=${form.formId}','MyWindow','width=900,height=600'); return false;">Details</a></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>    
    </div>
    <!-- footer	   -->
	<jsp:include page="WEB-INF/footer.jsp" />
</body>
</html>
