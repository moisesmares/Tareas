package org.example.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingleton {
        private String baseDatos;
        private Connection connection;
        private static org.example.persistencia.ConexionSingleton _instance;

        public ConexionSingleton(String baseDatos) {
            this.baseDatos = baseDatos;
            try{
                //Class.forName("org.sqlite.JDBC");
                connection = DriverManager.getConnection("jdbc:sqlite:"+this.baseDatos);
            }catch (SQLException sqle){
                sqle.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        public static org.example.persistencia.ConexionSingleton getInstance(String baseDatos){
            if (_instance == null){
                _instance = new org.example.persistencia.ConexionSingleton(baseDatos);
            }else{
                System.out.println("Ya fue creada");
            }
            return _instance;
        }
        public Connection getConnection(){
            return connection;
        }
    }

