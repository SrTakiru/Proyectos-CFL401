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
public class Aves extends Animales {

    private int alas;
    private int cantPlumas;

    public Aves(String nombre, int patas, int alas, int cantPlumas) {
        this.nombre = nombre;
        this.patas = patas;
        this.alas = alas;
        this.cantPlumas = cantPlumas;
        this.energia = 100;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getCantPlumas() {
        return cantPlumas;
    }

    public void setCantPlumas(int cantPlumas) {
        this.cantPlumas = cantPlumas;
    }

    public void volar() {
        energia -= 10;
    }

    @Override
    public void comer(String nomComida) {

    }
}

