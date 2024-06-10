<%-- 
    Document   : confirmRegister
    Created on : 9 Jun 2024, 1:12:51 am
    Author     : NUR EZREENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    String studentid = request.getParameter("studentid");
    String name = request.getParameter("name");

    // Use the implicit session object directly without declaring it
    session.setAttribute("studentid", studentid);
    session.setAttribute("name", name);
%>
<!DOCTYPE html>
<html>
<head>
    <title>Confirm Registration</title>
</head>
<body>
    <h2>Confirm Registration</h2>
    <p>Student ID: <%= studentid %></p>
    <p>Name: <%= name %></p>
    <form action="notificationRegister.jsp" method="post">
        <input type="submit" value="Proceed">
    </form>
</body>
</html>