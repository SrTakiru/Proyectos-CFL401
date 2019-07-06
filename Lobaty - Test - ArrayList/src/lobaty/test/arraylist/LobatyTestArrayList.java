package lobaty.test.arraylist;

//import java.util.ArrayList;
//import java.util.Iterator;
//import javax.swing.JOptionPane;
public class LobatyTestArrayList {

    public static void main(String[] args) {
//        ArrayList<Mascotas> mascotas = new ArrayList();
//        int age, legs;
//        String name = JOptionPane.showInputDialog(null, "Nombre de mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION);
//        try {
//            while (!name.toUpperCase().equals("salir".toUpperCase())) {
//                age = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad de la mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
//                legs = Integer.parseInt(JOptionPane.showInputDialog(null, "Numero de patas: ", "Mascotas", JOptionPane.DEFAULT_OPTION));
//                mascotas.add(new Mascotas(name, age, legs));
//
//                name = JOptionPane.showInputDialog(null, "Nombre de mascota: ", "Mascotas", JOptionPane.DEFAULT_OPTION);
//            }
//            Iterator it = mascotas.iterator();
//            while (it.hasNext()) {
//                Mascotas mascota = (Mascotas) it.next();
//                JOptionPane.showMessageDialog(null, "Nombre de la mascota " + (mascota.getNombre()) + "\n"
//                        + "Edad de la mascota: " + (mascota.getEdad()) + "\n"
//                        + "Patas de dicha mascota:" + (mascota.getPatas()), "Informacion de Mascota", JOptionPane.DEFAULT_OPTION);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "ERROR! \n"
//                    + "Valor ingresado invalido.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
        Persona per1 = new Persona("José Luis", 45);
        Persona per2 = new Persona("Marta", 53);
        Mascotas loro = new Mascotas("Pepe", 10, 2);
        Mascotas perro = new Mascotas("Boby", 7, 4);
        Mascotas gato = new Mascotas("Sultan", 2, 4);
        per1.agregarMascota(gato);
        per2.agregarMascota(perro);
        per2.agregarMascota(loro);

        int edadGato = gato.getEdad();
        gato.setEdad(edadGato++);
        //gato.setEdad(gato.getEdad()+1);
        System.out.println(per1.cuantasMascotasTenes());
        System.out.println(per2.cuantasMascotasTenes());
        System.out.println(per1.getEdad());
    }
}






