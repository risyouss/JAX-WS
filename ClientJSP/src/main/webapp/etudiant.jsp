<%@ page import="service.FormationWSProxy" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    long cd=0;
    double res=0;
    if (request.getParameter("code")!=null){
    	
    	cd=Long.parseLong(request.getParameter("code"));
    	FormationWSProxy service=new FormationWSProxy();
    	res = service.frais_Dinscription(cd);
    }
    
    
    %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client JSP</title>
<style>
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
    }
    b {
        margin-top: 20px;
        font-size: 20px;
        align-items: center;
    }
</style>
</head>
<body>
<form method="Post" action="etudiant.jsp">
Code de la filière choisie :<input type ="text" name="code" value="<%=cd%>">
<input type="submit" value="envoyer" name="btn">
</form>
<b>Frais d'inscription annuelles :<span style="color: #4CAF50;"><%=(int)res %> DH</span></b>

</body>
</html>