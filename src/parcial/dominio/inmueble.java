package parcial.dominio;

public class inmueble {
    private String direccion;
    private long valorVenta;
    private long valorArriendo;
    private boolean arrendado;

    public String getDireccion() {
        return direccion;
    }

    public long getValorVenta() {
        return valorVenta;
    }

    public long getValorArriendo() {
        return valorArriendo;
    }

    public boolean isArrendado() {
        return arrendado;
    }

    public void setValorVenta(long valorVenta) {
        this.valorVenta = valorVenta;
    }

    public void setValorArriendo(long valorArriendo) {
        this.valorArriendo = valorArriendo;
    }

    public void setArrendado(boolean arrendado) {
        this.arrendado = arrendado;
    }
}
