package com.batavia;

import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class signUpEmail {
    public static void sendMail(String recepient, String formName) throws Exception{
        Properties properties = new Properties();

        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.ssl.enable", "true");
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");
        properties.setProperty("mail.smtp.port", "465");

        String myEmail = "sendemailjava123@gmail.com";
        String myPassword = "guctngyxfucxmqai";

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myEmail, myPassword);
            }
        });

        session.setDebug(true);

        Message message = prepareMessage(session, myEmail, recepient, formName);

        Transport.send(message);
        System.out.println("Message sent successfully");
    }

        private static Message prepareMessage(Session session, String myEmail, String recepient, String formName){
            try{
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(myEmail));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
                if(formName == "signUp"){
                    message.setSubject("IpsumTab - Registration successful!");
                    message.setText("Your registration has been successfully completed. \n Thank you for signing up! \n Best regards, \n Your IpsumTab team");
                    return message;
                } else{
                    message.setSubject("IpsumTab - Login notification!");
                    message.setText("Your account has been logged into.\n Best regards, \n Your IpsumTab team");
                    return message;                    
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            return null;
        }
}
