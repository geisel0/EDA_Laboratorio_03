package Lab03_1;

// Clase principal para prueba
public class ListaCircularMain {
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();

        System.out.println("Insertando elementos...");
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);
        lista.mostrar();

        System.out.println("Eliminando 20...");
        lista.eliminar(20);
        lista.mostrar();

        System.out.println("Eliminando 10...");
        lista.eliminar(10);
        lista.mostrar();

        System.out.println("Eliminando 30...");
        lista.eliminar(30);
        lista.mostrar();

        System.out.println("Insertando de nuevo...");
        lista.insertar(100);
        lista.insertar(200);
        lista.insertar(300);
        lista.mostrar();

        System.out.println("Cantidad de nodos: " + lista.contar());

        System.out.println("Buscando y contando 200...");
        lista.buscar(200);
        System.out.println("Buscando y contando 500...");
        lista.buscar(500);

        System.err.println();
        System.out.println("Nodo con tipo de datos generico <T>");
        System.out.println("Prueba con tipo de datos String...");
        ListaCircular<String> listaString = new ListaCircular<>();
        listaString.insertar("Estructura");
        listaString.insertar("Datos");
        listaString.insertar("Circular");
        listaString.mostrar();

        System.out.println("Buscando y contando 'Estructura'...");
        listaString.buscar("Estructura");

        System.out.println("Buscando y contando 'java'...");
        listaString.buscar("java");
    }
}
