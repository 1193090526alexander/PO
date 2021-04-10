package parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class pooflix {
    //Atributos
    public int CAPACIDAD;
    private List<material> Material;
//Constructures
    public pooflix(int CAPACIDAD) {
        this.CAPACIDAD = 15;
        this.Material = new ArrayList<>();
    }
    //Metodos
    public boolean agregar(material Material){
        if(this.Material.size() < CAPACIDAD){
            this.Material.add(Material);
            return true;
        }
        return false;
    }

    public boolean retirar(int codigo) {
        material retirarMaterial = null;

        for (material material: this.Material) {
            if (material.getCodigo().equals(codigo)) {
            }
        }
    }
    public material buscar(int codigo){

    }
    public material buscar(String nombre){
        return null;
    }
    public List<material> buscarPorTipo(String tipo){
        return null;
    }
    public int calcularDuracionTotal(){
        return 0;
    }
    public List<material> ordenarPorCodigo(){
        return null;
    }
}
