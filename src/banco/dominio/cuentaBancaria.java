package banco.dominio;

import java.util.Date;
//atributos
public class cuentaBancaria {
    private Banco banco;
    private String tipo;//   si es ahorros o corriente
    private persona titular;
    private String numero;
    private double saldo;
    private Date fechaApertura;
    private String contrasena;
    private String estado;
//constructores
    public cuentaBancaria(Banco banco, String tipo, persona titular, String numero, double saldo) {
        this.banco = banco;
        this.tipo = tipo;
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
        this.estado = "ACTIVA";
        this.contrasena ="3456";
        this.fechaApertura= new Date();
    }
    //metodos
    public String valorAConsultar() {
        return "hola" + titular.getNombre() + ", su valor es: " + saldo;
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

    public Banco getBanco() {
        return banco;
    }

    public String getTipo() {
        return tipo;
    }

    public persona getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public String getEstado() {
        return estado;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTitular(persona titular) {
        this.titular = titular;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}