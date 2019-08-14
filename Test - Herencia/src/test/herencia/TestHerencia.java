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
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perros boby = new Perros("Boby", 4, 100);
        Gatos mish = new Gatos("Mish", 4, 100);
        Aves julio = new Aves("Julio", 2, 2, 100);

        mish.jugarCon(boby);

    }

}



