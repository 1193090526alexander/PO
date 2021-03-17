package bicicleta;

import bicicleta.dominio.bicicleta;

public class Aplicacionbicicleta {
    public static void main(String[] args) {

        bicicleta bici = new bicicleta();

        bici.serial = 1234;
        bici.marca = "BMW";
        bici.modelo = "Marli 7 2021";
        bici.color = "negro";
        bici.precio = 5000000;

        bici.acelerar(36.5);
        bici.frenar(10.5);
        bici.cambiarPrecioYColor(720000, "morada claro");

        System.out.println(bici.obtenerInformacio());


    }
}
