package com.programming;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class AutomaticEmailSender {
    public static void main(String[] args) {
        mailSender();
    }

    public static void mailSender() {
        List<String> emailList = Arrays.asList("dipankar@e-labs.ai");

        for (String email : emailList) {
            // Replace these with your email credentials
            String senderEmail = "dipankarbhaduri8@gmail.com";
            String appPassword = null;
            String recipientEmail = email;
            String applicantName = "Dipankar Bhaduri";
            String currentCompany = "E-Labs.ai";
            String achievements = "improving role-based permissions, implementing SQS flows to solve data loss issues, and reducing server costs by 12%";
            String education = "Java, Spring Boot, and Data Structures and Algorithms training program at Acciojob";
            String degree = "Bachelor of Technology from Maulana Abul Kalam Azad University of Technology with a CGPA of 8.70";
            String contactInformation = "+91-8100003959";

            String emailContent = "Dear Hiring Team,\n\n" +
                    "I trust this message finds you well. I am " + applicantName +
                    ", expressing my interest in the Java Backend Developer position within your organization.\n\n" +
                    "In my current role at " + currentCompany +
                    ", I improved role-based permissions and implemented SQS flows, addressing data loss issues and resulting in a 12% reduction in server costs.\n\n" +
                    "I have 2 years of hands-on expertise in Java Spring Boot and have successfully contributed to projects like Mind Genius and the Task Management System, showcasing my ability to create innovative solutions and improve project management efficiency.\n\n" +
                    "I have completed a comprehensive " + education +
                    " and hold a " + degree + ".\n\n"+ "My technical skills include proficiency in Python, Java, C, JavaScript, MySQL, HTML, CSS, and Bootstrap, with experience in frameworks like Spring Boot, Hibernate, JPA, Git, Microservices, GitHub, MongoDB, Kafka, and Docker.\n\n" +
                    "Kindly find my attached resume for your consideration. I am eager to discuss how my skills can benefit your team.\n\n" +
                    "Thank you for your time.\n\n" +
                    "Best regards,\n\n" +
                    applicantName + "\n" +
                    contactInformation;

            // Email configuration
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            // Authenticate sender
            Session session = Session.getInstance(props, new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, appPassword);
                }
            });

            try {
                // Create a message
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(senderEmail));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
                message.setSubject("Subject: Application for Java Backend Developer Position With 2 Years of Experienced.");

                // Create the message part
                BodyPart messageBodyPart = new MimeBodyPart();

                // Now set the actual message
                messageBodyPart.setText(emailContent);

                // Create a multipart message
                Multipart multipart = new MimeMultipart();

                // Set text message part
                multipart.addBodyPart(messageBodyPart);

                // Part two is attachment
                messageBodyPart = new MimeBodyPart();
                String filename = "D:/Self-Progress/Resume/video/Dipankar_Java_Experienced_Resume.pdf";
                DataSource source =  new FileDataSource(filename);
                messageBodyPart.setDataHandler(new DataHandler((javax.activation.DataSource) source));
                messageBodyPart.setFileName("Dipankar_Java_Experienced_Resume.pdf");
                multipart.addBodyPart(messageBodyPart);

                // Send the complete message parts
                message.setContent(multipart);

                // Send message
                Transport.send(message);
                System.out.println(email+" sent successfully!");
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
