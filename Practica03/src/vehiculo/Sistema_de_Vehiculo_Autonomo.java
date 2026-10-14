package vehiculo;


class Sensor {
 protected String tipo;
 protected String id;
 protected boolean encendido;

 public Sensor(String id) {
     this.tipo = "Genérico";
     this.id = id;
     this.encendido = false; 
 }

 public void activar() {
     this.encendido = true;
     System.out.println("Sensor " + id + " (" + tipo + ") activado.");
 }

 public void desactivar() {
     this.encendido = false;
     System.out.println("Sensor " + id + " (" + tipo + ") desactivado.");
 }
}


class Camara extends Sensor {
 protected String resolucion;

 public Camara(String id, String resolucion) {
     super(id);
     this.tipo = "Cámara";
     this.resolucion = resolucion;
 }
}

class SensorLuzLaser extends Sensor {
 protected int alcance;

 public SensorLuzLaser(String id, int alcance) {
     super(id); 
     this.tipo = "Luz Laser";
     this.alcance = alcance;
 }
}


class VehiculoAutonomo extends Camara {
 protected int alcanceLaser; 

 public VehiculoAutonomo(String id, String resolucion, int alcanceLaser) {
     super(id, resolucion); 
     this.tipo = "Vehículo Autónomo";
     this.alcanceLaser = alcanceLaser;
 }


 public void mostrarEstado() {
     System.out.println("\n--- Estado del " + tipo + " ---");
     System.out.println("ID: " + id);
     System.out.println("Resolución de Cámara: " + resolucion);
     System.out.println("Alcance de Luz Láser: " + alcanceLaser + " metros");
     System.out.println("¿Está encendido?: " + (encendido ? "Sí" : "No"));
 }
}


public class Sistema_de_Vehiculo_Autonomo {
 public static void main(String[] args) {
     
     VehiculoAutonomo miVehiculo = new VehiculoAutonomo("VA-001", "4K", 150);

     
     miVehiculo.mostrarEstado();
     
     System.out.println(); 
     miVehiculo.activar();
     miVehiculo.mostrarEstado();
     
     miVehiculo.desactivar();
 }
}