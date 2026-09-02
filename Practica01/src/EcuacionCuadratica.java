import java.util.Scanner;

public class EcuacionCuadratica {

		private double a;
		private double b;
		private double c;
		
		public EcuacionCuadratica(double a, double b, double c) {
			
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
		public double getDiscriminante() {
			
			double discriminante = Math.pow(this.b, 2)-(4*(this.a*this.c));
			return discriminante;
		}
		public double getRaiz1() {
			double r1 = (-this.b + Math.sqrt((Math.pow(this.b, 2)-(4*(this.a*this.c)))))/(2*this.a) ;
			return r1;
		}
		public double getRaiz2() {
			double r1 = (-this.b - Math.sqrt((Math.pow(this.b, 2)-(4*(this.a*this.c)))))/(2*this.a) ;
			return r1;
		}
		
		public static void main(String[] Args ) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ingrese numero reales a,b,c");
			
			double a0 = sc.nextDouble();
			double a1 = sc.nextDouble();
			double a2 = sc.nextDouble();
			
			EcuacionCuadratica raices = new EcuacionCuadratica(a0,a1,a2);
			
			if(raices.getDiscriminante()>0 && a0!=0) {
				System.out.print("La ecuacion tiene 2 raices  x = "+raices.getRaiz1()+" y  x = "+raices.getRaiz2());
			}else {
				if(raices.getDiscriminante()==0) {
					System.out.print("La ecuacion tiene una raiz x = "+raices.getRaiz1());
				}else {
					if(raices.getDiscriminante()<0) {
						System.out.print("La ecuacion no tiene raices reales");
					}
				}
			}
			
		}
		
		
}
