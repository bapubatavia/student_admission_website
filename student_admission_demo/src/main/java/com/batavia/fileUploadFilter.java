package com.batavia;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class fileUploadFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
        // Initialization code if needed
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;


        String contentType = request.getContentType();
        if (contentType != null && contentType.startsWith("multipart/form-data")) {
            Part filePicPart = request.getPart("filePicture");
        
            Part fileCertPart = request.getPart("filePdf");

            // Log the file name and content type for debugging purposes
            System.out.println("File name: " + filePicPart.getSubmittedFileName());
            System.out.println("File content type: " + filePicPart.getContentType());
            System.out.println("File name: " + fileCertPart.getSubmittedFileName());
            System.out.println("File content type: " + fileCertPart.getContentType());

            // Check if the uploaded file is a PDF
            if (fileCertPart != null && fileCertPart.getContentType().equals("application/pdf")) {
                // PDF file detected, allow the request to proceed
                chain.doFilter(req, resp);
            } else {
                // File is not a PDF, return an error response
                response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "Only PDF files are allowed");
                return;
            }

            if (filePicPart != null &&(filePicPart.getContentType().equals("image/jpeg") || filePicPart.getContentType().equals("image/png"))){
                chain.doFilter(req, resp);

            } else{
                response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE, "Only JPG and PNG pictures are allowed");
            }



        } else {
            // Not a multipart form data request, allow the request to proceed
            chain.doFilter(req, resp);
        }
    }

    public void destroy() {
        // Cleanup code if needed
    }
}
