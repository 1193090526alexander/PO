package quiz.dominio;

import parcial.dominio.inmueble;

import javax.swing.*;
import java.util.List;

public class agencia {
    private String nombre;
    private List<parcial.dominio.inmueble> Inmuebles;

    public void setInmuebles(List<parcial.dominio.inmueble> inmuebles) {
        Inmuebles = inmuebles;
    }

    public String getNombre() {
        return nombre;
    }

    public List<parcial.dominio.inmueble> getInmuebles() {
        return Inmuebles;
    }

    public agencia(String nombre, List<parcial.dominio.inmueble> inmuebles) {
        this.nombre = nombre;
        Inmuebles = inmuebles;
    }

    public void agragarinmueble(parcial.dominio.inmueble i){
        if (i instanceof parcial.dominio.inmueble){
            Inmuebles.add(i);
        }
    }
    public boolean arrendar(parcial.dominio.inmueble arrendable){
        return false;
    }
    public boolean devolver(parcial.dominio.inmueble arrendable){
        return true;
    }
    public boolean vender(parcial.dominio.inmueble inmueble){
        return true;

    }
    public List<parcial.dominio.inmueble> getArrendablesDisponibles(){

    }
    public List<inmueble> getArrendados(){

    }

}
