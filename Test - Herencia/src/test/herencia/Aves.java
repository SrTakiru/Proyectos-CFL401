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
        super(nombre, patas, 100,1);
        this.alas = alas;
        this.cantPlumas = cantPlumas;
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
        if (energia - 10 > 0) {
            energia -= 10;
        }
    }

    @Override
    public void comer(String nomComida) {
        if (nomComida.equals("alpiste") && energia + 10 < 100) {
            energia += 10;
        }
    }
}


