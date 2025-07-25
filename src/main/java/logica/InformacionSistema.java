package logica;

/**
 * Esta clase se utiliza para obtener información sobre el sistema tales como el
 * sistema operativo, la version del sistema y su arquitectura
 *
 * @author Emmanuelito18
 */
public class InformacionSistema {

    public String sistemaOperativo() {
        String nombre = System.getProperty("os.name").toLowerCase();
        return nombre;
    }

    public String versionSistema() {
        String version = System.getProperty("os.version").toLowerCase();
        return version;
    }

    public String arquitecturaSistema() {
        String arquitectura = System.getProperty("os.arch").toLowerCase();
        return arquitectura;
    }
}
