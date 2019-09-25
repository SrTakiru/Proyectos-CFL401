/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestióndepersonal;

import java.sql.*;

/**
 *
 * @author CFL 401
 */
public class ConexionDB {

    DatosDeConexion datos = new DatosDeConexion();
    private String ip;
    private String puerto;
    private String baseDeDatos;
    private String usuario;
    private String contrasenia;
    private Connection conexion; //Conexión con el servidor de BasesDeDatos
    private Statement flujoConexion;//Enlace entre la conexión y el motor.
    private String flujoEntrada;
    private String flujoSalida;

    public ConexionDB(String ip, String puerto, String baseDeDatos, String usuario, String contrasenia) throws SQLException {
        this.ip = ip;
        this.puerto = puerto;
        this.baseDeDatos = baseDeDatos;
        this.usuario = usuario;
        this.contrasenia = contrasenia;

    }

    public void crearTabla(String nombreTabla, String columnas) throws SQLException {

        System.err.println("CREATE TABLE IF NOT EXISTS " + nombreTabla + " (" + columnas + ")");
        flujoConexion.execute("CREATE TABLE IF NOT EXISTS " + nombreTabla + " (" + columnas + ")");

    }

    public ResultSet consultar(String consulta) throws SQLException {

        return flujoConexion.executeQuery(consulta);

    }

    public void insertar(String tabla, String columnas, String valores, String condiciones) throws SQLException {

        if (columnas == null) {
            flujoConexion.execute("INSERT INTO " + tabla + " VALUES(" + valores + ") " + condiciones + ";");
        } else {
            flujoConexion.execute("INSERT INTO " + tabla + "(" + columnas + ")" + " VALUES(" + valores + ") " + condiciones + ";");

        }

    }

    public void actualizar(String tabla, String valores, String condiciones) throws SQLException {

        flujoConexion.execute("UPDATE " + tabla + " SET " + valores + " WHERE " + condiciones + ";");

    }

    public void cerrarConex() throws SQLException {

        if (flujoConexion != null) {

            flujoConexion.close();

        }

        if (flujoConexion != null) {

            conexion.close();

        }

    }

    public boolean conectarADB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mariadb://" + ip + ":" + puerto + "/" + baseDeDatos + "?user=" + usuario + "&password=" + contrasenia);
            flujoConexion = conexion.createStatement();

            return true;
        } catch (SQLException e) {
            return false;
        }

    }

}

