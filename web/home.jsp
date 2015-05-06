<%-- 
    Document   : home
    Created on : May 6, 2015, 3:43:32 PM
    Author     : Benj_Bong
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name= request.getParameter("username");
                    
        %>
        <h1> Hello, <%=name%>!</h1>
        <h2> Welcome to Home Page !</h2>
    </body>
</html>
