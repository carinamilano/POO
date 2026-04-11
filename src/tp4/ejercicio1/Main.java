package tp4.ejercicio1;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Carina", 1000);
        cuenta.depositar(500);
        System.out.println("el saldo de la cuenta es: " + cuenta.getSaldo());
    }
}