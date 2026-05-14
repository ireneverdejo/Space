package view;

import javax.swing.*;
import java.awt.*;

public class PantallaJoc extends JPanel {

    private int x = 350;
    private int y = 500;

    public PantallaJoc() {

        setBackground(Color.BLACK);

        Timer timer = new Timer(16, e -> repaint());
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.GREEN);

        g.fillRect(x, y, 50, 50);
    }
}