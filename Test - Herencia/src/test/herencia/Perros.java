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
public class Perros extends Animales {

    private int cantPelos;

    public Perros(String nombre, int patas, int cantPelos) {
        super(nombre, patas, 100,1);
        this.cantPelos = cantPelos;
    }

    public int getCantPelos() {
        return cantPelos;
    }

    public void setCantPelos(int cantPelos) {
        this.cantPelos = cantPelos;
    }

    public void correr() {

        if (energia - 10 > 0) {
            energia -= 10;

        }
    }

    public void jugar() {
        if (energia - 15 > 0) {
            energia -= 15;
        }
    }
}


