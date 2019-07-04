package lobaty.test.arraylist;

public class Mascotas {

    private String nombre;
    private int edad;
    private int patas;

    public Mascotas(String nombre, int edad, int patas) {
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
    }

    /**
     * El metodo getNombre es para conseguir / leer el nombre del objeto en cuestion.
     * @return el nombre
     */
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
}


