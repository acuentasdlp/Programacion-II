public class MiPunto {
    private double x;
    private double y;
    
    // Constructor por defecto encapsulamiento
    public MiPunto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor 
    public MiPunto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método getter
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // Distancia 
    public double distancia(MiPunto otro) {
        return Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2));
    }

    // Distancia 
    public double distancia(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto(0, 0);
        MiPunto p2 = new MiPunto(10, 30.5);

        System.out.println("Distancia entre p1 y p2: " + p1.distancia(p2));
    }
}
