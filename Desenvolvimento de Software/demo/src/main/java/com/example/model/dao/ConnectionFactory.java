package com.example.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection con = null;

    public static Connection getConnection(){
        String database = "sistema";
        String host = "localhost";
        String user = "root";
        String pass = "1234";
        String url = "jdbc:mysql://"+host+"/"+database;
        if(con != null){
            return con;
        }else{
            try{
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Banco de dados conectado!");
                return con;
            }catch(SQLException ex){
                System.out.println("Erro ao conectar no banco "+ database);
                return null;
            }
        }
    }
}
