import java.time.Duration;	/*Nos dice la diferencia de tiempo finalizar e inicar y para convertir a milesimas de segundos*/
import java.time.LocalTime;	/*Poder cronometrar el tiempo exacto*/
import java.util.Random;	/*Poder usar numeros aleatorios*/
import java.util.Arrays; /*Poder mostrar en pantalla el vector*/

/*Clase publica general*/
public class Cronometro {
	
	/* Atributos privados inicia y finaliza */
	
	private LocalTime inicia;
	private LocalTime finaliza;
	
	/* Constructor sin argumentos */
	
	public Cronometro () {
		 this.inicia=LocalTime.now();
	}
	
	/*Metodos getters (Sirve para poder mostrar la informacion o poder almacenarla en una variable externa sin modificar la del constructor )*/
	public LocalTime getInicia() {
		return this.inicia;
	}
	public LocalTime getFinaliza() {
		return this.finaliza;
	}
	
	/*Metodo llamado inicia*/
	public void inicia() {
		this.inicia=LocalTime.now();
	}
	/*Metodo llamado detener*/
	public void detener() {
		this.finaliza=LocalTime.now();
	}
	/*Metodo de lapso de tiempo*/
	public double lapsoDeTiempo() {
		return Duration.between(this.inicia, this.finaliza).toMillis();
	}
	
	/*Programa principal*/
	public static void main(String[] args) {
		
        int tamaño = 100000;
        int[] datos = new int[tamaño];
        Random random = new Random(); /**/
        
        for (int i = 0; i < tamaño; i++) {
            datos[i] = random.nextInt(1000000);
        }
        System.out.println(Arrays.toString(datos));
        
        Cronometro reloj = new Cronometro();

        reloj.inicia();
        
        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - 1 - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    int auxiliar = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = auxiliar;
                }
            }
        }
        reloj.detener();

        double milisegundos = reloj.lapsoDeTiempo();

        System.out.println("Tiempo requerido para ordenar " + tamaño + " elementos:");
        System.out.println(milisegundos + " ms");
        
    }
	
}	
		

