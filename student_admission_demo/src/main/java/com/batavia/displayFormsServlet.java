package com.batavia;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EnrollmentForm;
import model.EnrollmentFormBean;
import service.EnrollmentFormService;
import service.EnrollmentFormServiceImpl;


public class displayFormsServlet extends HttpServlet {
    private final EnrollmentFormService formService = new EnrollmentFormServiceImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Retrieve data from the database
    
    List<EnrollmentForm> enrollmentForms = formService.viewEnrollmentForms();
    List<EnrollmentFormBean> enrollmentFormBeans = new ArrayList<>();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    for(EnrollmentForm enrollmentForm: enrollmentForms){
        EnrollmentFormBean enrollmentFormBean = new EnrollmentFormBean();
        enrollmentFormBean.setFormId(enrollmentForm.getFormId());
        enrollmentFormBean.setFirstName(enrollmentForm.getFirstName());
        enrollmentFormBean.setLastName(enrollmentForm.getLastName());
        enrollmentFormBean.setGender(enrollmentForm.getGender());
        enrollmentFormBean.setDob(dateFormat.format(enrollmentForm.getDob()));
        enrollmentFormBean.setPhoneNumber(enrollmentForm.getPhoneNumber());
        enrollmentFormBean.setFaculty(enrollmentForm.getFaculty());
        enrollmentFormBean.setDepartment(enrollmentForm.getDepartment());
        enrollmentFormBean.setSemester(enrollmentForm.getSemester());
        enrollmentFormBean.setAddress(enrollmentForm.getAddress());
        enrollmentFormBean.setPassportPicture(enrollmentForm.getPassportPicture());
        enrollmentFormBean.setPassportPictureType(enrollmentForm.getPassportPictureType());
        System.out.println("TYPE =========>>>>>>>>>>>>" + enrollmentFormBean.getPassportPictureType());
        enrollmentFormBean.setCertificatePdf(enrollmentForm.getCertificatePdf());
        enrollmentFormBean.setStatus(enrollmentForm.getStatus());


        enrollmentFormBeans.add(enrollmentFormBean);

    }
    // Set the list as an attribute in the request object
    request.setAttribute("enrollmentForms", enrollmentFormBeans);
    
    // Forward the request to the JSP page
    request.getRequestDispatcher("/enrollmentData.jsp").forward(request, response);
}
}
