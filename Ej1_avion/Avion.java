

import Partes.Ala;
import Partes.Motor;

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
                "  motor=" + motor.toString() + ", \n"+
                "  sistema de vuelo=" + sisVuelo.toString() + ", \n"+
                "  alas=" + Arrays.toString(listAla) + ", \n"+
                "  numeroAsientos=" + numeroAsientos + ", \n"+
                "  entretenimiento=" + entretenimiento + ", \n"+
                ']';
    }
}
