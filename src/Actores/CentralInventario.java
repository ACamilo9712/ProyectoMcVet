package Actores;

public class CentralInventario {

    public Inventario raiz;

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
    
    public Inventario Eliminar(int contenido)
    {
   
    
        return null;
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
