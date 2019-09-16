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
        
        menuPrincipal.setVisible(true);
    }

    public static void generarArea() {
        menuPrincipal.setVisible(false);
        cargaUsuarios.setVisible(false);
        generarTablas.setVisible(true);
    }

    public static void cargarUsuario() {
        menuPrincipal.setVisible(false);
        cargaUsuarios.setVisible(true);
        generarTablas.setVisible(false);
    }
    
    
}


