package com.batavia;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;

@WebListener
public class formSubmitListener implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        ServletRequest servletRequest = servletRequestEvent.getServletRequest();
        String servletName = (String) servletRequest.getAttribute("javax.servlet.include.servlet_path");

        if ("loginServlet".equals(servletName) || "admissionServlet".equals(servletName)) {
            System.out.println(servletName + " destroyed. Remote IP=" + servletRequest.getRemoteAddr());
            if (servletRequest instanceof HttpServletRequest) {
                HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
                String email = (String) httpRequest.getSession().getAttribute("email");
                if (email != null) {
                    try {
                        signUpEmail.sendMail(email, servletName);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
