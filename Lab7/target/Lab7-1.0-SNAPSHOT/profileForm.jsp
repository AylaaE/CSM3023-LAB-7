<%-- 
    Document   : profileForm
    Created on : 9 Jun 2024, 12:51:58 am
    Author     : Nur Ezreena
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile Registration</title>
    </head>
    <body>
    <h2>Profile Registration</h2>
    <fieldset>
        <legend>Profile Registration</legend>
        <form action="profileServlet" method="post">
            Username: <br><input type="text" name="username" maxlength="15" required><br>
            IC No: <br><input type="text" name="icno" maxlength="15" required><br>
            First Name: <br><input type="text" name="firstname" maxlength="50" required><br>
            <br>
            <input type="submit" value="Register">
        </form>
    </fieldset>
    <br>
</body>
</html>
