package logica;

import gui.Ventana;

/**
 * Esta clase controla toda la lógica del programa
 * @author Emmanuelito18
 */
public class Main {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        Ventana ventana=new Ventana();
        ventana.setVisible(true);//Muestra la ventana del programa
        ventana.setLocationRelativeTo(null);//Centra la ventana
    }
}
