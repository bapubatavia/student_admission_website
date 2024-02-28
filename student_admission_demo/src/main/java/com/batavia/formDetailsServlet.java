package com.batavia;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EnrollmentForm;
import service.EnrollmentFormService;
import service.EnrollmentFormServiceImpl;

public class formDetailsServlet extends HttpServlet {
    private final EnrollmentFormService formService = new EnrollmentFormServiceImpl();


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EnrollmentForm enrollmentForm = new EnrollmentForm();

        int formId = Integer.parseInt(request.getParameter("id"));
        enrollmentForm.setFormId(formId);

        EnrollmentForm form = formService.getFormById(enrollmentForm);

        request.setAttribute("enrollmentForm", form);
        

        request.getRequestDispatcher("/formDetails.jsp").forward(request, response);
    }
}
