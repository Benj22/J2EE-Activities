/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.login;

import com.example.model.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Benj_Bong
 */
public class LoginServlet extends HttpServlet{
    
    
    public void init() throws ServletException{
    
    }
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException{
    
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        
        
  
        UserBean userBean=new UserBean();
        boolean isValid=userBean.isUserValid(username, password);
        
        if(isValid){
        RequestDispatcher view=request.getRequestDispatcher("home.jsp");
        view.forward(request, response);
        }
        else
        {
        RequestDispatcher view=request.getRequestDispatcher("index.html");
        view.forward(request, response);
        }

    }
    
     public void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException{
        
     processRequest(request, response);
    
    }
    
    public void destroy(){
    
    }
    
    
    
    
    
}
