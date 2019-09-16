/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPersonal;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.sql.*;

/**
 *
 * @author Programación
 */
public class ConexionDB {

    private String ip;
    private String puerto;
    private String baseDeDatos;
    private String usuario;
    private String contrasenia;
    private Connection conexion;
    private Statement flujoConexion;

    public ConexionDB(String ip, String puerto, String baseDeDatos, String usuario, String contrasenia) throws SQLException {
        this.ip = ip;
        this.puerto = puerto;
        this.baseDeDatos = baseDeDatos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        conexion = DriverManager.getConnection("jdbc:mariadb://"
                + ip + ":"
                + puerto + "/"
                + baseDeDatos + "?user="
                + usuario + "&password="
                + contrasenia);
        flujoConexion = conexion.createStatement();
    }

    public void crearTabla(String tabla, String columnas) throws SQLException {
        flujoConexion.execute("CREATE TABLE IF NOT EXISTS " + tabla + "( " + columnas + " );");
    }

    public ResultSet consultar(String consulta) throws SQLException {
        return flujoConexion.executeQuery(consulta);
    }

    public void insertar(String tabla, String valores, String columnas, String condicion) throws SQLException {
        if (columnas != null) {
            flujoConexion.execute("INSERT INTO " + tabla + "( " + columnas + ") VALUES ( " + valores + " ) " + condicion + "; ");
        } else {
            flujoConexion.execute("INSERT INTO " + tabla + " VALUES(" + valores + ") " + condicion + "; ");
        }
    }

}

