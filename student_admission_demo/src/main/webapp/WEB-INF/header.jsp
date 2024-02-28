<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:set var="role" value="${sessionScope.role}" scope="session"/>
<c:set var="email" value="${sessionScope.email}" scope="session"/>
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
                <c:choose>
                    <c:when test="${role eq 'admin'}">
                        <li class="nav-item me-5">
                            <a href="enrollmentData" class="nav-link">Submitted Applications</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <!-- You can optionally include some other content here for non-admin users -->
                    </c:otherwise>
                </c:choose>  
            </ul>
            <c:choose>
                <c:when test="${empty email}">
                    <span class="navbar-text">
                        <a class="btn btn-primary text-white me-3" href="login.jsp" role="button">Login</a>
                        <a class="btn btn-primary text-white" href="signUp.jsp" role="button">Sign Up</a>
                    </span>	
                </c:when>
                <c:otherwise>
                    <div class="navbar-text d-flex align-items-center">
                        <p class="mb-0 me-3">Hello,<br>${email}</p>
                        <a class="btn btn-primary text-white" href="logout" role="button">Log Out</a>
                    </div>
                </c:otherwise>
            </c:choose> 
        </div>
    </div>
</nav>