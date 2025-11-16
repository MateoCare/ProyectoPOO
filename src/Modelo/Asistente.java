package Modelo;

public class Asistente {
    private String nombre;
    private Integer edad;

    public Asistente(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Asistente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
