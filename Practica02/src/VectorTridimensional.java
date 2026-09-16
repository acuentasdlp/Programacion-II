public class VectorTridimensional {
    private double a1, a2, a3;

    public VectorTridimensional(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    // a) Suma de dos vectores
    public VectorTridimensional sumar(VectorTridimensional b) {
        return new VectorTridimensional(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    // b) Multiplicación de un escalar r por un vector
    public VectorTridimensional multiplicarEscalar(double r) {
        return new VectorTridimensional(r * this.a1, r * this.a2, r * this.a3);
    }

    // c) Longitud de un vector
    public double longitud() {
        return Math.sqrt(Math.pow(a1, 2) + Math.pow(a2, 2) + Math.pow(a3, 2));
    }

    // d) Normal de un vector
    public VectorTridimensional normal() {
        double lon = longitud();
        if (lon == 0) throw new ArithmeticException("No se puede calcular la norma de un vector nulo.");
        return new VectorTridimensional(a1 / lon, a2 / lon, a3 / lon);
    }

    // e) Producto escalar
    public double productoEscalar(VectorTridimensional b) {
        return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
    }

    // f) Producto vectorial
    public VectorTridimensional productoVectorial(VectorTridimensional b) {
        double nx = this.a2 * b.a3 - this.a3 * b.a2;
        double ny = this.a3 * b.a1 - this.a1 * b.a3;
        double nz = this.a1 * b.a2 - this.a2 * b.a1;
        return new VectorTridimensional(nx, ny, nz);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", a1, a2, a3);
    }
}