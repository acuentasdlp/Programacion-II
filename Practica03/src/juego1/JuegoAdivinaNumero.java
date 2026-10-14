package juego1;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Juego Adivina Número (Juego 1) ---");
        while (true) {
            System.out.print("Introduce un número (0 al 10): ");
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número fuera de rango.");
                continue;
            }

            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    System.out.println(intento < numeroAAdivinar ? "El número es MAYOR." : "El número es MENOR.");
                } else {
                    System.out.println("¡Te quedaste sin vidas! El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}