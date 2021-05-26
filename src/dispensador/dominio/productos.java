package dispensador.dominio;

public class productos {
    private String nombre;
    private int edad;
    private double estatuta;

    public productos(String nombre){
        this.nombre = nombre;

    }

    public int getEdad() {
        return edad;
    }

    public double getEstatuta() {
        return estatuta;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatuta(double estatuta) {
        this.estatuta = estatuta;
    }
}
