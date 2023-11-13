package datos;

import entidades.Producto;
import java.util.Iterator;
import java.util.TreeSet;

public class ConjuntoProductos {

    private static TreeSet<Producto> conjuntoProductos = new TreeSet<>();
    private static Iterator<Producto> iterador;

    public static void addProducto(Producto producto) {
        if (producto != null) {
            conjuntoProductos.add(producto);
        }
    }

    public static int getTamaño() {
        return conjuntoProductos.size();
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

    public static String getContenido() {
        StringBuilder contenido = new StringBuilder();
        iterador = conjuntoProductos.iterator();
        while (iterador.hasNext()) {
            contenido.append(iterador.next() + "\n");
        }
        return contenido.toString();
    }

    public static Producto buscarNombre(String nombre) {

        // prefiero evitar el uso de trasladar para no reducir rendimiento si el conjunto es demasiado grande
        // aux = trasladar();
        // return aux.indexOf(nombre); 

        for (Producto productin : conjuntoProductos){
            if (productin.getDescripcion().equalsIgnoreCase(nombre)){
                return productin;
            }
        } return null;

    }

    public static void ordenarDes() {
        
        // no se implementa el metodo ordenar ascendentemente porque los treeset
        // se ordenan solos y por defecto es ascendentemente :)
        try{
            conjuntoProductos = (TreeSet<Producto>) conjuntoProductos.descendingSet();
        } catch (ClassCastException e) {
            System.out.println("Error de casteo");
        }
    }
    
//    public static void ordenarAsPrecio(){
//        conjuntoProductos.clear();        
//        TreeSet<Producto> newConjunto = new TreeSet<>((p1, p2) -> Float.compare(p1.getPrecio(), p2.getPrecio()));
//        conjuntoProductos.addAll(newConjunto);        
//        System.out.println(getContenido()); // debugueando porque se me eliminaba todo el contenido del set
//    }
public static void ordenarAsPrecio() {
    TreeSet<Producto> nuevoConjunto = new TreeSet<>((p1, p2) -> Float.compare(p1.getPrecio(), p2.getPrecio()));
    nuevoConjunto.addAll(conjuntoProductos);
    conjuntoProductos = nuevoConjunto;
    System.out.println(getContenido()); // metodo definitivo
}


    
    public static void ordenarDesPrecio(){
        ordenarAsPrecio();
        conjuntoProductos = (TreeSet<Producto>) conjuntoProductos.descendingSet();
    }
}
