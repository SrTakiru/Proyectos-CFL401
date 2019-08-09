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
public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private Mascota[] mascotas;

    public Mascota[] getMascotas() {
        return mascotas;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMascotas(Mascota[] mascotas) {
        this.mascotas = mascotas;
    }

    public Persona(int id, String nombre, String apellido, int edad, int dni) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }

    public boolean estaLaMascota(String nombre) {
        return;
    }

    public int cuantasMascotasTenes() {
        return;
    }

    public boolean sosMayorA(int edad) {
        return this.edad > edad;
    }
}

