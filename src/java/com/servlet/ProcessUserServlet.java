/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Benj_Bong
 */
public class ProcessUserServlet extends HttpServlet {
    
    
    
     public void init() throws ServletException{
    
    }
    
    
    public void doGet(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException{
    
    
        String name=request.getParameter("name");
        String course=request.getParameter("course");
        String [] language=request.getParameterValues("language");
        String fight =request.getParameter("fight");
        String type=request.getParameter("type");
        
        PrintWriter out=response.getWriter();
       
        out.println("<font size=4 face=Calibri> Hello, <b>"+ name +"</b>!"+"</font><br><hr align=\"left\" width=\"25%\"><br>");
        out.println("<font size=4 face=Calibri> Type: "+ type +"?</font><br><br>");
        out.println("<font size=4 face=Calibri> Are you sure you will graduate "+ course +"?</font><br><br>");
        out.println("<font size=4 face=Calibri> You need to finish this :</font>");
        out.print("<ul>");
        for (String s :  language){
            
        out.print("<li><font size=4 face=Calibri>"+s+"</li></font>");
        
        }
        out.print("</ul>");
        
        if(fight.equals("Pacquiao"))
            out.println("<br><font size=4 face=Calibri>Your favorite boxer is Pacquiao. </font>");
        else
            out.println("<font size=4 face=Calibri>Your favorite boxer is May Weather.");
          out.print("</body> </html>");
        
           
    }
    
      public void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException{
        
        doGet(request, response);
    
    }
    
    public void destroy(){
    
    }
    
}
