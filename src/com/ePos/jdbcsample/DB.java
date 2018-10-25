/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ePos.jdbcsample;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Shafan
 */
public class DB {
    private static Connection conn;
    
    public static Connection getConnection() throws Exception{
        
        if (conn == null){
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql:///epos","root","");
        }
        return conn;
    }
}
