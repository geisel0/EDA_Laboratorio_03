package Lab03_2;

public class ListaDoble {
    private Nodo primero;
    private Nodo ultimo;

    public ListaDoble() {
        primero = null;
        ultimo = null;
    }

    // Insertar al inicio
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = ultimo = nuevo;
        } else {
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
    }

    // Insertar al final
    public void insertarFinal(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (ultimo == null) {
            primero = ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }

    // Mostrar lista en orden
    public void mostrar() {
        if (primero == null) {
            System.out.println("Lista vacia");
            return;
        }
        Nodo actual = primero;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    // Mostrar lista en reverso
    public void mostrarReverso() {
        if (ultimo == null) {
            System.out.println("Lista vacia");
            return;
        }
        Nodo actual = ultimo;
        while (actual != null) {
            System.out.print(actual.dato + " <-> ");
            actual = actual.anterior;
        }
        System.out.println("null");
    }
}
