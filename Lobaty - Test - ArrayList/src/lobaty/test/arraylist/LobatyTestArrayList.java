package lobaty.test.arraylist;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LobatyTestArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> elem2 = new ArrayList();
        boolean bandera = false;
        int valor = 0;
        while (!bandera) {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese valores numericos enteros:"));
                if (valor > 0) {
                    elem2.add(valor);
                } else {
                    bandera = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese valores enteros.\n"
                        + "Si desea salir ingrese un valor negativo.");
            }
        }
        System.out.println(elem2);
    }
}

