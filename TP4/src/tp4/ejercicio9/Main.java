package tp4.ejercicio9;

public class Main {
    public static void main(String[] args){
        EmpleadoPorHora emp1=new EmpleadoPorHora("Juan",108,4800);
        EmpleadoTiempoCompleto emp2=new EmpleadoTiempoCompleto("Pedro",1250000 );

        System.out.println(emp1.calcularSueldo());
        System.out.println(emp2.calcularSueldo());
    }
}
