package juego.dominio;

import javax.swing.*;

public class papelytijera {
        static final int PIEDRA=1;
        static final int PAPEL=2;
        static final int TIJERA=3;

        public static void main(String[] args) {
            ejercicioJueguitoppt();

        }

    private static void ejercicioJueguitoppt() {
    }

    private static void ejercicioJueguitoppt(String getResultado) {
            int cantidadDePartidas=3;

            for (int i=0; i < cantidadDePartidas; i++){
                int jugadaComputador = (int) Math.round(Math.random()*2);
                int jugadaUsuario=5;

                while ((jugadaUsuario > 2)|| (jugadaUsuario < 0)){
                    jugadaUsuario=Integer.parseInt(JOptionPane.showInputDialog("partida"+ (i + 1) + "\n Ingrese 1 si elige PIEDRA \n" + "Ingrese 2 si elige PAPEL \n" + "Ingrese 3 si elige TIJERA"));

                }

                String resultado = getResultado(jugadaUsuario, jugadaComputador);

                System.out.println(resultado);

            }

        }
        private static String getResultado(int jugadausuario, int jugadacomputador){
            String resultado= "";

            if (jugadausuario == jugadacomputador){
                resultado= "es un empate";

            }
            else {
                switch (jugadausuario){

                    case PIEDRA:
                        if (jugadacomputador == PAPEL){
                            resultado="perdiste";

                        }
                        else {
                            resultado= "ganaste";
                        }
                        break;

                    case PAPEL:
                        if (jugadacomputador == TIJERA){
                            resultado="perdiste";

                        }
                        else {
                            resultado= "ganaste";
                        }
                        break;

                    case TIJERA:
                        if (jugadacomputador == PIEDRA){
                            resultado="perdiste";

                        }
                        else {
                            resultado= "ganaste";
                        }
                        break;

                    default: return "se produjo un error";
                }
            }

            resultado += getEleccionComputador(jugadacomputador);
            return resultado;
        }
        public static String getEleccionComputador(int jugadacomputador){

            String resultadoComputador = "";

            if(jugadacomputador==PIEDRA){
                resultadoComputador+="La máquina eligió piedra.";
            }else if (jugadacomputador==PAPEL){
                resultadoComputador+="La máquina eligió papel.";
            }else if (jugadacomputador==TIJERA){
                resultadoComputador+="La máquina eligió tijera.";
            }
            return resultadoComputador;
        }
}
