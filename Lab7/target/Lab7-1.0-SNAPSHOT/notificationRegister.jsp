<%-- 
    Document   : notificationRegister
    Created on : 9 Jun 2024, 1:13:19 am
    Author     : NUR EZREENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
        // Use the implicit session object directly without declaring it
        HttpSession currentSession = request.getSession(false);
        if (currentSession == null || currentSession.getAttribute("studentid") == null || currentSession.getAttribute("name") == null) {
            response.sendRedirect("studentRegister.jsp");
            return;
        }

        String studentid = (String) currentSession.getAttribute("studentid");
        String name = (String) currentSession.getAttribute("name");

        currentSession.invalidate();
    %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Notification</title>
</head>
<body>
    <h2>Registration Notification</h2>
    <p>Student ID: <%= studentid %></p>
    <p>Name: <%= name %></p>
    <p>Your registration has been successfully completed.</p>
</body>
</html>