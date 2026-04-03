package tp4.ejercicio11;

public class Circulo extends Figura{
    private double radio;
    private String color;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio,String color){
        this.radio=radio;
        this.color=color;
    }
    @Override
    public double calcularArea(){
        return (3.14*radio*radio);
    }

}
