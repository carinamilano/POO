package Partes;
public class Ala {
   private double envergadura;
   private String color;
   private String tipoMaterial;
   private boolean flap = false;

    public Ala(double envergadura, String color, String tipoMaterial) {
        this.envergadura = envergadura;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
    }

    @Override
    public String toString() {
        return " \n\t<ALA: " +
                "envergadura=" + envergadura +
                ", color='" + color + '\'' +
                ", tipoMaterial='" + tipoMaterial + '\'' +
                ", flap=" + flap +
                ">";
    }

    public void cambiarFlap (){
        if (this.flap)
            this.flap = false;
        else 
            this.flap = true;
    }

    public boolean getFlap() {
        return flap;
    }


    public double getEnvergadura() {
        return envergadura;
    }
    public String getColor() {
        return color;
    }
    public String getTipoMaterial() {
        return tipoMaterial;
    }
}
