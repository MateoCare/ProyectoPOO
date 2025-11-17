package Vista;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    public void crearVentanaInicio() {
        JFrame ventanaPrincipal = new JFrame("Ventana principal");
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.setSize(800,600);
        ventanaPrincipal.setLayout(new FlowLayout());
        ventanaPrincipal.setLayout(null);

        JLabel tituloInicio = new JLabel("Inicio");
        tituloInicio.setFont(new Font("Arial",Font.BOLD,25));
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
