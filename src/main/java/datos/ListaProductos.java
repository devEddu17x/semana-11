/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import entidades.Producto;

/**
 *
 * @author eduar
 */
public class ListaProductos {

    private static List<Producto> listaProductos = new ArrayList<Producto>();
    private static Iterator<Producto> iteradoIt;

    public static void addProducto(Producto producto) {
        if (producto != null) {
            listaProductos.add(producto);
        }

    }

    public static Producto getProducto(int posicion) {
        if (posicion >= 0 && posicion < listaProductos.size() - 1) {
            return listaProductos.get(posicion);
        }
        return null;
    }

    public static String getContenido() {
        Iterator<Producto> iterador = listaProductos.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterador.hasNext()) {
            String contenido = iterador.next().toString();
            stringBuilder.append(contenido + "\n");
        }
        return stringBuilder.toString();
    }

    public static Producto buscarNombre(String descripcion) {
        for (Producto producto : listaProductos) {
            if (producto.getDescripcion().equalsIgnoreCase(descripcion)) {
                return producto;
            }
        }
        return null;
    }

    public static void ordenarAs() {
        Collections.sort(listaProductos);
        //Collections.reverse(listaNombres);
    }

    public static void ordenarAsPrecio() {
        // usar expresion lamda para darle un comparador "compare"
        Collections.sort(listaProductos, (Producto p1, Producto p2) -> Float.compare(p1.getPrecio(), p2.getPrecio()));
        //Collections.reverse(listaNombres);
    }
    public static void ordenarDesPrecio() {
        ordenarAsPrecio();
        Collections.reverse(listaProductos);
    }
    
    public static void ordenarDes() {
        ordenarAs();
        Collections.reverse(listaProductos);
    }

    public static int getTamaño() {
        return listaProductos.size();
    }
}
