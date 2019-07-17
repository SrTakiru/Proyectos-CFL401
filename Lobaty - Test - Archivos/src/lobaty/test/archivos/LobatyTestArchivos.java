package lobaty.test.archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFrame;

public class LobatyTestArchivos {

    private static void escribirArchivoTexto() {
        FileWriter file = null;
        PrintWriter escritor = null;
        try {
            file = new FileWriter("C:\\Users\\Programación\\Downloads\\JavaNetBeans.txt", true);
            //el "False" O "True" es para sobrescribir lo anterior o seguir escribiendo en la misma hoja
            escritor = new PrintWriter(file);
            escritor.println("Muy bien!");
            escritor.flush();
            escritor.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void leerArchivoTexto() {
        FileReader file = null;
        BufferedReader lector = null;
        try {
            file = new FileReader("C:\\Users\\Programación\\Downloads\\users.txt");
            lector = new BufferedReader(file);
            String texto = lector.readLine();
            while (texto != null) {
                System.out.println(texto.split(";;;")[0]);
                texto = lector.readLine();
            }
            lector.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) throws IOException {
//        //   escribirArchivoTexto();
//          leerArchivoTexto();
        mostrarLogin();
    }

    public static void mostrarLogin() {
        VentanaLogin login = new VentanaLogin();
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.setVisible(true);
    }

    public static void mostrarVentanaPrincipal() {
        Ventana ventanaPrincipal = new Ventana();
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);

    }
}





