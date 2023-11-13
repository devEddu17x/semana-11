package datos;

import java.util.Iterator;
import java.util.TreeSet;

public class ConjuntoNombres {

    private static TreeSet<String> conjuntoNombres = new TreeSet<>();
    private static Iterator<String> iterador;

    public static void setNombre(String nombre) {
        if (nombre != null) {
            conjuntoNombres.add(nombre);
        }
    }

    public static int getTamaño() {
        return conjuntoNombres.size();
    }
// metodo sin usar por temas de rendimiento
    
//    private static ArrayList<String> trasladar() {
//        aux = new ArrayList<>();
//        iterador = conjuntoNombres.iterator();
//        while (iterador.hasNext()) {
//            aux.add(iterador.next());
//        }
//        return aux;
//    }

    public static String getNombre(int posicion) {
// prefiero evitar el uso de trasladar para no reducir rendimiento si el conjunto es demasiado grande
//        if (posicion >= 0 && posicion < conjuntoNombres.size()) {
//            aux = trasladar();
//            return aux.get(posicion);
//        }
//        return null;

        int contador = 0;
        iterador = conjuntoNombres.iterator();
        while (iterador.hasNext()) {
            if (contador == posicion) {
                return iterador.next();
            }
            iterador.next();
        }
        return null;
    }

    public static String getContenido() {
        StringBuilder contenido = new StringBuilder();
        iterador = conjuntoNombres.iterator();
        while (iterador.hasNext()) {
            contenido.append(iterador.next() + "\n");
        }
        return contenido.toString();
    }

    public static int buscarNombre(String nombre) {

        // prefiero evitar el uso de trasladar para no reducir rendimiento si el conjunto es demasiado grande
        // aux = trasladar();
        // return aux.indexOf(nombre); 
        int contador = 0;
        iterador = conjuntoNombres.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equals(nombre)) {
                return contador;
            }
            contador++;
        }

        return -1;

    }

    public static void ordenarDes() {
        
        // no se implementa el metodo ordenar ascendentemente porque los treeset
        // se ordenan solos y por defecto es ascendentemente :)
        try{
            conjuntoNombres = (TreeSet<String>) conjuntoNombres.descendingSet();
        } catch (ClassCastException e) {
            System.out.println("Error de casteo");
        }
    }
}
