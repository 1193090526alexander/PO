package banco.dominio;

import java.util.Date;

public class cuentaBancaria {
    public Banco banco;
    public String tipo;//   si es ahorros o corriente
    public persona titular;
    public String numero;
    public double saldo;
    public Date fechaApertura;
    public String contrasena;
    public String estado;

    public String valorAConsultar() {
        return "hola" + titular.nombre + ", su valor es: " + saldo;
    }

    public boolean retirar(double valorARetirar) {

        if (valorARetirar<=this.saldo && this.saldo>0 && estado.equals("ACTIVA")){
            this.saldo =  this.saldo-valorARetirar;
            return true;
        }else {
            return false;
        }

    }

    public boolean consignar(double valorAConsignar) {

        if (valorAConsignar > 0 && estado.equals("ACTIVA")){
            this.saldo +=valorAConsignar;
            return true;
        }else {
            return false;
        }
    }



    public boolean transferir(double valorATransferir, cuentaBancaria cuentaDestino) {
       /*if (valorATransferir <= saldo && cuentaDestino.estado.equals("ACTIVA")){
           cuentaDestino.saldo+=valorATransferir;
           saldo-=valorATransferir;
           return true;
       }else {
           return false;
       }*/
        return this.retirar(valorATransferir) && cuentaDestino.consignar(valorATransferir);

    }

}