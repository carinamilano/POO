public class Calculadora {

    public int suma(int sum1, int sum2) {
        return sum1 + sum2;
    }
    public int multiplicacion(int mult1, int mult2) {
        return mult1*mult2;
    }
    public double division(double div1, double div2) {
        if (div2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }else {
            return div1 / div2;
        }
    }
    public int resta(int res1, int res2) {
        return res1-res2;
    }

}
