package com.batavia;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class authenticationFilter implements Filter {
    public void init(FilterConfig argo) throws ServletException{
    }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession(false);
        boolean loggedIn = session != null && session.getAttribute("email") != null;

        if(loggedIn){
            chain.doFilter(httpRequest, httpResponse);
        } else{
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
        }
    }
    
}