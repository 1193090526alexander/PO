package bicicleta.app;

import bicicleta.dominio.bicicleta;

public class Aplicacionbicicleta {
    public static void main(String[] args) {

        bicicleta bici = new bicicleta(123, "BMW","Marli 7 2021",500000,"negro");



        bici.acelerar(36.5);
        bici.frenar(10.5);
        bici.setColor("negra");
        bici.setPrecio(589000);

        System.out.println(bici.obtenerInformacio());


    }
}
