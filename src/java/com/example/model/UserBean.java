/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author Benj_Bong
 */
public class UserBean {
    private String username="Benjie";
    private String password="Benjie";
    
    

    public boolean isUserValid(String user, String pass) {
   
        boolean flag;
   if(user.equals(username) && pass.equals(password)){
   flag=true;
   }
   else
       flag=false;
   
   return flag;
//To change body of generated methods, choose Tools | Templates.
    }
}
