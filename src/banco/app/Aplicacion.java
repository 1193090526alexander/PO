package banco.app;

import banco.dominio.Banco;
import banco.dominio.cuentaBancaria;
import banco.dominio.persona;

public class Aplicacion {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        Banco bancolombia = new Banco("bancolombia s-A","1254768");
        persona Helmer = new persona(1193090526, "helmer");
        persona Jeronimo = new persona(109456234,"Jeronimo");

        cuentaBancaria miCuenta = new cuentaBancaria(bancolombia, "Ahorros", Helmer, "0312-343",500000 );
        cuentaBancaria cuentaJeronimo = new cuentaBancaria(bancolombia, "Ahorros", Jeronimo, "0240000823", 220000);

        miCuenta.retirar(220000);
        System.out.println(miCuenta.valorAConsultar());
        System.out.println(cuentaJeronimo.valorAConsultar());

        boolean resultadoTransferir=miCuenta.transferir(300000, cuentaJeronimo);
        System.out.println(resultadoTransferir);
        System.out.println(miCuenta.valorAConsultar());
        System.out.println(cuentaJeronimo.valorAConsultar());

    }
}

