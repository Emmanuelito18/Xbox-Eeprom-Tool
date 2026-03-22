package logica;

//<editor-fold defaultstate="collapsed" desc="Librerias del programa">
import gui.Ventana;
import logica.Tema;
import logica.SeleccionaEjecutable;
import javax.swing.SwingUtilities;//para cambair el tema del programa
//</editor-fold>

/**
 * Esta clase controla toda la lógica del programa
 * @author Emmanuelito18
 */
public class Main {

    /**
     * Es la función principal de todo el programa
     * @param args
     */
    public static void main(String[] args) {
        SeleccionaEjecutable seleccionaEjecutable=new SeleccionaEjecutable();
        Tema apariencia=new Tema();
        seleccionaEjecutable.escogeSistema();
        apariencia.aplicarTemaPorDefecto(null);

        // Crear la ventana en el hilo de Swing
        SwingUtilities.invokeLater(() -> {
            Ventana miVentana = new Ventana();// Crear la ventana
            miVentana.setLocationRelativeTo(null);// Pone la ventana en el cenrto de la pantalla
            miVentana.setVisible(true);// Mostrar la ventana
        });
    }
}
