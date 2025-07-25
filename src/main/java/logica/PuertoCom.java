package logica;

import com.fazecast.jSerialComm.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase se utliza para obtener todos los puertos COM disponibles
 *
 * @author Emmanuelito18
 */
public class PuertoCom {

    public SerialPort[] obtenerPuertos() {
        return SerialPort.getCommPorts();
    }

    public List<String> obtenerListaPuertos() {

        List<String> lista = new ArrayList<>();
        SerialPort[] puertos = obtenerPuertos();

        if (puertos.length == 0) {
            lista.add("No se encontraron puertos COM.");
        } else {
            for (SerialPort puerto : puertos) {
                String descripcion = puerto.getSystemPortName() + " - " + puerto.getDescriptivePortName();
                lista.add(descripcion);
            }
        }
        return lista;
    }
}
