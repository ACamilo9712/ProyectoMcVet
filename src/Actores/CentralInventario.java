package Actores;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CentralInventario {

    public Inventario raiz;
    public JTable tabla;

    public void insertar(Inventario raiz, Inventario n) {
        if (this.raiz != null) {
            if (n.contenido < raiz.contenido) {
                if (raiz.hijoHizquierdo != null) {
                    insertar(raiz.hijoHizquierdo, n);
                } else {
                    raiz.hijoHizquierdo = n;
                }
            } else {
                if (raiz.hijoDerecho != null) {
                    insertar(raiz.hijoDerecho, n);
                } else {
                    raiz.hijoDerecho = n;
                }
            }
        } else {
            this.raiz = n;
        }
    }

    public void visitar(Inventario raiz) {
        System.out.println(raiz.contenido);
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.addRow(new Object[]{raiz.contenido, raiz.getNombre(), raiz.getDescripcion(), raiz.getPresentacion(), raiz.getUnidadExistencia()});
    }

    public void preorder(Inventario raiz) {
        if (raiz != null) {
            visitar(raiz);
            preorder(raiz.hijoHizquierdo);
            preorder(raiz.hijoDerecho);
        }
    }

    public Inventario inorder(Inventario raiz) {
        if (raiz != null) {
            inorder(raiz.hijoHizquierdo);
            visitar(raiz);
            inorder(raiz.hijoDerecho);
        }
        return raiz;
    }

    public void postorder(Inventario raiz) {
        if (raiz != null) {
            postorder(raiz.hijoHizquierdo);
            postorder(raiz.hijoDerecho);
            visitar(raiz);
        }
    }

    public Inventario buscar(Inventario raiz, int contenido) {
        if (raiz != null) {
            if (contenido != raiz.contenido) {
                return contenido < raiz.contenido ? buscar(raiz.hijoHizquierdo, contenido) : buscar(raiz.hijoDerecho, contenido);
            } else {
                return raiz;
            }
        }
        return raiz;
    }

    public Inventario Eliminar(int contenido, Inventario raiz) {

        return null;
    }

    public void borrar(int elemento) { //  //recive el item que quiere ser borrado
        raiz = borrar(raiz, elemento); // llama a la funcion recursiva(root es el nombre de mi nodo raiz)
    }

    private Inventario borrar(Inventario raiz, int elemento) {
        if (raiz.contenido == elemento) { // caso base en el que el nodo r es el que se desea borrar
            if (raiz.hijoDerecho == null && raiz.hijoHizquierdo == null) {  // caso a en el que el nodo es hoja
                raiz = null;
                return raiz;
            }
            if (raiz.hijoDerecho == null) {  // caso b, tiene un solo hijo(izquierdo)
                raiz = raiz.hijoHizquierdo;
                return raiz;    // ahora el hijo ocupa el lugar del padre y salimos del metodo
            }

            if (raiz.hijoHizquierdo == null) {  // caso b, tiene un solo hijo(derecho)
                raiz = raiz.hijoDerecho;
                return raiz;
            }
            //caso c; tiene dos hijos
            raiz.contenido = encontrarMaximo(raiz.hijoHizquierdo); // sera igual al nodo de mayor valor en el sub-arbol izquierdo
            return raiz;//el nodo igualado (de mayor valor) se debe eliminar para que no quede repetido
        }
         if(elemento > raiz.contenido){ //si el elemento buscado es mayor al del nodo actual
          raiz.hijoDerecho = borrar(raiz.hijoDerecho, elemento); 
          return raiz; //lo busca recursivamente en los nodo &quot;mayores&quot;
       }      
        //ultima opcion: que el elemento este en la izquierda
        raiz.hijoHizquierdo = borrar(raiz.hijoHizquierdo, elemento);
        return raiz;
    }

//funcion que encuentra el maximo
    private Integer encontrarMaximo(Inventario raiz) {
        if (raiz.hijoDerecho == null) //si no hay un nodo con mayor valor retorna el valor del nodo actual
        {
            return raiz.contenido;
        }
        // sigue buscando en los nodos de mayor valor
        return encontrarMaximo(raiz.hijoDerecho);
    }
    /*
    public Node delete(Integer value) {
    Node response = this;
    if (value < this.value) {  
        this.left = this.left.delete(value);    
    } else if (value > this.value) {
        this.right = this.right.delete(value);
    } else {
        if (this.left != null && this.right != null) {
            Node temp = this;
            Node maxOfTheLeft = this.left.findPredecessor();
            this.value = maxOfTheLeft.getValue();
            temp.left=temp.left.delete(maxOfTheLeft.getValue());
        } else if (this.left != null) {
            response = this.left;
        } else if (this.right != null) {
            response = this.right;
        } else {
            response = null;
        }
    }
    return response;
}*/

}
