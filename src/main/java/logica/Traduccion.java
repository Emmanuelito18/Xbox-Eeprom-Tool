package logica;

import java.util.Properties;
import java.io.IOException;

/**
 * Esta clase se encarga de hacer las traducciónes del programa en tiempo real
 * utilizando archivos .properties para ello
 *
 * @author Emmanuelito18
 */
public class Traduccion extends Properties {
    private static final long serialVersionUID = 1L;
    
    /**
     * Constructor de la clase Idioma.
     * @param idioma El <code>idioma</code> para el cual se desea cargar el archivo de propiedades.
     */
    public Traduccion(String idioma){
        /* Se utiliza un switch para determinar qué archivo de propiedades cargar
         en función del valor del parámetro idioma.*/
        switch(idioma){
            case "Español":
                getProperties("espanol.properties");
                break;
            case "Inglés":
                getProperties("ingles.properties");
                break;
            default:
                getProperties("espanol.properties");
        }
    }
    
    /**
     * Este método carga el archivo de propiedades especificado en el objeto Properties actual.
     * @param idioma El nombre del archivo de propiedades a cargar.
     */
    private void getProperties(String idioma) {
        try {
            // Se utiliza el método load de la clase Properties para cargar el contenido
            // del archivo de propiedades en el objeto Properties actual.
            this.load(getClass().getClassLoader().getResourceAsStream(idioma));
        } catch (IOException ex) {
            // Si ocurre una excepción de tipo IOException durante la carga del archivo,
            // se imprime la traza de la pila utilizando el método printStackTrace del objeto excepción.
            ex.printStackTrace();
        }
    }
}
