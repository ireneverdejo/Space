package model;

public class Projectil {

    private int x;
    private int y;
    private int velocitat = 5;

    public Projectil(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void update() {
        y -= velocitat;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}