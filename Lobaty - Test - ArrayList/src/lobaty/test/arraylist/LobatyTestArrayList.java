package lobaty.test.arraylist;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LobatyTestArrayList {

    public static void main(String[] args) {
        ArrayList<Mascotas> mascotas = new ArrayList();
        boolean bandera = false;
        try {
            while (!bandera) {
                String name = JOptionPane.showInputDialog(null, "Nombre de mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION);
                if (!name.equals("salir")) {
                    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de la mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
                    int legs = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de patas: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
                    mascotas.add(new Mascotas(name, age, legs));
                } else {
                    bandera = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Le pifiaste mijo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, mascotas);
    }
}

/*Mascotas perro1 = new Mascotas("Baxter", 11, 4);
        mascotas.add(perro1);
        System.out.println(mascotas);
        Mascotas gato1 = new Mascotas("Mishu", 5, 4);
        mascotas.add(gato1);
        System.out.println(mascotas);
        Mascotas loro1 = new Mascotas("Pepe", 3, 2);
        mascotas.add(loro1);
        System.out.println(mascotas);
 */
//Lo primero es esto, lo dejo por aca para que no joda.
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





