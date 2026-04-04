package logica;

// <editor-fold defaultstate="collapsed" desc="Librerias del programa">
import enums.Arquitectura;
import enums.SistemaOperativo;
import logica.EjecutaEsptool;
// </editor-fold>

/**
 * Esta clase se encarga de elegir la version de esptool correspondiente según
 * el sistema operativo y su arquitectura
 *
 * @author Emmanuelito18
 */
// <editor-fold defaultstate="collapsed" desc="Clase EjecutorEsptool">
public class EjecutorEsptool {

    static EjecutaEsptool ejecutar = new EjecutaEsptool();//se utiliza para ejecutar la versión correcta de ESPtool

    /**
     * Este método se encarga de decidir que versión de esptool se va a ejecutar
     *
     * @throws RuntimeException si el sitema operativo no es soportado por
     * Esptool
     */
    // <editor-fold defaultstate="collapsed" desc="Detecta el ejecutable correcto">
    public static void ejecutarSegunSistema() {
        // <editor-fold defaultstate="collapsed" desc="Variables sistema">
        SistemaOperativo sistemaOperativo = DetectaSistema.detectarOS();
        Arquitectura arquitectura = DetectaSistema.detectaArquitectura();
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Escoge que versión de Esptool se ejecuta"> 
        switch (sistemaOperativo) {//Detecta el sistema operativo
            case WINDOWS://en caso de que sea windows
                arquitecturasWindows(arquitectura);
                break;
            case MAC://en caso de que sea macos
                arquitecturasMAC(arquitectura);
                break;
            case LINUX://en caso de sea una distribución Linux
                arquitecturasLinux(arquitectura);
                break;
            default:
                throw new RuntimeException("Sistema operativo no soportado");
        }
        // </editor-fold>
    }
    // </editor-fold>

    /**
     * Este método se encarga de ejecutar la versión correcta de Esptool según
     * la arquitectura de Windows
     *
     * @param arquitectura nombre de la arquitectura de Windows
     * @throws RuntimeException si la arquitectura del procesador no es
     * soportada
     */
    // <editor-fold defaultstate="collapsed" desc="Arquitecturas soportadas de Windows">
    public static void arquitecturasWindows(Arquitectura arquitectura) {
        switch (arquitectura) {
            
            case X86://windows 32 bit
                ejecutar.EsptoolWindows32();
                break;
            default:
                throw new RuntimeException("Arquitectura no soportada en Windows");
        }
    }
    // </editor-fold>

    /**
     * Este método se encarga de ejecutar la versión correcta de Esptool según
     * la arquitectura de macOS
     *
     * @param arquitectura nombre de la arquitectura en macOS
     * @throws RuntimeException si la arquitectura del procesador no es
     * soportada
     */
    // <editor-fold defaultstate="collapsed" desc="Arquitecturas soportadas de MACOS">
    public static void arquitecturasMAC(Arquitectura arquitectura) {
        switch (arquitectura) {
            case ARM64://macos apple sillicon
                ejecutar.EsptoolMacApple();
                break;
            case X64://macos intel 64 bit
                ejecutar.EsptoolMacIntel();
                break;
            default:
                throw new RuntimeException("Arquitectura no soportada en Mac");
        }
    }
    // </editor-fold>

    /**
     * Este método se encarga de ejecutar la versión correcta de Esptool según
     * la arquitectura de linux
     *
     * @param arquitectura nombre de la arquitectura en linux
     * @throws RuntimeException si la arquitectura del procesador no es
     * soportada
     */
    // <editor-fold defaultstate="collapsed" desc="Arquitecturas soportadas de LINUX">
    public static void arquitecturasLinux(Arquitectura arquitectura) {
        switch (arquitectura) {
            case ARM64://Distro Linux en ARM 64 bit
                ejecutar.EsptoolLinuxArm64();
                break;
            case ARM32://Distro Linux en ARM 32 bit
                ejecutar.EsptoolLinuxArm32();
                break;
            case X64://Distro Linux 64 bit
                ejecutar.EsptoolLinux64();
                break;
            case X86://Distro Linux 32 bit
                ejecutar.EsptoolLinux32();
                break;
            default:
                throw new RuntimeException("Arquitectura no soportada en Linux");
        }
    }
    // </editor-fold>
}
// </editor-fold>
