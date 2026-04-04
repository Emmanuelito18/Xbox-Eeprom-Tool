package logica;

/**
 * Esta clase se utiliza para obtener información sobre el sistema tales como el
 * sistema operativo, la version del sistema y su arquitectura
 *
 * @author Emmanuelito18
 */
// <editor-fold defaultstate="collapsed" desc="Clase InformacionSistema">
public class InformacionSistema {

    /**
     * Este método se encarga de detectar el sistema operativo en el que se ejecuta el programa
     * @return Devuelve el <code>nombre</code> del sistema operativo en minúsculas como un String
     */
    // <editor-fold defaultstate="collapsed" desc="Detecta el sistema operativo">
    public static String sistemaOperativo() {
        String nombre = System.getProperty("os.name").toLowerCase();
        return nombre;
    }
    // </editor-fold>

    /**
     * Este método se encarga de detectar la versión del sistema en la que se ejecuta el programa.
     * Este método no se útiliza en el programa, solo se utiliza para debug
     * @return Devuelve la <code>version</code> del sistema como un string
     * @hidden 
     */
    // <editor-fold defaultstate="collapsed" desc="Detecta version del sistema">
    public static String versionSistema() {
        String version = System.getProperty("os.version").toLowerCase();
        return version;
    }
    // </editor-fold>

    /**
     * Este método se encarga de detectar la arquitectura del procesador en el que se ejecuta el programa
     * @return Devuelve la <code>arquitectura</code> del sistema en minúsculas como un String
     */
    // <editor-fold defaultstate="collapsed" desc="Detecta arquitectura del sistema">
    public static String arquitecturaSistema() {
        String arquitectura = System.getProperty("os.arch").toLowerCase();
        return arquitectura;
    }
    // </editor-fold>
}
// </editor-fold>
