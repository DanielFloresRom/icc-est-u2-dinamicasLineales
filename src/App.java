import java.util.*;

public class App {

    public static void main(String[] args) {

        runLinkList();
        runQueue();
        runStack();

        // Ejercicio 1
        Ejercicio1 ej1 = new Ejercicio1();
        System.out.println("\nInvertir texto:");
        System.out.println(ej1.invertString("COMPUTACION"));

        // Ejercicio 2
        Ejercicio2 ej2 = new Ejercicio2();
        System.out.println("\nPalíndromos:");
        System.out.println(ej2.esPalindromo("radar"));
        System.out.println(ej2.esPalindromo("computacion"));
    }

    // LinkedList
    private static void runLinkList() {
        System.out.println("=== LinkedList ===");

        LinkedList<String> lista = new LinkedList<>();

        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");

        System.out.println("Lista: " + lista);

        lista.remove("Dos");

        System.out.println("Después de eliminar: " + lista);
    }

    // Queue
    private static void runQueue() {
        System.out.println("\n=== Queue ===");

        Queue<String> cola = new LinkedList<>();

        cola.add("A");
        cola.add("B");
        cola.add("C");

        System.out.println("Cola: " + cola);

        cola.poll();

        System.out.println("Después de atender: " + cola);
    }

    // Stack usando ArrayDeque
    private static void runStack() {
        System.out.println("\n=== Stack (ArrayDeque) ===");

        ArrayDeque<String> pila = new ArrayDeque<>();

        pila.push("X");
        pila.push("Y");
        pila.push("Z");

        System.out.println("Pila: " + pila);

        pila.pop();

        System.out.println("Después de sacar: " + pila);
    }
}