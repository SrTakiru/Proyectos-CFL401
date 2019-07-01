package lobaty.test.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class LobatyTestArrayList {

    public static void main(String[] args) {
        //System.out.println("Damn bruh this is hard");
        // ArrayList elem = new ArrayList();
        ArrayList<Integer> elem2 = new ArrayList();
        boolean bandera = false;
        int valor = 0;
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Agregue algo:");
        elem.add("Perro");
        elem.add(4);
        elem.add(7);
        System.out.println(elem);
         */
        System.out.println("Ingrese todos los valores positivos que desee ( para salir ingrese un valor negativo) : ");
        while (!bandera) {
            valor = teclado.nextInt();
            if (valor > 0) {
                elem2.add(valor);

            } else {
                bandera = true;
            }
        }
        System.out.println(elem2);
    }
}



