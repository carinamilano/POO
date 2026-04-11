package tp3.arreglos;

public class Main {
    public static void main(String[] args) {
        Notas misNotas = new Notas();
        misNotas.mostrarNotas();
        double [] resul=misNotas.maximoMinimo();
        System.out.println("maximo: "+resul[0]+" minimo:  "+resul[1]);
        int pos = misNotas.buscarNumero(14);
        if (pos==-1){
            System.out.println("No existe el numero ingresado en el arreglo");
        } else {
             System.out.println("Existe numero y se encuentra en la posicion: " + (pos+1));
        }
    }
}