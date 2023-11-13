package datos;

import java.util.TreeMap;
import entidades.Producto;
import java.util.Map;
import java.util.NavigableSet;

/**
 *
 * @author eduar
 */
public class MapaProductos {

    private static TreeMap<String, Producto> mapaProducto = new TreeMap<>();

    public static void addProducto(String nombre, float precio) {
        mapaProducto.put(nombre, new Producto(nombre, precio));
    }

    public static String buscarNombre(String nombre) {
        // generar un foreach
        for (Map.Entry<String, Producto> entry : mapaProducto.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(nombre)) {
                return entry.toString();
            }
        }
        return null;
    }

    public static String getContenido() {
        StringBuilder contenido = new StringBuilder();

        for (Producto producto : mapaProducto.values()) {
            contenido.append(producto.toString() + "\n");
        }
        return contenido.toString();
    }

    public static String reverseContenido() {
        // generar setnavigable
        StringBuilder contenido = new StringBuilder();
        NavigableSet<String> navigableSet = mapaProducto.descendingKeySet();
        for (String clave : navigableSet) {
            contenido.append(mapaProducto.get(clave).toString() + "\n");
        }
        return contenido.toString();
    }
}
