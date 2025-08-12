package logica;

/**
 * Esta clase se utiliza para ejecutar cada una de las versiones de esptool
 *
 * @author Emmanuelito18
 */
public class EjecutaEsptool {

    /**
     * Este método permite ejecutar esptool en Windows de 64 bits
     */
    public void windows64() {
        System.out.println("Windows 64 bits");
    }

    /**
     * Este método permite ejecutar esptool en Windows de 32 bits
     */
    public void windows32() {
        System.out.println("Windows 32 bits");
    }

    /**
     * Este método permite ejecutar esptool en MacOS con procesador intel
     */
    public void macIntel() {
        System.out.println("MacOS intel");
    }

    /**
     * Este método permite ejecutar esptool en MacOS con procesador apple sillicon
     */
    public void macApple() {
        System.out.println("MacOS apple sillicon");
    }

    /**
     * Este método permite ejecutar esptool en linux de 64 bits
     */
    public void linux64() {
        System.out.println("Linux 64 bits");
    }

    /**
     * Este método permite ejecutar esptool en linux de 32 bits
     */
    public void linux32() {
        System.out.println("Linux 32 bits");
    }

    /**
     * Este método permite ejecutar esptool en linux con arm64
     */
    public void linuxArm64() {
        System.out.println("Linux arm 64 bits");
    }

    /**
     * Este método permite ejecutar esptool en linux con arm32
     */
    public void linuxArm32() {
        System.out.println("Linux arm 32 bits");
    }
}
