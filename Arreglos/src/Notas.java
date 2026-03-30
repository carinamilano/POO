public class Notas {

    private double[] notas = {10.0, 8.5, 4.0, 9.0, 7.5};
    private int[] vector={1,2,3,4,5,6,7,8,9};


    public void mostrarNotas() {
        for (int i = 0; i < notas.length; i++) {

            if (i == notas.length - 1) {
                System.out.println(notas[i]);
            } else {
                System.out.print(notas[i] + ", ");
            }
        }
    }

    public double[] maximoMinimo() {
        double max = notas[0];
        double min = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > max) {
                max = notas[i];
            }
            if (notas[i] < min) {
                min = notas[i];
            }
        }
        double[] resultado = {max, min};
        return resultado;

    }
    public int buscarNumero(int num){
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return i;
            }
        }
        return -1;
    }
}