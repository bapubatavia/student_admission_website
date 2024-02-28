package com.batavia;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EnrollmentForm;
import service.EnrollmentFormService;
import service.EnrollmentFormServiceImpl;


public class DownloadCertificateServlet extends HttpServlet {
    private final EnrollmentFormService formService = new EnrollmentFormServiceImpl();
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type and attachment header
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=\"certificate.pdf\"");

        // Retrieve the certificate PDF file (replace this with your own logic to fetch the PDF file)
        EnrollmentForm enrollmentForm = new EnrollmentForm();

        int formId = Integer.parseInt(request.getParameter("id"));
        enrollmentForm.setFormId(formId);

        EnrollmentForm form = formService.getFormById(enrollmentForm);        
        byte[] certificate = form.getCertificatePdf();

        // Get the output stream of the response
        response.getOutputStream().write(certificate);

    }
}
