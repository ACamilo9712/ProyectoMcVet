
package Actores;


public class Inventario {
    
    Inventario hijoHizquierdo;
    Inventario hijoDerecho;
    int contenido;
    private String nombre;
    private String descripcion;
    private String presentacion;
    private int unidadExistencia;
    
    
    
    public Inventario(int contenido, String nombre,String descripcion, String presentacion,int unidades) {
        this.contenido=contenido;
        this.nombre= nombre;
        this.descripcion=descripcion;
        this.presentacion=presentacion;
        this.unidadExistencia=unidades;
    }

    public Inventario getHijoHizquierdo() {
        return hijoHizquierdo;
    }

    public void setHijoHizquierdo(Inventario hijoHizquierdo) {
        this.hijoHizquierdo = hijoHizquierdo;
    }

    public Inventario getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(Inventario hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public int getContenido() {
        return contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public int getUnidadExistencia() {
        return unidadExistencia;
    }

    public void setUnidadExistencia(int unidadExistencia) {
        this.unidadExistencia = unidadExistencia;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }             
}
