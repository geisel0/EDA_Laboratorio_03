package Lab03_1;

// Clase Lista Circular
public class ListaCircular<T> {
    private Nodo<T> ultimo;

    public ListaCircular() {
        ultimo = null;
    }

    // Insertar un nodo al final
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (ultimo == null) {
            ultimo = nuevo;
            ultimo.siguiente = ultimo;
        } else {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
    }

    // Mostrar la lista
    public void mostrar() {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo<T> actual = ultimo.siguiente;
        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);
        System.out.println("(inicio)");
    }

    // Eliminar un nodo
    public void eliminar(T dato) {
        if (ultimo == null) {
            System.out.println("Lista vacía");
            return;
        }

        Nodo<T> actual = ultimo.siguiente;
        Nodo<T> anterior = ultimo;

        do {
            if (actual.dato.equals(dato)) {
                if (actual == ultimo && actual == ultimo.siguiente) {
                    // Solo hay un nodo
                    ultimo = null;
                } else {
                    anterior.siguiente = actual.siguiente;
                    if (actual == ultimo) {
                        ultimo = anterior;
                    }
                }
                System.out.println("Elemento eliminado: " + dato);
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        System.out.println("Elemento no encontrado: " + dato);
    }

    // Contar elementos de la lista
    public int contar() {
        if (ultimo == null) {
            return 0;
        }

        int contadorNodos = 0;
        Nodo<T> actual = ultimo.siguiente;
        do {
            contadorNodos++;
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        return contadorNodos;
    }

    // Buscar elemento
    public int buscar(T dato) {
        if (ultimo == null) {
            System.out.println("Lista vacia");
            return 0;
        }

        int contador = 0;
        Nodo<T> actual = ultimo.siguiente;

        do {
            if (actual.dato.equals(dato)) {
                contador++;
            }
            actual = actual.siguiente;
        } while (actual != ultimo.siguiente);

        if (contador > 0) {
            System.out.println("Elemento encontrado: " + dato + "   veces: " + contador);
        } else {
            System.out.println("Elemento no encontrado: " + dato);
        }
        return contador;
    }
}
