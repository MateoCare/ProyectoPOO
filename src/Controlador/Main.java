package Controlador;

import Modelo.Asistente;
import Modelo.Evento;
import java.util.Scanner;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Evento evento1 = new Evento("Conferencia", "Centro cultural", LocalDate.of(2025,6,12));

        Asistente asistente1 = new Asistente("Mateo",22);
        Asistente asistente2 = new Asistente("Camila",19);

        Evento evento2 = new Evento("Evento Administrativo", "Unicenter", LocalDate.of(2025,3,10));
        Asistente asistente3 = new Asistente("Tomas",22);
        Asistente asistente4 = new Asistente("Juan",21);

        crearEvento();

    }

    public static void crearEvento(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre del evento: ");
        String nombreEvento = sc.nextLine();
        System.out.println("Introduce la ubicacion del evento: ");
        String ubicacion = sc.nextLine();
        System.out.println("Introduce la fecha del evento (formato aaaa-mm-dd): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        Evento evento3 = new Evento(nombreEvento, ubicacion, fecha);
        System.out.println(evento3);

        System.out.println("Desea agegar algun asistenete? Responda por Si o No");
        String rta = sc.nextLine();
        if (rta == "Si"){
            crearAsistente();
        }
    }

    public static void crearAsistente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del asistente: ");
        String nombreAsistente = sc.nextLine();
        System.out.println("Introduce la edad del asistente: ");
        Integer edadAsistente = sc.nextInt();

        Asistente asistente5 = new  Asistente(nombreAsistente, edadAsistente);
    }
}
