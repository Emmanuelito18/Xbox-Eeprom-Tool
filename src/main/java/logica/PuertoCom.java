package logica;

import com.fazecast.jSerialComm.*;

/**
 * Esta clase se utliza para obtener todos los puertos COM disponibles
 *
 * @author Emmanuelito18
 */
public class PuertoCom {

    SerialPort[] puertos;
    public SerialPort[] obtenerPuertos() {
        puertos = SerialPort.getCommPorts();
        return puertos;
    }
}
