<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%@ page import="service.*" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
 body {
        background-color: #f2f2f2;
        font-family: Arial, Helvetica, sans-serif;
        font-size: 16px;
    }
    form {
        display: flex;
        flex-direction: column;
        align-items: center;
        margin-top: 50px;
    }
    input[type="text"] {
        padding: 10px;
        margin-bottom: 20px;
        border-radius: 5px;
        border: none;
        box-shadow: 0 0 5px rgba(0,0,0,0.2);
    }
    input[type="submit"] {
        padding: 10px 20px;
        background-color: #4CAF50;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;

</style>
</head>
<body>
    <h1>Registration Form</h1>
    <form action="" method="post">
        <label for="code">Course Code:</label>
        <input type="text" name="code"><br>
        <label for="nom_cours">Course Name:</label>
        <input type="text" name="nom_cours"><br>
        <label for="total_ins">Total Registrations:</label>
        <input type="text" name="total_ins"><br>
        <label for="temps">Time:</label>
        <input type="text" name="temps"><br>
        <input type="submit" value="Register">
    </form>
    
    <% if (request.getMethod().equals("POST")) {
            Long code = Long.parseLong(request.getParameter("code"));
            String nomCours = request.getParameter("nom_cours");
            Integer totalInscriptions = Integer.parseInt(request.getParameter("total_ins"));
        } %>
</body>
</html>
