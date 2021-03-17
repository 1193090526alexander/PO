package banco.dominio;

public class Banco {
    public String nombre;
    public String nit;
    public persona gerente;

    public Banco(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }


}
