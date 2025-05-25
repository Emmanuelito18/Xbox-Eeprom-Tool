package logica;

//<editor-fold defaultstate="collapsed" desc="Librerias del programa">
import gui.Ventana;
import logica.Tema;
import javax.swing.SwingUtilities;//para cambair el tema del programa
//</editor-fold>

/**
 * Esta clase controla toda la lógica del programa
 * @author Emmanuelito18
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Tema apariencia=new Tema();
        apariencia.TemaOscuro();

        // Crear la ventana en el hilo de Swing
        SwingUtilities.invokeLater(() -> {
            Ventana miVentana = new Ventana();// Crear la ventana
            miVentana.setLocationRelativeTo(null);// Pone la ventana en el cenrto de la pantalla
            miVentana.setVisible(true);// Mostrar la ventana
        });
    }
}
