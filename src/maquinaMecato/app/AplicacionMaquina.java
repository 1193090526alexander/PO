package maquinaMecato.app;

import maquinaMecato.Dominio.maquinaDispensar;

public class AplicacionMaquina {
    public static void main(String[] args) {

        maquinaDispensar dispensadora=new maquinaDispensar();

        productos papas = new productos("1","papas",(short) 1000);
        productos Detoditos = new productos("2","Detodito",(short) 2000);
        productos goloza = new productos("3","goloza",(short) 1200);
        productos brawni = new productos("4","brawni",(short) 1600);
        productos jet = new productos("5","jet",(short) 500);
        productos jumbo = new productos("6","jumbo",(short) 2800);
        productos doritos = new productos("7","doritos",(short) 1100);
        productos choclitos = new productos("8","choclitos",(short) 1100);
        productos chitos = new productos("9","chitos",(short) 300);
        productos gomas = new productos("10","gomas",(short) 1000);

        dispensadora.llenarMaquina(papas, Detoditos, goloza, brawni, jet, jumbo, doritos, choclitos, chitos, gomas);

    }

}
