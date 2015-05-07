package com.example.login;


import com.example.dao.UserDao;
import com.example.model.UserBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
   
    public void init() throws ServletException{
        
    }
       
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserBean userBean = new UserBean();
       
        userBean.setUsername(username);
        userBean.setPassword(password);
        
         RequestDispatcher view;
                  
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            
           
            if(UserDao.isValid(userBean)){
                view = request.getRequestDispatcher("home.jsp");
                view.forward(request, response);                
            }else{
                view=request.getRequestDispatcher("index.html");              
                view.forward(request, response);
            }     
        
    }
    
    
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request,response);
    }
    
    
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        doGet(request, response);
    }
    
    
}