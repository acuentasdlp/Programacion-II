import java.util.Scanner;

public class Estadisticas_poo {

	private double[] datos;
	private int x;
	
	public Estadisticas_poo(double[]vector,int x) {
		this.datos=vector;
		this.x=x;
	}
	
	public double promedio() {
		double acumulador=0;
			for(int i=0;i<x;i++) {
				acumulador=this.datos[i]+acumulador;
			}	
			double promedio = acumulador/x;
			return promedio;
	}
	
	public double desviacion() {
        double prom = this.promedio(); 
        double acumulador1 = 0;

        for (int i = 0; i < this.datos.length; i++) {
        	acumulador1 = Math.pow(this.datos[i] - prom, 2)+acumulador1;
        }
        return Math.sqrt(acumulador1 / (this.datos.length - 1));
    }
	
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese la longitud o cantidad de datos a ingresar: ");
		int x= sc.nextInt();
		double[] datos = new double[x];
		
		System.out.println("Ingrese "+ x +" números:");
        for (int i = 0; i < datos.length; i++) {
            datos[i] = sc.nextDouble();
        }
        Estadisticas_poo estadistica = new Estadisticas_poo(datos,x);
        System.out.println("El promedio es: "+ estadistica.promedio());
        System.out.println("La desviacion estandard es: "+ estadistica.desviacion());
        }
	}

/*Se puede observar que el codigo se optimizo de mejor manera*/
/*Podemos enviar dator desde el prog.principal a la clase y la clase con esos datos da vida al objeto*/
/*La mejora se debe a que los atributos pedidos desde el prog. main sirven para hacer funcionar*/