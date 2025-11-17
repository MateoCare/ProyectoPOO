package Vista;

import javax.swing.*;
import java.awt.*;

public class Pantalla {
    public void crearVentanaInicio() {
        JFrame ventanaPrincipal = new JFrame("Gestion de eventos");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(800,600);
        ventanaPrincipal.setLayout(new GridLayout());
        ventanaPrincipal.setLayout(null);

        JLabel tituloInicio = new JLabel("Menu principal");
        tituloInicio.setFont(new Font("Arial",Font.BOLD,18));
        tituloInicio.setBounds(10,0,100,50);

        JButton botonEvento = new JButton("Crear un evento");
        botonEvento.setBounds(200,150,200,50);
        botonEvento.addActionListener(e -> {
            ventanaPrincipal.setVisible(false);
            ventanaCrearEvento();
        });

        ventanaPrincipal.add(tituloInicio);
        ventanaPrincipal.add(botonEvento);
        ventanaPrincipal.setVisible(true);
    }

    private void ventanaCrearEvento() {
    }
}
