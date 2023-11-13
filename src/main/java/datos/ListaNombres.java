package datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListaNombres {

    private static List<String> listaNombres = new ArrayList<String>();
    private static Iterator<String> iteradoIt;

    public static void addNombre(String nombre) {
        if (nombre != null) {
            listaNombres.add(nombre);
        }

    }

    public static String getNombre(int posicion) {
        if (posicion >= 0 && posicion < listaNombres.size() - 1) {
            return listaNombres.get(posicion);
        }
        return null;
    }

    public static String getContenido() {
        Iterator<String> iterador = listaNombres.iterator();
        StringBuilder stringBuilder = new StringBuilder();
        while (iterador.hasNext()) {
            String nombre = iterador.next();
            stringBuilder.append(nombre + "\n");
        }
        return stringBuilder.toString();
    }

    public static int buscarNombre(String nombre) {
        return listaNombres.indexOf(nombre);
    }

    public static void ordenarAs() {
        Collections.sort(listaNombres);
        //Collections.reverse(listaNombres);
    }

    public static void ordenarDes() {
        ordenarAs();
        Collections.reverse(listaNombres);
    }
    
    public static int getTamaño(){
        return listaNombres.size();
    }
}
