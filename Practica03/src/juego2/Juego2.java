package juego2; 
import java.util.Random;
import java.util.Scanner;

import juego1.JuegoAdivinaNumero;

class JuegoAdivinaPar extends JuegoAdivinaNumero {
    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 == 0) {
                return true;
            } else {
                System.out.println("Error: El número ingresado es IMPAR. Debe ser PAR.");
                return false;
            }
        } else {
            System.out.println("Error: El número está fuera del rango (0 a 10).");
            return false;
        }
    }
}


class JuegoAdivinaImpar extends JuegoAdivinaNumero {
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            if (numero % 2 != 0) {
                return true;
            } else {
                System.out.println("Error: El número ingresado es PAR. Debe ser IMPAR.");
                return false;
            }
        } else {
            System.out.println("Error: El número está fuera del rango (0 a 10).");
            return false;
        }
    }
}


public class Juego2 {
    public static void main(String[] args) {
        
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);

       
        juegoNormal.juega();
        juegoPar.juega();
        juegoImpar.juega();
    }
}