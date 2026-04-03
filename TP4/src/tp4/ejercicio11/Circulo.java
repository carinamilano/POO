package tp4.ejercicio11;

public class Circulo extends Figura{
    private double radio;
    public Circulo(double radio){
        this.radio=radio;
    }
    @Override
    public double calcularArea(){
        return (3.14*radio*radio);
    }

}
