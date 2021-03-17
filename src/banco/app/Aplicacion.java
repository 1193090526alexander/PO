package banco.app;

import banco.dominio.cuentaBancaria;
import banco.dominio.persona;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        persona Helmer = new persona();
        persona Jeronimo = new persona();

        cuentaBancaria miCuenta = new cuentaBancaria();
        cuentaBancaria cuentaJeronimo = new cuentaBancaria();

        Helmer.nombre = "Helmer";
        miCuenta.titular = Helmer;
        miCuenta.saldo = 500000;
        miCuenta.estado="ACTIVA";

        Jeronimo.nombre = "Jeronimo";
        cuentaJeronimo.titular = Jeronimo;
        cuentaJeronimo.saldo = 0;
        cuentaJeronimo.estado ="ACTIVA";

        miCuenta.retirar(220000);
        System.out.println(miCuenta.valorAConsultar());
        System.out.println(cuentaJeronimo.valorAConsultar());

        boolean resultadoTransferir=miCuenta.transferir(300000, cuentaJeronimo);
        System.out.println(resultadoTransferir);
        System.out.println(miCuenta.valorAConsultar());
        System.out.println(cuentaJeronimo.valorAConsultar());

    }
}

