package com.batavia;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import service.UserService;
import service.UserServiceImpl;

public class loginServlet extends HttpServlet {
    public final UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        String email = request.getParameter("email");
        user.setEmail(email);
        // String emailDemo = "bapu.batavia@gmail.com";
        String password = hashPassword(request.getParameter("password"));
        user.setPassword(password);
        // String passwordDemo = "12345";
        User userObj = userService.loginUser(user);
        String messageGood = "Successfully logged in.";
        String messageBad = "Login failed.";
        String role = userObj.getRole();

        if(password.equals(userObj.getPassword())){
            request.setAttribute("message", messageGood);
            HttpSession session = request.getSession(true);     
            session.setAttribute("email", email);
            session.setAttribute("role", role);
            // try {
            //     signUpEmail.sendMail(email, "login");
            // } catch (Exception e) {
            //     e.printStackTrace();
            // }
            System.out.println("Role: " + session.getAttribute("role"));
        }else{
            System.out.println("wrong password");
            request.setAttribute("message", messageBad);
        }
        

        try {
            request.setAttribute("javax.servlet.include.servlet_path", "loginServlet");
            request.getRequestDispatcher("/WEB-INF/login_reply.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };
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
