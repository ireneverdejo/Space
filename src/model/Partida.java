package model;

public class Partida {

    private Usuari usuari;
    private int puntuacio;
    private int tempsJoc;

    public Partida(Usuari usuari) {
        this.usuari = usuari;
    }

    public void sumarPunts(int punts) {
        this.puntuacio += punts;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public int getTempsJoc() {
        return tempsJoc;
    }

    public void setTempsJoc(int tempsJoc) {
        this.tempsJoc = tempsJoc;
    }
}