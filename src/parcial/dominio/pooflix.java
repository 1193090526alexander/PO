package parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class pooflix {
    //Atributos
    public int CAPACIDAD=15;
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

    public boolean retirar(String nombre) {
        material retirarMaterial = null;

        for (material materia : this.Material) {
            if (materia.getNombre().equals(nombre)) {
                materia = retirarMaterial-1;

                return true;
            }
            System.out.println("el producto no existe");
            return false;
        }
        return false;
    }
    public material buscar(int codigo){
        material materialPoo = null;

        for (material m: this.Material){
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                materialPoo = m;
                break;
            }

        }
        return materialPoo;


    }
    public material buscar(String nombre){
        material materialPoo = null;

        for (material m: this.Material){
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                materialPoo = m;
                break;
            }

        }
        return materialPoo;


    }
    public List<material> buscarPorTipo(String tipo){
        List<material> buscarTipo = null;

        for (material mat: this.Material){
            if (mat.getTipo().equalsIgnoreCase(tipo)) {
                buscarTipo = mat

            }

        }
        return buscarTipo;

    }
    public int calcularDuracionTotal(){


    }
    public List<material> ordenarPorCodigo(){
        return null;
    }
}
