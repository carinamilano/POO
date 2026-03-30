package Partes;
public class Motor {
    private String marca;
    private int hp;
    private double empuje;
    private boolean encendido;

    //constructor
    public Motor(String marca, int hp, double empuje) {
        this.marca = marca;
        this.hp = hp;
        this.empuje = empuje;
    }

    public void encender(){
       if (!encendido)
        encendido = true;
       System.out.print("El motor esta encendido!!");
    }

    public boolean estaEncendido(){
        return encendido;
    }

    public String getMarca() {
        return marca;
    }

        public int getHp() {
        return hp;
    }

    public double getEmpuje() {
        return empuje;
    }

    @Override
    public String toString() {
        return "[MOTOR " +
                " marca='" + marca + "\' ," +
                " hp=" + hp + ", " +
                " empuje=" + empuje + ", " +
                " encendido=" + encendido + 
                ']';
    }



}
