/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionPersonal;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Programación
 */
public class GestionDePersonal {
    private static MenuPrincipal menuPrincipal;
    private static CargaUsuario ventanaCU;
    private static GenerarAreas ventanaGA;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        /*
        Hay que hacer las corroboraciones de espacio en los campos donde se admiten letras:
            - No se admiten espacios al inicio y al final
            - No se admiten dos espacios juntos
            - La primera letra se tiene que poner en mayúscula si el usuario ingresa una minúscula
            - La primera letra de la segunda palabra tiene que ser mayúscula si se ingresa una minúscula
        
        Poner el método de primerUsuario en GestionDePersonal, crear un getter en CargaDeUsuario y luego
        crear un if que se va a encargar de que ventana mostrar (dependiendo del resulado del método primerUsuario)
        
        */
        
        ConexionDB conexionDB = new ConexionDB("127.0.0.1", "3306", "cfl401", "programador", "cfl401");
        
        menuPrincipal = new MenuPrincipal();
        ventanaCU = new CargaUsuario();
        ventanaGA = new GenerarAreas();
        
        menuPrincipal.setTitle("Gestion de personal");
        ventanaGA.setTitle("Generar áreas");
        ventanaCU.setTitle("Cargar usuarios");
        
        
        if(CargaUsuario.primerUsuario){
            cambiarVentana("Cargar usuarios");
        }else{
            cambiarVentana("Menu");
        }
        
    }
    
    public static void cambiarVentana(String ventana){
        switch(ventana){
            case "Menu":
                ocultarVentanas();
                menuPrincipal.setVisible(true);
                break;
                
            case "Generar areas":
                ocultarVentanas();
                ventanaGA.setVisible(true);
                break;
                
            case "Cargar usuarios":
                ocultarVentanas();
                ventanaCU.setVisible(true);
                break;
                
            default:
                
        /*
            Para utilizar este método no hace falta crear un objeto en otra clase
            cuando el método es estático. Directamente se utiliza el nombre de la clase
            y se busca el método.
            Ej: 
            GestionDePersonal.cambiarVentana(*parámetro*);
                
        */  
        }
    }
    
    private static void ocultarVentanas(){
        menuPrincipal.setVisible(false);
        ventanaGA.setVisible(false);
        ventanaCU.setVisible(false);
    }
}



