package tp4.ejercicio1;

public class CuentaBancaria {
    //atributos
    private double saldo;
    private String titular;

    //constructor
    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    //getter
    public double getSaldo() {
        return saldo;
    }
    //métodos
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void extraer(double valor) {
        if (valor <= saldo) {
             this.saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }

    }

}
//El encapsulamiento consiste en ocultar los atributos de una clase (haciéndolos privados)
// y permitir su acceso o modificación únicamente a través de métodos públicos.
// De esta forma se protege el estado interno del objeto y se controla cómo se utilizan sus datos.
//No conviene exponer atributos porque cualquiera podría modificarlos sin control.
