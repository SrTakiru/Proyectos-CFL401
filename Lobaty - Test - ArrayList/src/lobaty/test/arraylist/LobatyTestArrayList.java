package lobaty.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class LobatyTestArrayList {

    public static void main(String[] args) {
        ArrayList<Mascotas> mascotas = new ArrayList();
        int age, legs;
        String name = JOptionPane.showInputDialog(null, "Nombre de mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION);
        try {
            while (!name.toUpperCase().equals("salir".toUpperCase())) {
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de la mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
                legs = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de patas: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
                mascotas.add(new Mascotas(name, age, legs));

                name = JOptionPane.showInputDialog(null, "Nombre de mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR! \n"
                    + "Valor ingresado invalido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        //JOptionPane.showMessageDialog(null, mascotas);
        Iterator it = mascotas.iterator();
        while (it.hasNext()) {
            //Mascotas mascota = it.next();
            Mascotas mascota = (Mascotas) it.next();
            JOptionPane.showMessageDialog(null,"Nombre de la mascota " + (mascota.getNombre()) + "\n"
                    + "Edad de la mascota: " + (mascota.getEdad()) + "\n"
                    + "Patas de dicha mascota:" + (mascota.getPatas()),"Informacion de Mascota",JOptionPane.DEFAULT_OPTION);

        }
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



