/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.herencia;

/**
 *
 * @author Programación
 */
public class Gatos extends Animales {

    private int cantPelos;

    public Gatos(String nombre, int patas, int cantPelos) {
        this.nombre = nombre;
        this.patas = patas;
        this.cantPelos = cantPelos;
        this.energia = 100;
    }

    private void correr() {
        if (energia > 5) {
            energia -= 5;
        }
    }

    private void jugar() {
        if (energia > 10) {

            energia -= 10;

        }
    }
}

