package tp4.ejercicio8;

public class ClienteComun implements Descuento {
    private double importe;

    public ClienteComun(double importe) {
        this.importe = importe;
    }

    @Override
    public double calcularDescuento() {
        return importe*0.9;
    }
}
