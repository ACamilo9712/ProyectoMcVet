package Actores;

import java.io.PrintStream;

public class CentralCliente {

    public Cliente primero;

    public Cliente buscarCliente(int idCliente) {
        Cliente actual = this.primero;
        while ((actual != null) && (actual.getIdcliente() != idCliente)) {
            actual = actual.getSiguiente();
        }
        System.out.println("Encontrado");
        return actual;
    }

    public Cliente ultimoCliente() {
        Cliente actual = this.primero;
        if (actual != null) {
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
        }
        return actual;
    }

    public Cliente localizarAnterior(int idCliente) {
        Cliente anterior = null;
        Cliente actual = this.primero;
        while ((actual != null) && (actual.getIdcliente() != idCliente)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        return actual != null ? anterior : null;
    }

    public void agregarAlComienzo(Cliente c) {
        c.setSiguiente(this.primero);
        this.primero = c;
    }

    public void agregarAlFinal(Cliente c) {
        Cliente ultimo = ultimoCliente();
        c.setSiguiente(null);
        ultimo.setSiguiente(c);
    }

    public void insertarAntesDe(int idCliente, Cliente c)
            throws NullPointerException {
        Cliente anterior = localizarAnterior(idCliente);
        if (anterior == null) {
            throw new NullPointerException(Integer.toString(idCliente));
        }
        c.setSiguiente(anterior.getSiguiente());
        anterior.setSiguiente(c);
    }

    public void insertarDespuesDe(int idCliente, Cliente c) {
        Cliente anterior = buscarCliente(idCliente);
        if (anterior == null) {
            System.out.println("El cliente no existe");
        } else {
            anterior.setSiguiente(c);
        }
    }

    public Boolean EliminarCliente(int idCliente) {
        Cliente actual = buscarCliente(idCliente);
        Cliente anterior = localizarAnterior(idCliente);
        anterior.setSiguiente(actual.getSiguiente());
        return Boolean.valueOf(true);
    }

    public void mostrarClientes() {
        Cliente actual = this.primero;
        while (actual != null) {
            System.out.println(actual.getIdcliente() + actual.getNombre_cliente() + actual.getDireccion() + actual.getTelefono());
            actual = actual.getSiguiente();
        }
    }
}
