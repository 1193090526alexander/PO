package bicicleta.dominio;

public class bicicleta {
    public long serial;
    public String marca;
    public String modelo;
    public long precio;
    public String color;
    public double velocidad;

    public void cambiarPrecio(long nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
    public void cambiarColor(String nuevoColor) {
        this.color = nuevoColor;
    }
    public void cambiarPrecioYColor(long nuevoPrecio, String nuevoColor){
        this.cambiarPrecio(nuevoPrecio);
        this.cambiarColor(nuevoColor);
    }
    public String obtenerInformacio(){
        String informacio = "serial: " + this.serial +"\n marca:" + this.marca +
                "\n modelo:" + this.modelo + "\n color:" + this.color + "\n precio;"
                + this.precio + "\n velocidad:" + this.velocidad + "km/h";
        return informacio;
    }
    public void acelerar(double incremento){

        this.velocidad += incremento;
    }
    public boolean frenar(double decremento) {
        if ((this.velocidad + decremento) > 0) {
            this.velocidad = this.velocidad - decremento;
            return true;

        }else {
            return false;

        }



    }
}
