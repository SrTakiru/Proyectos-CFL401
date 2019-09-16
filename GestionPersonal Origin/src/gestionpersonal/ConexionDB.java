/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Programación
 */
public class ConexionDB {

    private String ip;
    private int puerto;
    private String baseDeDatos;
    private String usuario;
    private String contrasenia;
    private Connection conexion;
    private Statement flujoConexion;

    public ConexionDB(String ip, int puerto, String baseDeDatos, String usuario, String contrasenia) throws SQLException {

        conexion = DriverManager.getConnection("jdbc:mariadb://"
                + ip + ":"
                + puerto + "/"
                + baseDeDatos + "?user="
                + usuario + "&password="
                + contrasenia);
        flujoConexion = conexion.createStatement();
    }
}

