<%-- 
    Document   : arithmatic-calculator
    Created on : 1-Jun-2022, 4:33:43 PM
    Author     : heetk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body style="text-align: center;">
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="Arithmetic">
            <label>First:</label>
            <input type="text" name="first"/><br><br>
            <label>Second:</label>
            <input type="text" name="second"/><br><br>
            <input type="submit" value="+" name="calculate"/>
            <input type="submit" value="-" name="calculate"/>
            <input type="submit" value="*" name="calculate"/>
            <input type="submit" value="/" name="calculate"/>
        </form>
        <br>
        <label>${msg}</label><br><br>
        <a href="Age">Age Calculator</a>
    </body>
</html>
