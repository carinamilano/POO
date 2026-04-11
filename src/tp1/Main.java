package tp1;

import tp1.partes.Ala;
import tp1.partes.Motor;


public class Main {
    public static void main(String[] args) {
        
        //ALAS DEL AVION
        // Crear las instancias de las alas
        Ala alaIzquierda = new Ala(10, "Blanco", "Metal");
        Ala alaDerecha = new Ala(10, "Azul", "Metal");

        // Crear una lista de alas
        Ala[] listAlas = {alaIzquierda,alaDerecha};

        //MOTOR DEL AVION
        Motor unMotor = new Motor("Boeing",1000, 2500);
        unMotor.encender();

        //SISTEMA DE CONTROL DE VUELO DEL AVION
        SistemaDeControlDeVuelo  unSistVuelo = new SistemaDeControlDeVuelo("Boeing",1010, "MANUAL");

        //ARMADO DEL PRIMER AVION

        Avion unAvion = new Avion("Boeing","747",unMotor,unSistVuelo,listAlas,300,true);

            System.out.print(unAvion.toString());

        }


}