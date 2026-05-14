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



private KeyHandler keyHandler = new KeyHandler();
addKeyListener(keyHandler);
setFocusable(true);
private void update() {

    if(keyHandler.up) y -= 5;
    if(keyHandler.down) y += 5;
    if(keyHandler.left) x -= 5;
    if(keyHandler.right) x += 5;
}
Timer timer = new Timer(16, e -> {
    update();
    repaint();
    if (Math.random() < 0.02) {
        enemics.add(new Enemic((int)(Math.random() * 750), 0));
    }
});
List<Enemic> enemics = new ArrayList<>();
List<Projectil> projectils = new ArrayList<>();
private void updateGame() {

    for (Enemic e : enemics) {
        e.update();
    }

    for (Projectil p : projectils) {
        p.update();
    }
}
private void checkCollisions() {

    for (int i = 0; i < enemics.size(); i++) {
        Enemic e = enemics.get(i);

        for (int j = 0; j < projectils.size(); j++) {
            Projectil p = projectils.get(j);

            if (Math.abs(e.getX() - p.getX()) < 20 &&
                    Math.abs(e.getY() - p.getY()) < 20) {

                enemics.remove(i);
                projectils.remove(j);

                break;
            }
        }
    }
}