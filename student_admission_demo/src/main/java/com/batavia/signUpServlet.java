package com.batavia;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;
import service.UserServiceImpl;

public class signUpServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        String email = request.getParameter("email");
        String password = hashPassword(request.getParameter("password"));
        request.setAttribute("email", email);   
        
        user.setEmail(email);
        user.setPassword(password);
        user.setRole("student");

        User userObj = userService.registerUser(user);

        if(userObj != null){
            System.out.println("works");
            response.sendRedirect("login.jsp");
        }else{
            System.out.println("doesn't work");            
        }

    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
