package model;

public class Enemic {

    private int x;
    private int y;
    private int velocitat = 2;

    public Enemic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        y += velocitat; // baixen cap a la nau
    }

    public int getX() { return x; }
    public int getY() { return y; }
}