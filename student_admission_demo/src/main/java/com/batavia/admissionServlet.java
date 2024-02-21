package com.batavia;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;


@MultipartConfig
public class admissionServlet extends HttpServlet{
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{

        String first_name = request.getParameter("fName");
        request.setAttribute("fname", first_name);
        String last_name = request.getParameter("lName");
        request.setAttribute("lname", last_name);
        String studentId = request.getParameter("studentId");
        request.setAttribute("stuId", studentId);        
        String faculty = request.getParameter("fac");        
        request.setAttribute("fac", faculty);
        String department = request.getParameter("dep");
        request.setAttribute("dep", department);
        String semester = request.getParameter("semester");
        request.setAttribute("sem", semester);               
        String address_one = request.getParameter("address_one");
        request.setAttribute("address_one", address_one);
        try {
            Part fileCertPart = request.getPart("filePdf");
            request.setAttribute("certificateName", fileCertPart.getSubmittedFileName());
            Part filePicPart = request.getPart("filePicture");
            request.setAttribute("imageName", filePicPart.getSubmittedFileName());
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
        // HttpSession session = request.getSession(false); 
        // try {
        //     signUpEmail.sendMail((String)session.getAttribute("email"), "admissionForm");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        try {
            request.getRequestDispatcher("/WEB-INF/admission_reply.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };

    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }    
}
