package lobaty.test.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class LobatyTestArrayList {

    public static void main(String[] args) {
        ArrayList<Mascotas> mascotas = new ArrayList();
        ArrayList<Persona> personas = new ArrayList();
        int edad, edadM, patas, numMascotas;
        String nombre = JOptionPane.showInputDialog(null, "Nombre de la persona: ", "Datos Persona", JOptionPane.DEFAULT_OPTION);
        try {
            while (!nombre.toUpperCase().equals("salir".toUpperCase())) {
                edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad: ", "Datos Persona", JOptionPane.DEFAULT_OPTION));
                numMascotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de máscotas: ", "Cantidad de mascotas", JOptionPane.DEFAULT_OPTION));
                if (numMascotas > 0) {
                    while (numMascotas > 0) {
                        String nombreM = JOptionPane.showInputDialog(null, "Nombre de mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION);
                        edadM = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de la mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
                        patas = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de patas: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
                        mascotas.add(new Mascotas(nombreM, edadM, patas));
                        numMascotas--;
                    }

                }
                personas.add(new Persona(nombre, edad));
                nombre = JOptionPane.showInputDialog(null, "Nombre de la persona: ", "Datos Persona", JOptionPane.DEFAULT_OPTION);

            }
            Iterator it2 = personas.iterator();
            while (it2.hasNext()) {
                Persona persona = (Persona) it2.next();
                JOptionPane.showMessageDialog(null, "Nombre del dueño: " + (persona.getNombre()) + "\n"
                        + "Edad del dueño: " + (persona.getEdad()) + "Años.", "Datos Persona", JOptionPane.DEFAULT_OPTION);

            }
            Iterator it = mascotas.iterator();
            while (it.hasNext()) {
                Mascotas mascota = (Mascotas) it.next();
                JOptionPane.showMessageDialog(null, "Nombre de la mascota " + (mascota.getNombre()) + "\n"
                        + "Edad de la mascota: " + (mascota.getEdad()) + " Años. \n"
                        + "Patas de dicha mascota:" + (mascota.getPatas()), "Informacion de Mascota", JOptionPane.DEFAULT_OPTION);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR! \n"
                    + "Valor ingresado invalido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

//        Persona per1 = new Persona("José Luis", 45);
//        Persona per2 = new Persona("Marta", 53);
//        Mascotas loro = new Mascotas("Pepe", 10, 2);
//        Mascotas perro = new Mascotas("Boby", 7, 4);
//        Mascotas gato = new Mascotas("Sultan", 2, 4);
//        per1.agregarMascota(gato);
//        per2.agregarMascota(perro);
//        per2.agregarMascota(loro);
//        gato.setEdad(gato.getEdad() + 1);
//        //gato.setEdad(gato.getEdad()+1);
//        System.out.println(per1.cuantasMascotasTenes());
//        System.out.println(per2.cuantasMascotasTenes());
//        System.out.println(per1.getEdad());
}
