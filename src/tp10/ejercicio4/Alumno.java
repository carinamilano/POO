package tp10.ejercicio4;

// ===== Alumno.java =====

public class Alumno {

    private int legajo;
    private String nombre;
    private String carrera;

    public Alumno(int legajo, String nombre, String carrera) {
        this.legajo  = legajo;
        this.nombre  = nombre;
        this.carrera = carrera;
    }

    public int getLegajo()     { return legajo; }
    public String getNombre()  { return nombre; }
    public String getCarrera() { return carrera; }

    @Override
    public String toString() {
        return "Legajo: " + legajo + " | " + nombre + " | " + carrera;
    }
}