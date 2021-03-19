package maquinaMecato.Dominio;

public class productos {
    private String codigo;
    private String nombre;
    private short precioMecato;
    private byte maxCantidad;
    private byte totalProductos;

    public productos(String codigo, String nombre, short precioMecato) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioMecato = precioMecato;
        this.maxCantidad = 8;
        this.totalProductos = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public short getPrecioMecato() {
        return precioMecato;
    }

    public byte getTotalProductos() {
        return totalProductos;
    }
    public byte getMaxCantidad() {
        return maxCantidad;
    }

    public void setPrecioMecato(short precio) {
        this.precioMecato = precioMecato;
    }
}
