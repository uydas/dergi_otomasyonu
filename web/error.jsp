<%-- 
    Document   : error
    Created on : 19.Tem.2019, 11:41:23
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login Error</title>

</head>

<body>

<center><p style="color:red">Sorry, your record is not available.</p></center>

<%

getServletContext().getRequestDispatcher("/login.jsp").include(request, 
response);

%>

</body>

</html>