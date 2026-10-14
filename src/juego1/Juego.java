package juego1;

public class Juego {
    protected int numeroDeVidas;
    protected int record;
    protected int vidasIniciales;

    public Juego(int numeroDeVidas) {
        this.vidasIniciales = numeroDeVidas;
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        this.numeroDeVidas = this.vidasIniciales;
    }

    public void actualizaRecord() {
        this.record++;
        System.out.println("¡Récord actualizado! Partidas ganadas: " + this.record);
    }

    public boolean quitaVida() {
        this.numeroDeVidas--;
        return this.numeroDeVidas > 0;
    }
}