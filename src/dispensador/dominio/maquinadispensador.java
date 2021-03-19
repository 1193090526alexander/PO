package dispensador.dominio;
import java.util.ArrayList;
import java.util.List;

public class maquinadispensador{
    private List<productos> producto;

    public maquinadispensador() {
        this.producto = new ArrayList<>();
    }

    public void llenarMaquina(productos mecato1, productos mecato2, productos mecato3, productos mecato4, productos mecato5,
                              productos mecato6, productos mecato7, productos mecato8, productos mecato9, productos mecato10) {
        producto.add(mecato1);
        producto.add(mecato2);
        producto.add(mecato3);
        producto.add(mecato4);
        producto.add(mecato5);
        producto.add(mecato6);
        producto.add(mecato7);
        producto.add(mecato8);
        producto.add(mecato9);
        producto.add(mecato10);
    }

    public static boolean sacarProducto(productos codigo, productos precio) {
        if (codigo.getCodigo().equals(codigo) && precio.getPrecioMecato()=>0){

        }
    }

}
