package view;

import model.Usuari;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    private JTextField campNom;

    public LoginView() {

        setTitle("Login Space Defender");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,1));

        campNom = new JTextField();
        JButton boto = new JButton("Entrar");

        panel.add(new JLabel("Introdueix nom:"));
        panel.add(campNom);
        panel.add(boto);

        boto.addActionListener(e -> entrar());

        add(panel);

        setVisible(true);
    }

    private void entrar() {

        Usuari u = new Usuari(campNom.getText());

        new MenuPrincipal(); // o PantallaJoc amb usuari

        dispose();
    }
}