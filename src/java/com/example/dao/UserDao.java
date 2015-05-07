package com.example.dao;

import com.example.model.UserBean;
import com.example.util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public class UserDao {
    public static boolean isValid(UserBean user){
       
        boolean result = false;
        
        DbUtil db = new DbUtil();
       
        Connection connection = db.getConnection();
        
        try{
            PreparedStatement stmt = connection.prepareStatement("select * from user "
                    + "where username=? and password=?");
            
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                result = true;
            }
        rs.close();
        stmt.close();
        db.disconnect();
        
        }catch(SQLException e){
            System.out.println("Connection Problem.");
            e.printStackTrace();
        }
        return result;
    }

}