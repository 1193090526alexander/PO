package bicicleta;

import bicicleta.dominio.bicicleta;

public class Aplicacionbicicleta {
    public static void main(String[] args) {

        bicicleta bici = new bicicleta(123, "BMW","Marli 7 2021",500000,"negro");



        bici.acelerar(36.5);
        bici.frenar(10.5);
        bici.cambiarPrecioYColor(720000, "morada claro");

        System.out.println(bici.obtenerInformacio());


    }
}
