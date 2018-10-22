package Actores;

public class CentralMascota {

    public Mascota primero;

    public Mascota buscarMascota(int idcontenido) {
        Mascota actual = this.primero;
        while ((actual != null) && (actual.getIdmascota() != idcontenido)) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public Mascota localizarUltimo() {
        Mascota actual = this.primero;
        while ((actual != null) && (actual.getSiguiente() != null)) {
            actual = actual.getSiguiente();
        }
        return actual;
    }

    public Mascota localizarAnterior(int idMascota) {
        Mascota actual = buscarMascota(idMascota);
        return actual != null ? actual.getAnterior() : actual;
    }

    public void insertarAlComienzo(Mascota m) {
        m.setAnterior(null);
        if (this.primero != null) {
            m.setSiguiente(this.primero);
            this.primero.setAnterior(m);
        } else {
            m.setSiguiente(null);
        }
        this.primero = m;
    }

    public void insertarUltimo(Mascota m) {
        Mascota ultimo = localizarUltimo();
        ultimo.setSiguiente(m);
        m.setAnterior(ultimo);
        m.setSiguiente(null);
    }

    public void insertarantesde(int idMascota, Mascota m) {
        Mascota anterior = localizarAnterior(idMascota);
        m.setAnterior(anterior);
        m.setSiguiente(anterior.getSiguiente());
        anterior.getSiguiente().setAnterior(m);
        anterior.setSiguiente(m);

        
    }

    public void insertarDespuesDe(int idMascota, Mascota m) {
        Mascota actual = buscarMascota(idMascota);

        if (actual != null) {
            m.setAnterior(actual);
            m.setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(m);
            actual.setSiguiente(m);
        }
    }

    public Boolean ElminarMascota(int idMascota) {
        Mascota actual = buscarMascota(idMascota);

        if (actual != null) {
            if (actual.getAnterior() == null) {
                primero = actual.getSiguiente();
                primero.setAnterior(null);
            } else if (actual.getSiguiente() == null) {
                actual.getAnterior().setSiguiente(null);
            } else {
                actual.getAnterior().setSiguiente(actual.getSiguiente());
                actual.getSiguiente().setAnterior(actual.getAnterior());
            }
        }
        return Boolean.valueOf(true);
    }

    public void mostrarMascotas() {
        Mascota actual = this.primero;
        while (actual != null) {
            System.out.println(actual.getIdmascota());
            actual = actual.getSiguiente();
        }
    }
}
