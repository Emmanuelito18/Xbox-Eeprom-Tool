package logica;

import enums.Arquitectura;
import enums.SistemaOperativo;
import logica.InformacionSistema;
import logica.EjecutaEsptool;

/**
 * Esta clase se encarga de elegir la version de esptool correspondiente según
 * el sistema operativo y su arquitectura
 *
 * @author Emmanuelito18
 */
public class SeleccionaEjecutable {

    InformacionSistema informacion = new InformacionSistema();

    /**
     * Este método se encarga de decidir que versión de esptool se va a ejecutar
     */
    public static void escogeSistema() {
        // <editor-fold defaultstate="collapsed" desc="Variables sistema">
        SistemaOperativo sistemaOperativo = DetectaSistema.detectarOS();
        Arquitectura arquitectura = DetectaSistema.detectaArquitectura();
        EjecutaEsptool ejecutar = new EjecutaEsptool();
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Escoge que versión de Esptool se ejecuta"> 
        switch (sistemaOperativo) {
            case WINDOWS:
                switch (arquitectura) {
                    case X86:
                        ejecutar.windows32();
                        break;
                    case X64:
                        ejecutar.windows64();
                        break;
                    default:
                        throw new RuntimeException("Arquitectura no soportada en Windows");
                }
                break;
            case MAC:
                switch (arquitectura) {
                    case ARM64:
                        ejecutar.macApple();
                        break;
                    case X64:
                        ejecutar.macIntel();
                        break;
                    default:
                        throw new RuntimeException("Arquitectura no soportada en Mac");
                }
                break;
            case LINUX:
                switch (arquitectura) {
                    case ARM64:
                        ejecutar.linuxArm64();
                        break;
                    case ARM32:
                        ejecutar.linuxArm32();
                        break;
                    case X64:
                        ejecutar.linux64();
                        break;
                    case X86:
                        ejecutar.linux32();
                        break;
                    default:
                        throw new RuntimeException("Arquitectura no soportada en Linux");
                }
                break;
            default:
                throw new RuntimeException("Sistema operativo no soportado");
        }
        // </editor-fold>
    }
}
