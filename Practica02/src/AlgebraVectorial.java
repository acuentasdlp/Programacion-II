class Vector3D {
    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }

    public double magnitud() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static Vector3D suma(Vector3D a, Vector3D b) {
        return new Vector3D(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static Vector3D resta(Vector3D a, Vector3D b) {
        return new Vector3D(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static double productoEscalar(Vector3D a, Vector3D b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static Vector3D productoCruz(Vector3D a, Vector3D b) {
        return new Vector3D(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
    }
}

public class AlgebraVectorial {
    public boolean perpendicular(Vector3D a, Vector3D b, String tipo) {
        if (tipo.equalsIgnoreCase("diag")) {
            double sumaMag = Vector3D.suma(a, b).magnitud();
            double restaMag = Vector3D.resta(a, b).magnitud();
            return Math.abs(sumaMag - restaMag) < 1e-9;
        }
        return false;
    }

    public boolean perpendicular(Vector3D a, Vector3D b) {
        double ab = Vector3D.resta(a, b).magnitud();
        double ba = Vector3D.resta(b, a).magnitud();
        return Math.abs(ab - ba) < 1e-9;
    }

    public boolean perpendicular(Vector3D a, Vector3D b, boolean esProductoEscalar) {
        if (esProductoEscalar) {
            return Math.abs(Vector3D.productoEscalar(a, b)) < 1e-9;
        }
        return false;
    }

    public boolean perpendicular(Vector3D a, Vector3D b, double pitagorasCheck) {
        double sumaMagSq = Math.pow(Vector3D.suma(a, b).magnitud(), 2);
        double aSq = Math.pow(a.magnitud(), 2);
        double bSq = Math.pow(b.magnitud(), 2);
        return Math.abs(sumaMagSq - (aSq + bSq)) < 1e-9;
    }

    public boolean paralela(Vector3D a, Vector3D b, double rEscalar) {
        return Math.abs(a.x - rEscalar * b.x) < 1e-9 &&
               Math.abs(a.y - rEscalar * b.y) < 1e-9 &&
               Math.abs(a.z - rEscalar * b.z) < 1e-9;
    }

    public boolean paralela(Vector3D a, Vector3D b) {
        Vector3D cruz = Vector3D.productoCruz(a, b);
        return cruz.magnitud() < 1e-9;
    }

    public Vector3D proyeccion_de_a_sobre_b(Vector3D a, Vector3D b) {
        double escalar = Vector3D.productoEscalar(a, b) / Math.pow(b.magnitud(), 2);
        return new Vector3D(escalar * b.x, escalar * b.y, escalar * b.z);
    }


    public double componente_de_a_en_b(Vector3D a, Vector3D b) {
        return Vector3D.productoEscalar(a, b) / b.magnitud();
    }
}