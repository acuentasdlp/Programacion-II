import java.util.Scanner;

/*Clase publica*/
public class EcuacionLineal {
	
	/*Atributos privados*/
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public  boolean tieneSolucion() {
		if((this.a * this.d)-(this.b * this.c)!=0) {
			return true;
		} else {
			return false;
		}	
	}	
	
	public double getX() {
		double x = ((this.e * this.d) - (this.b * this.f)) / ((this.a * this.d) - (this.b * this.c));
		return x;
	}
	
	public double getY() {
		double y = ((this.a * this.f) - (this.e * this.c)) / ((this.a * this.d) - (this.b * this.c));
		return y;
	}
	
	public static void main(String[] Args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese numeros a,b,c,d,e,f que pertenezcan a los reales: ");
		
		double a0=sc.nextDouble();
		double a1=sc.nextDouble();
		double a2=sc.nextDouble();
		double a3=sc.nextDouble();
		double a4=sc.nextDouble();
		double a5=sc.nextDouble();
		
		
		EcuacionLineal solucion = new EcuacionLineal(a0,a1,a2,a3,a4,a5);
		
		if(solucion.tieneSolucion() == false) {
			System.out.print("La ecuacion no tiene solucion");
		}else {
			System.out.print("La solucion es x = "+solucion.getX()+" y = "+solucion.getY());
		}
	}
}
