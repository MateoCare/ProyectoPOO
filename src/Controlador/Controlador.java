package Controlador;

import Modelo.Asistente;
import Modelo.Evento;
import Vista.Interfaz;

import java.util.Scanner;

import java.time.LocalDate;

public class Controlador {
    private Interfaz interfaz;

    public Controlador() {
        interfaz = new Interfaz();
        interfaz.crearVentanaInicio();

        Evento evento1 = new Evento("Conferencia", "Centro cultural", LocalDate.of(2025,6,12));

        Asistente asistente1 = new Asistente("Mateo",22);
        Asistente asistente2 = new Asistente("Camila",19);

        Evento evento2 = new Evento("Evento Administrativo", "Unicenter", LocalDate.of(2025,3,10));
        Asistente asistente3 = new Asistente("Tomas",22);
        Asistente asistente4 = new Asistente("Juan",21);


    }

}
