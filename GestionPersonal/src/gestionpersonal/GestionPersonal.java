package gestionpersonal;

import java.sql.*;

public class GestionPersonal {

    private static MenuPrincipal menuPrincipal;
    private static GenerarTablas generarTablas;
    private static CargaUsuarios cargaUsuarios;

    public static void main(String[] args) throws SQLException {
        menuPrincipal = new MenuPrincipal();
        cargaUsuarios = new CargaUsuarios();
        generarTablas = new GenerarTablas();
        Connection conexion;
        conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/cfl401?user=programador&password=cfl401");
        Statement consultor = conexion.createStatement();
        // ResultSet resultado = consultor.executeQuery("");
        menuPrincipal.setVisible(true);
    }

    public static void cambiarVentana(){
        
    }
}

