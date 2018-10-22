package Actores;

public class Establecimiento {

    private int nombre;
    private int telefono;
    private String direccion;
    private String paginaWeb;
    private boolean visitado;
    private boolean etiqueta;
    private int identificador; // lleva el acoulado de cada nodo
    private Establecimiento Predecesor;

    public Establecimiento() {
        this.nombre = -1;
        this.visitado = false;
        this.etiqueta = false;
        this.Predecesor = null;
        this.identificador = 0;

    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public boolean isEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Establecimiento getPredecesor() {
        return Predecesor;
    }

    public void setPredecesor(Establecimiento Predecesor) {
        this.Predecesor = Predecesor;
    }
    
    
}
