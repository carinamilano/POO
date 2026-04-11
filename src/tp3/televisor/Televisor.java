package tp3.televisor;

public class Televisor {
    private String marca;
    private String modelo;
    private int anio;
    private Tipo tipo;
    private boolean smart;
    private boolean encendido;
    private Pantalla pantalla;
    private int volumen;

    public Televisor(String marca, String modelo, int anio, Tipo tipo, boolean smart, Pantalla pantalla){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.smart = smart;
        this.encendido = false; //asi arranca apagado
        this.pantalla = pantalla;
        this.volumen = 10;
    }
    public String toString() {
        return marca + " " + modelo + " -- " +
                pantalla.getPulgadas() + " pulgadas -- " +
                pantalla.getResolucion() + " -- " +
                (smart ? "Smart" : "No Smart");
        // esto es lo mismo que hacer:
        // if (smart) {
        //    return "Smart";
        //} else {
        //    return "No Smart";
        //}
    }
    public void encender() {
        encendido = true;
    }
    public void apagar() {
        encendido = false;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void subirVolumen() {
        volumen++;
    }

    public void bajarVolumen() {
        volumen--;
    }
    public int getVolumen() {
        return volumen;
    }
}
