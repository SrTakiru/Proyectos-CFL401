package lobaty.test.arraylist;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private int edad;
    private ArrayList<Mascotas> mascotas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        mascotas = new ArrayList();
    }

    public void agregarMascota(Mascotas mascota) {
        mascotas.add(mascota);
    }

    public int cuantasMascotasTenes() {
        return mascotas.size();
    }
}


