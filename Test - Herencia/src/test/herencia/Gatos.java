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
        super(nombre, patas, 100, 7);
        this.cantPelos = cantPelos;
    }

    public void correr() {
        if (energia - 5 > 0) {
            energia -= 5;
        }
    }

    public void jugar() {
        if (energia - 10 > 0) {
            energia -= 10;
        }
    }

    public void jugarCon(Aves ave) {
        ave.setEnergia(0);
        energia += 10;
    }

    public void jugarCon(Perros perro) {
        int chances = (int) (Math.random() * 5 + 1);
        switch (chances) {
            case 1:
                if (vidas == 0) {
                    energia = 0;
                } else {
                    restarUnaVida();
                    energia = 1;
                }
                System.out.println(vidas);
                System.out.println(energia);
                break;
            case 2:
                System.out.println("X2");
                break;
            case 3:
                System.out.println("X3");
                break;
            case 4:
                System.out.println("X4");
                break;
            case 5:
                System.out.println("X5");
                break;
            default:
                break;
        }
    }

    @Override
    public void dormir(int horas
    ) {
        int i = 0;
        if (energia < 100) {

            while ((energia + 2) <= 100 && i <= horas) {
                energia += 2;
                i++;
            }
        } else {
            while ((energia + 2) <= 110 && i <= horas) {
                energia += 2;
                i++;
            }
        }
    }
}

