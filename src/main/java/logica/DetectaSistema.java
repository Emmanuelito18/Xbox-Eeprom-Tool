package logica;

// <editor-fold defaultstate="collapsed" desc="Librerias de la clase">
import enums.SistemaOperativo;
import enums.Arquitectura;
import logica.InformacionSistema;
// </editor-fold>

/**
 * Esta clase se encarga de detectar el OS y arquittectura del sistema
 * @author Emmanuelito18
 */
// <editor-fold defaultstate="collapsed" desc="Clase DetectaSistema">
public class DetectaSistema {

    // <editor-fold defaultstate="collapsed" desc="Variables sistema">
    static String sistema_Operativo = InformacionSistema.sistemaOperativo();//guarda como un string el nombre sistema operativo
    static String arquitectura = InformacionSistema.arquitecturaSistema();//guarda como un string el nombre de la arquitectura
    // </editor-fold>

    /**
     * Este método se encarga de devolver el sistema en el que se ejecuta el programa
     * @return SistemaOperativo.OSname como nombre del sistema operativo
     */
    // <editor-fold defaultstate="collapsed" desc="Detecta el sistema operativo">
    public static SistemaOperativo detectarOS() {
        if (sistema_Operativo.contains("win")) return SistemaOperativo.WINDOWS;//si el nombre del sistema contiene win devuelve la constante WINDOWS del enum SistemaOperativo
        if (sistema_Operativo.contains("mac")) return SistemaOperativo.MAC;
        if (sistema_Operativo.contains("nix") || sistema_Operativo.contains("nux") || sistema_Operativo.contains("aix")) return SistemaOperativo.LINUX;
           return SistemaOperativo.DESCONOCIDO;
    }
    // </editor-fold>
    
    /**
     * Este método se encarga de devolver la arquitectura del sistema en la que se ejecuta el programa
     * @return Arquitectura.arch como nombre de la arquitectura
     */
    // <editor-fold defaultstate="collapsed" desc="Detecta la arquitectura">
    public static Arquitectura detectaArquitectura(){
        if (arquitectura.contains("aarch64") || arquitectura.contains("arm64") || arquitectura.contains("armv8")) return Arquitectura.ARM64;//si el nombre de la arquitectura contiene aarch4 devuelve la constante ARM64 del enum Arquitectura
        if (arquitectura.contains("arm") || arquitectura.contains("aarch32") ||arquitectura.contains("armv7")) return Arquitectura.ARM32;
        if (arquitectura.contains("64")) return Arquitectura.X64;
        if (arquitectura.contains("86") || arquitectura.contains("32")) return Arquitectura.X86;

        return Arquitectura.DESCONOCIDA;
    }// </editor-fold>
}
// </editor-fold>
