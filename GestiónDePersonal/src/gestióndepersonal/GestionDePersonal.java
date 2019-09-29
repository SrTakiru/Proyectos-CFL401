/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestióndepersonal;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author CFL 401
 */
public class GestionDePersonal {

    private static MenuPrincipal menuPrincipal;
    private static CargaUsuario cargarUsuario;
    private static GenerarTablas generarTablas;
    private static ProyectoTest testVentana;
    private static ConexionDB conexionDB;
    private static VentanaPrincipal ventanaPrincipal;
    private static PanelLogin panelLogin;
    private static DatosDeConexion datosDeConexion;

    public static ConexionDB getConexionDB() {
        return conexionDB;
    }

    public static void setConexionDB(ConexionDB conexionDB) {
        GestionDePersonal.conexionDB = conexionDB;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menuPrincipal = new MenuPrincipal();
        cargarUsuario = new CargaUsuario(primerUsuario());
        generarTablas = new GenerarTablas();
        testVentana = new ProyectoTest();
        ventanaPrincipal = new VentanaPrincipal();

        MenuPrincipal();


        /*
        
        if(primerUsuario()){
        
        cambiarVentana("cargarU");
        
        
        }
        else{
        }
        //cambiarVentana("menu");
        testVentana.setVisible(true);
        
        
        
        /*if(primerUsuario()){
   
        cargarUsuario.setTitle("Carga de Usuario GG");
         
        cargarUsuario.dispose();
        cargarUsuario.setLocationRelativeTo(null); //Centrar la ventana en la pantalla.
        cargarUsuario.setUndecorated(false);
        //cargarUsuario.setVisible(true);
        
        
        }*/
    }

    public static void cambiarVentana(String nombre) {

        switch (nombre) {

            case "menu":
                ocultarVentana();
                menuPrincipal.setVisible(true);

                break;

            case "cargarU":
                ocultarVentana();
                cargarUsuario.setVisible(true);

                break;

            case "generarTabla":
                ocultarVentana();
                generarTablas.setVisible(true);

                break;

            default:
                JOptionPane.showMessageDialog(null, "No se encontró la opción");

        }

    }

    public static void ocultarVentana() {

        menuPrincipal.setVisible(false);
        cargarUsuario.setVisible(false);
        generarTablas.setVisible(false);

    }

    private static boolean primerUsuario() {

        return false;

    }

    public static void mostrar() {

        System.out.println(conexionDB);

    }

    public static ProyectoTest getTestVentana() {
        return testVentana;
    }

    public static void MenuPrincipal() {
        ventanaPrincipal.setTitle("Proyecto JoinSystems");
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setSize(300, 400);
        ventanaPrincipal.mostraElLogin();
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setResizable(false);
    }

    public static void ocultarVentanaPrincipal(){
        ventanaPrincipal.setVisible(false);
    }
}


