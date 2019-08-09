/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lobaty.pkg20190805.j042;

/**
 *
 * @author Programación
 */
public class Lobaty20190805J042 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota perro = new Mascota("Firu", 1, 4, "Perro");
        Mascota gato = new Mascota("Nala", 9, 4, "Gato");
        Mascota loro = new Mascota("Pepe", 5, 2, "Pajaro");
        Persona per1 = new Persona(1, "Ricardo", "Milos", 65, 44444444);
        Persona per2 = new Persona(2, "Pepe", "Guaca", 55, 11111111);
        per1.setMascota(gato);
        gato.setId(1);
        per1.setMascota(perro);
        perro.setId(1);
        per2.setMascota(loro);
        perro.setId(2);
    }

}


