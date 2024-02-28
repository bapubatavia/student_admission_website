package com.batavia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EnrollmentForm;
import service.EnrollmentFormService;
import service.EnrollmentFormServiceImpl;

public class UpdateStatusServlet extends HttpServlet {
    private final EnrollmentFormService formService = new EnrollmentFormServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EnrollmentForm formToUpdate = new EnrollmentForm();
        EnrollmentForm formToSend = new EnrollmentForm();
        int formId = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");
        formToUpdate.setFormId(formId);
        formToSend = formService.getFormById(formToUpdate);
        formToSend.setStatus(status);
        formService.updateForm(formToSend);
        

        String notification = "Form status has been updated to " + status;
        request.setAttribute("notification", notification);

        response.sendRedirect("formDetails.jsp?id=" + formId);
    }
}
