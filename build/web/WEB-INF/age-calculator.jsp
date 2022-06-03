<%-- 
    Document   : age-calculator
    Created on : 1-Jun-2022, 4:33:19 PM
    Author     : heetk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculators</title>
    </head>
    <body style="text-align: center;">
        <h1>Age Calculator</h1>
        <form method="POST" action="Age">
            <label>Enter your age:</label>
            <input type="text" name="age"/><br><br>
            <input type="submit" value="Age next birthday" />
        </form>
        <br>
        <label>${msg}</label><br><br>
        <a href="Arithmetic">Arithmetic Calculator</a>
    </body>
</html>
