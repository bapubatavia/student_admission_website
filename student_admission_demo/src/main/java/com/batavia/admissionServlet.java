package com.batavia;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import model.EnrollmentForm;
import service.EnrollmentFormService;
import service.EnrollmentFormServiceImpl;


@MultipartConfig
public class admissionServlet extends HttpServlet {
    private final EnrollmentFormService formService = new EnrollmentFormServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EnrollmentForm form = new EnrollmentForm();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            String firstName = request.getParameter("fName");
            form.setFirstName(firstName);
            String lastName = request.getParameter("lName");
            form.setLastName(lastName);
            String gender = request.getParameter("gender");
            form.setGender(gender);
            Date dateOfBirth = dateFormat.parse(request.getParameter("dateOfBirth"));
            form.setDob(dateOfBirth);
            String phoneNumber = request.getParameter("phoneNumber");
            form.setPhoneNumber(phoneNumber);
            String faculty = request.getParameter("fac");
            form.setFaculty(faculty);
            String department = request.getParameter("dep");
            form.setDepartment(department);
            String semester = request.getParameter("semester");
            form.setSemester(semester);               
            String address = request.getParameter("address");
            form.setAddress(address);
            form.setStatus("Pending");
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
        try {
            Part fileCertPart = request.getPart("filePdf");
            byte[] fileCertBytes = convertPartToByteArray(fileCertPart);
            form.setCertificatePdf(fileCertBytes);
            Part filePicPart = request.getPart("filePicture");
            byte[] filePicBytes = convertPartToByteArray(filePicPart);
            form.setPassportPicture(filePicBytes);
            form.setPassportPictureType(filePicPart.getContentType());
            System.out.println(filePicPart.getContentType());
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
        
        formService.registerForm(form);

        request.setAttribute("javax.servlet.include.servlet_path", "admissionServlet");

        request.getRequestDispatcher("/WEB-INF/admission_reply.jsp").forward(request, response);
    }

    private byte[] convertPartToByteArray(Part part) throws IOException {
        try (InputStream inputStream = part.getInputStream();
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }
            return outputStream.toByteArray();
        }
    }
}
