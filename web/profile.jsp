

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    response.setHeader("Cache-Control","no-store, must revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", -1);
    
    if(session.getAttribute("username")!=null){
    
%>
<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:11:13 PM
    Author     : Benj_Bong
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body link="#C0C0C0" vlink="#808080" alink="#FF0000"> 
     
        
        <font face="calibri" size =5>  
      
      <a href="home.jsp">
          Home
      </a> | 
      <a href="profile.jsp">
          Profile
      </a> |
          
          </font>
  
           <font face="calibri" size =3>
           Hello,
           <b> <%=session.getAttribute("username")%></b>!
           </font>
           
           <br> 
           <hr>
           <br>
           <br>
           <br>
           <br>
           <font face="calibri" size =4>
           Personal Information
           </font>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <hr>
         <font face="calibri" size =2>
       <a href="LogoutServlet">
           Logout
       </a>
         </font>
         
    </body>
</html>

<%
    }else
        response.sendRedirect("index.html");
%>