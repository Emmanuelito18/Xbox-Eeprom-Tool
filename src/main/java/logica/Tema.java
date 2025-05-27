package logica;

// <editor-fold defaultstate="collapsed" desc="Librerias para look and feel">
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
//</editor-fold>

/**
 * Esta clase se encarga de controlar los temas para el programa principal
 *
 * @author Emmanuelito18
 */
public class Tema {

    /**
     * Cambia el tema del programa al tema Oscuro
     */
    //<editor-fold defaultstate="collapsed" desc="Tema oscuro">
    public void TemaOscuro() {
        try {
            // Puedes usar Nimbus, FlatLaf u otro
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    //</editor-fold>

    /**
     * Cambia el tema del programa al tema Claro
     */
    //<editor-fold defaultstate="collapsed" desc="Tema claro">
    public void TemaClaro() {
        try {
            // Puedes usar Nimbus, FlatLaf u otro
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
    //</editor-fold>

    /**
     * Actualiza el tema del programa en tiempo real al tema oscuro
     *
     * @param ventana La <code>ventana</code> en la que cambiará el tema
     */
    //<editor-fold defaultstate="collapsed" desc="Actualiza al tema oscuro">
    public void actualizaTemaOscuro(JFrame ventana) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
            SwingUtilities.updateComponentTreeUI(ventana);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //</editor-fold>
    
    /**
     * Actualiza el tema del programa en tiempo real al tema claro
     *
     * @param ventana La <code>ventana</code> en la que cambiará el tema
     */
    //<editor-fold defaultstate="collapsed" desc="Actualiza al tema claro">
    public void actualizarTemaClaro(JFrame ventana) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
            SwingUtilities.updateComponentTreeUI(ventana);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println();
    }
    //</editor-fold>
}
