import java.util.Scanner;

public class Estadisticas_prog_estruc_modular {

	public static int longitud() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Ingrese el tamaño de datos que ingresará: ");
		int tamaño = sc.nextInt();
		return tamaño;
	}
	
	public static double[] llenarvector(int tamaño) {
		
		Scanner sc1 = new Scanner(System.in);
		double[] vector = new double[tamaño];
		int i;
		for(i=0; i<tamaño; i++) {
			System.out.print("Ingrese el valor para x [" + i + "]: ");
			vector[i] = sc1.nextDouble(); 
		}
		return vector;
	}
	
	public static double promedio(double [] vector,int tamaño) {
		double acumulador=0;
		
		for(int i=0;i<tamaño;i++) {
			acumulador=vector[i]+acumulador;
		}
		
		double promedio = acumulador/tamaño;
		return promedio;
	}
	
	public static double desviacion(double argumento) {
		double desviacion=Math.sqrt(argumento);
		return desviacion;
	}
	
	public static double argumento(double numerador, int tamaño) {
		double argumento = numerador/(tamaño-1);
		return argumento;
	}
	
	public static double numerador(double[] vector,double promedio, int tamaño) {
		double acumulador1 = 0;
		for(int i=0;i<tamaño;i++) {
			acumulador1 = Math.pow(vector[i]-promedio, 2)+acumulador1; 
		}
		return acumulador1;
	}
	
	public static void main(String[] Args) {
		
		int n = longitud();
		double[] datos = llenarvector(n);
		double prom = promedio(datos, n);
		double num = numerador(datos, prom, n);
		double arg = argumento(num, n);
		double desv = desviacion(arg);
		
		System.out.println("El promedio es: " + prom);
		System.out.println("La desviacion estándar es: " + desv);
		
	}
}
/*Como se observa en programacion estructurada-Modular tenemos mucho codigo agrupado, ademas de que yo generalice para que tenga mas de 10 datos hasta n */