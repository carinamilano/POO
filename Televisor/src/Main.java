
public class Main {
    public static void main(String[] args) {

        Pantalla p=new Pantalla(55,
                "4K");

        Televisor t1=new Televisor ("Samsung", "Serie9",2022,Tipo.PLASMA,true,p);
        Televisor t2=new Televisor ("LG","NewLife",2019,Tipo.OLED,false,p);

        System.out.println(t1);
        System.out.println(t2);

        //3-Modificar los valores de dicho componente compartido y verificar los cambios volviendo a imprimir
        // la información de los televisores.

        p.setPulgadas(65);
        p.setResolucion("8K");
        System.out.println(t1);
        System.out.println(t2);

        //4. Implementar los comportamientos encender y apagar para los televisores.
        t1.encender();

        System.out.println("El televisor esta encendido? : " + t1.isEncendido());

        t1.apagar();

        System.out.println("El televisor esta apagado? : " + t1.isEncendido());

        //punto 5 agrego volumen
        System.out.println("Volumen actual: " + t1.getVolumen());
        t1.subirVolumen();
        t1.subirVolumen();

        System.out.println("Volumen actual: " + t1.getVolumen());






    }
}