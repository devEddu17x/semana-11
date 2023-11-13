package datos;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

/**
 *
 * @author eduar
 */
public class MapaNombres {

    private static TreeMap<Integer, String> mapaNombres = new TreeMap<>();

    public static boolean addNombre(String nombre, int clave) {
        if (mapaNombres.containsKey(clave)) {
            return false;
        } else {
            mapaNombres.put(clave, nombre);
            return true;
        }
    }

    public static int buscarNombre(String nombre) {
        // buscar el nombre y devolver la clave
        // Map.Entry especifica el valor que tenemos es decir Clave <Integer> Valor <String>
        // es como un for each, recuerda Entry con mayuscula
        for (Map.Entry<Integer, String> entry : mapaNombres.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(nombre)) {
                return entry.getKey();
            }
        }
        return -1; // si no se encuentra se devuelve -1
    }

    public static String getContenido() {
        StringBuilder contenido = new StringBuilder();

        // generando un coleccion de los valores del treeMap
        for (String valor : mapaNombres.values()) {
            contenido.append(valor + "\n");
        }

        return contenido.toString();
    }

    public static String reverseContenido() {
        StringBuilder contenido = new StringBuilder();

        // crear un set navegable de las claves co NavigableSet que se obtiene
        // [mapa].navigableKeySet()
        NavigableSet<Integer> setNavigable = mapaNombres.descendingKeySet();

        for (Integer clave : setNavigable) {
            contenido.append(mapaNombres.get(clave) + "\n");
        }
        
        return contenido.toString();
    }

//    public static boolean verificarClave(int clave){
//        return mapaNombres.containsKey(clave);
//    }
}
