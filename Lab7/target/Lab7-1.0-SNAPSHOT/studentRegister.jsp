<%-- 
    Document   : studentRegister
    Created on : 9 Jun 2024, 1:12:16 am
    Author     : NUR EZREENA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Registration</title>
    <style>
        label {
            display: inline-block;
            width: 150px;
            margin-right: 10px;
        }
    </style>
</head>
<body>
    <h2>Student Registration</h2>
    <form action="confirmRegister.jsp" method="post">
        <label for="studentid">Student ID:</label>
        <input type="text" id="studentid" name="studentid" required><br>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
