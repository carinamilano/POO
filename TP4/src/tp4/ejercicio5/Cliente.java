package tp4.ejercicio5;

public class Cliente {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
//Hacer los métodos:
// void mostrarEmail()
// String obtenerEmail()

    public void mostrarEmail() {
        if (email == null) {
            System.out.println("No tiene email");
        } else {
            System.out.println(email);
        }

    }
    public String obtenerEmail(){
        return email;

    }
}
