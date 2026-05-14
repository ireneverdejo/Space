package control;

import view.PantallaJoc;

public class GameLoop {

    private PantallaJoc pantalla;

    public GameLoop(PantallaJoc pantalla) {
        this.pantalla = pantalla;
    }

    public void start() {

        new javax.swing.Timer(16, e -> {

            pantalla.updateGame();
            pantalla.repaint();

        }).start();
    }
}