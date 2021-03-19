package banco.dominio;

public class Banco {
    private String nombre;
    private String nit;
    private persona gerente;

    public Banco(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public persona getGerente() {
        return gerente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGerente(persona gerente) {
        this.gerente = gerente;
    }
}
