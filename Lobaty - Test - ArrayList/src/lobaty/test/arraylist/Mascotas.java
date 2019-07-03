package lobaty.test.arraylist;

public class Mascotas {

    private String nombre;
    private int edad;

    public Mascotas(String nombre, int edad, int patas) {
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
    }

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

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    private int patas;

}


