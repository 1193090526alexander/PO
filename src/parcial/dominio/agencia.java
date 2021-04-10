package parcial.dominio;

import javax.swing.*;
import java.util.List;

public class agencia {
    private String nombre;
    private List<inmueble> Inmuebles;

    public void setInmuebles(List<inmueble> inmuebles) {
        Inmuebles = inmuebles;
    }

    public String getNombre() {
        return nombre;
    }

    public List<inmueble> getInmuebles() {
        return Inmuebles;
    }

    public agencia(String nombre, List<inmueble> inmuebles) {
        this.nombre = nombre;
        Inmuebles = inmuebles;
    }

    public void agragarinmueble(inmueble i){
if (i instanceof inmueble){
    Inmuebles.add(i);
}
    }
    public boolean arrendar(inmueble arrendable){
        return false;
    }
    public boolean devolver(inmueble arrendable){
        return true;
    }
    public boolean vender(inmueble inmueble){
        return true;

    }
    public List<inmueble> getArrendablesDisponibles(){

    }
    public List<inmueble> getArrendados(){

    }

}
