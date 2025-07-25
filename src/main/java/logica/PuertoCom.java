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

    /**
     * Este método se utiliza para obtener todos los puertos COM del sistema
     * @return Devuelve un arreglo de todos los puertos COM obtenidos
     */
    public SerialPort[] obtenerPuertos() {
        return SerialPort.getCommPorts();
    }

    /**
     * Este método se utilza para obtener listados todos los puertos COM
     * detectados para mostrarlos en un JComboBox
     * @return Devuelve la <code>lista</code> de los puertos COM con descripción
     */
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
