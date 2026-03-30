public class Pantalla {
    private int pulgadas;
    private String resolucion;

    public Pantalla(int pulgadas, String resolucion) {
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
    }

    public String getResolucion() {
        return resolucion;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }


}
