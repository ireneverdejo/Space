package view;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {

        setTitle("Space Defender");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new BorderLayout());

        JLabel titol = new JLabel("SPACE DEFENDER", SwingConstants.CENTER);
        titol.setForeground(Color.WHITE);
        titol.setFont(new Font("Arial", Font.BOLD, 40));

        JButton botoJugar = new JButton("JUGAR");

        panel.add(titol, BorderLayout.CENTER);
        panel.add(botoJugar, BorderLayout.SOUTH);

        add(panel);

        setVisible(true);
    }
}
botoJugar.addActionListener(e -> {

JFrame finestraJoc = new JFrame("Joc");

PantallaJoc joc = new PantallaJoc();

    finestraJoc.add(joc);
    finestraJoc.setSize(800, 600);
    finestraJoc.setLocationRelativeTo(null);
    finestraJoc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    finestraJoc.setVisible(true);

dispose();
});
JButton botoRanking = new JButton("RANKING");

botoRanking.addActionListener(e -> {
        new RankingView();
});
panel.add(botoRanking, BorderLayout.NORTH);