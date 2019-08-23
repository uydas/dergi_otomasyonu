<%-- 
    Document   : logout
    Created on : 20.Ağu.2019, 15:50:38
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
 <% session.invalidate(); 
response.sendRedirect("login.jsp");
 %>
 
</body>
</html>
