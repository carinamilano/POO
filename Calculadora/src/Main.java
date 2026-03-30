
public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.suma(3, 4);
        System.out.println(resultado);
        int resultado2 = calculadora.multiplicacion(3, 4);
        System.out.println(resultado2);
        double resultado3 = calculadora.division(10,0);
        System.out.println(resultado3);
        int resultado4 = calculadora.resta(7,6);
        System.out.println(resultado4);
    }
}