package Lab03_2;

public class ListaDobleMain {
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();

        System.out.println("Insertando al final...");
        lista.insertarFinal(11);
        lista.insertarFinal(12);
        lista.insertarFinal(13);
        lista.mostrar();

        System.out.println("Insertando al inicio...");
        lista.insertarInicio(5);
        lista.insertarInicio(1);
        lista.mostrar();

        System.out.println("Mostrar en reverso...");
        lista.mostrarReverso();
    }
}

