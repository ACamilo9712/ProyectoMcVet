package Actores;

public class CentralClinica {

    public Establecimiento primero;

    
    public void agregarAlComienzo(Establecimiento e) {
        e.setSiguiente(this.primero);
        this.primero = e;
    }
    
    public String mostrarClientes() {
        Establecimiento actual = this.primero;
        while (actual != null) {
            System.out.println(actual.getNombreEstablecimiento() + actual.getDireccion());
            actual = actual.getSiguiente();
        }
        return primero.getNombreEstablecimiento();
    }

}
