package aplicacion.app;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class jueguitoppt {
    static final int VERINSTRICIONES=0;
    static final int JUGAR=1;
    static final int VERRESULTADO=2;
    public static void main(String[] args) {

        int jugada_computador;
        int jugada_usuario;
        Random rand = new Random();
List<String> opciones = Arrays.asList("ver instruciones", "jugar", "ver resultados");
boolean seguirejecutando = true;

while(seguirejecutando) {
    int opcionselecionada = JOptionPane.showOptionDialog(null, "bienvrnid@", "POO - piedra papel o tijera", 0, 1, null, opciones.stream().toArray(), null);

    switch (opcionselecionada) {
        case VERINSTRICIONES:
            mostarmensaje("para jugar jugae este juego debe seguir las siguientes instruciones:\n 1. debes elejir 1 de las 3 opciones y la computadora lo hara al azar\n2. si selecionas papel ganaras si la computadora elije papel y perderas si esta ecoge piedra\n si escoges piedra ganaras si la maquina escogio tijera y perderas si esta escogio papel\n tijera ganaras si la maquina escogio papel y perderas si esta escogio piedra");
            break;
        case JUGAR:
            jugada_usuario = JOptionPane.showOptionDialog(null, "Selecciona el valor de jugada_del_usuario.", "Algoritmo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Piedra", "Papel", "Tijera"}, null) + 1;

            jugada_computador=1+rand.nextInt(3);
            if(jugada_computador==1)
                JOptionPane.showMessageDialog(null, "La jugada del ordenador es Piedra");
            if(jugada_computador==2) ;
            JOptionPane.showMessageDialog(null, "La jugada del ordenador es Papel");
            if(jugada_computador==3);
            JOptionPane.showMessageDialog(null, "La jugada del ordenador es Tijera");
            if(jugada_computador==jugada_usuario);
            JOptionPane.showMessageDialog(null, "Empate");
            if((jugada_usuario==1&&jugada_computador==3)||(jugada_usuario==2&&jugada_computador==1)||(jugada_usuario==3&&jugada_computador==2))
                JOptionPane.showMessageDialog(null, "Gana usuario");
            if((jugada_usuario==3&&jugada_computador==1)||(jugada_usuario==1&&jugada_computador==2)||(jugada_usuario==2&&jugada_computador==3))
                JOptionPane.showMessageDialog(null, "Gana computador");
            JOptionPane.showMessageDialog(null, "Valor de jugada del computador: " + jugada_computador);
        default:
            


    }
}
    }
    public static void mostarmensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "piedraPapleOTijera", JOptionPane.PLAIN_MESSAGE);
    }

}

