package tp4.ejercicio8;

public class ClienteVip implements Descuento {
    private double importe;

    public ClienteVip(double importe) {
        this.importe = importe;
    }

    @Override
    public double calcularDescuento() {
        return importe*0.8;

    }
}
