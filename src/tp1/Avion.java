package tp1;

import tp1.partes.Ala;
import tp1.partes.Motor;

import java.util.Arrays;

public class Avion {
    private String marca;
    private String modelo;
    private Motor motor;
    private SistemaDeControlDeVuelo sisVuelo;
    private Ala[] listAla;
    private  int numeroAsientos;
    private  boolean entretenimiento;

    public Avion(String marca, String modelo, Motor motor, SistemaDeControlDeVuelo sisVuelo, Ala[] listAla, int numeroAsientos, boolean entretenimiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.sisVuelo = sisVuelo;
        this.listAla = listAla;
        this.numeroAsientos = numeroAsientos;
        this.entretenimiento = entretenimiento;
    }

    @Override
    public String toString() {
        return "[AVION " +
                "  marca='" + marca + '\'' + ", \n"+
                "  modelo='" + modelo + '\'' + ", \n"+
                "  motor=" + motor + ", \n"+
                "  sistema de vuelo=" + sisVuelo + ", \n"+
                "  alas=" + Arrays.toString(listAla) + ", \n"+
                "  numeroAsientos=" + numeroAsientos + ", \n"+
                "  entretenimiento=" + entretenimiento + ", \n"+
                ']';
    }
}
