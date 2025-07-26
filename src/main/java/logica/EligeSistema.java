package logica;

import logica.InformacionSistema;

/**
 * Esta clase se encarga de elegir la version de esptool correspondiente según
 * el sistema operativo y su arquitectura
 *
 * @author Emmanuelito18
 */
public class EligeSistema {

    InformacionSistema informacion = new InformacionSistema();

    public static void escogeSistema() {
        String os = InformacionSistema.sistemaOperativo();
        String arquitectura = InformacionSistema.arquitecturaSistema();

        if (os.contains("win")) {
            if (arquitectura.contains("64")) {
                System.out.println("Windows 64 bits");
            } else {
                System.out.println("Windows 32 bits");
            }
        } else if (os.contains("mac")) {
            if (arquitectura.contains("x64")) {
                System.out.println("MacOS intel");
            } else {
                System.out.println("MacOS apple sillicon");
            }
        } else if (os.contains("nix") || os.contains("nux")) {
            if (arquitectura.contains("64") || arquitectura.contains("amd64")) {
                System.out.println("Linux 64 bits");
            } else {
                System.out.println("Linux 32 bits");
            }

            if (arquitectura.contains("aarch64")) {
                System.out.println("Linux arm 64 bits");
            } else {
                System.out.println("Linux arm 32 bits");
            }
        }
    }
}
