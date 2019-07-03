package lobaty.test.arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LobatyTestArrayList {

    public static void main(String[] args) {
        // Funcionar funciona, no es perfecto
        /*
        ArrayList<Integer> elem2 = new ArrayList();
        boolean bandera = false;
        int valor = 0;
        while (!bandera) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor numerico entero (Negativo si desea salir):"));
                if (valor >= 0) {
                    elem2.add(valor);
                } else {
                    bandera = true;
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros.\n"
                        + "Si desea salir ingrese un valor negativo.");
            }
        }
        System.out.println(elem2);*/
        ArrayList<Mascotas> mascotas = new ArrayList();
        Mascotas perro1 = new Mascotas("Baxter", 11, 2);
        mascotas.add(perro1);
        System.out.println(mascotas);
    }
}


