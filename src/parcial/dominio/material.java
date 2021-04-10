package parcial.dominio;

public class material implements Comparable<material> {
    private int codigo;
    private String nombre;
    private int duracion;
    private String tipo;

    public material(int codigo, String nombre, int duracion, String tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;

    }
    @Override
    public int compareTo(material o) {
        if (o.getCodigo()>this.codigo){
            return -1 ;
        }else if(o.getCodigo()<this.codigo) {
            return 1;
        }else{
            return 0;
        }
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
