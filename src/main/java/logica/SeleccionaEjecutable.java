package logica;

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

    public static void escogeSistema() {
        String os = InformacionSistema.sistemaOperativo();
        String arquitectura = InformacionSistema.arquitecturaSistema();
        EjecutaEsptool ejecutar = new EjecutaEsptool();

        if (os.contains("win")) {
            if (arquitectura.contains("64")) {
                ejecutar.windows64();
            } else {
                ejecutar.windows32();
            }
        } else if (os.contains("mac")) {
            if (arquitectura.contains("x64")) {
                ejecutar.macIntel();
            } else {
                ejecutar.macApple();
            }
        } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            if (arquitectura.contains("64") || arquitectura.contains("amd64")) {
                ejecutar.linux64();
            } else {
                ejecutar.linux32();
            }

            if (arquitectura.contains("aarch64")) {
                ejecutar.linuxArm64();
            } else {
                ejecutar.linuxArm32();
            }
        }
    }
}
