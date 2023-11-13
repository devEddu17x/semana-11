package entidades;
public class Producto implements Comparable<Producto>{
    private String descripcion; // nombre
    private float precio;

    public Producto(String nombre, float precio) {
        this.descripcion = nombre;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return descripcion + ": " + precio;
    }

    @Override
    public int compareTo(Producto o) {
        return this.getDescripcion().compareTo(o.getDescripcion());
    }
    
    
    
    
}
