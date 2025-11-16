package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String descripcion;
    private String ubicacion;
    private LocalDate fecha;

    private List<Asistente> asistentes =  new ArrayList<>();

    public Evento(String descripcion, String ubicacion, LocalDate fecha) {
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "descripcion='" + descripcion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", fecha=" + fecha +
                ", asistentes=" + asistentes +
                '}';
    }

    public void agregarAsistente(Asistente asistente) {
        this.asistentes.add(asistente);
    }

}
