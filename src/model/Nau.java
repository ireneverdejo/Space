package model;

public class Nau {

    private int x;
    private int y;
    private int velocitat;
    private int vida;

    public Nau(int x, int y, int velocitat, int vida) {
        this.x = x;
        this.y = y;
        this.velocitat = velocitat;
        this.vida = vida;
    }

    public void moureEsquerra() {
        x -= velocitat;
    }

    public void moureDreta() {
        x += velocitat;
    }

    public void moureAmunt() {
        y -= velocitat;
    }

    public void moureAvall() {
        y += velocitat;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}