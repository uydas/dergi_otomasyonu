<%@page import="com.Kullanicilar"%>
<%@page import="com.kullanıcıliste"%>
<%@page import="java.util.ArrayList"%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <% boolean durum = false;
    

        kullanıcıliste a = new kullanıcıliste();
        ArrayList<Kullanicilar> listem = a.listAllKullanici();

        for (int i = 0; i < listem.size(); i++) {
            if (request.getParameter("kullaniciadi").equals(listem.get(i).getKullanıcıadı()) && request.getParameter("sifre").equals(listem.get(i).getSifre())) {
                durum = true;
                session.setAttribute("isLogin", true);
                session.setAttribute("kullaniciid",listem.get(i).getId());
                System.out.println("... :" +listem.get(i).getId());
                session.setAttribute("role", listem.get(i).getRole());
                
                    
                if (durum == true) {
                    if (listem.get(i).getRole() == 0) {    %> 

    <jsp:include page="kullanıcıindex.jsp" />

    <% } else {
    %>
    <jsp:include page="adminindex.jsp" />
    <%
                    }

                }
            }
        }
        if (durum == false) {     %>

    <jsp:include page="login.jsp" />

    <%
        }

    %>   




</body>
</html>