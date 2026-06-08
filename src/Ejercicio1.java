import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    /**
     * Metodo que devuelve una cadena de texto invertida
     * texto -> Computacion
     * resultado -> NOICATUPMOC
     * USANDO SOLO PILAS
     */
    public String invertString(String texto) {

        Deque<Character> pila = new ArrayDeque<>();

        // Apilar todos los caracteres
        for (char letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";

        // Desapilar y construir la cadena invertida
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return invertido.toUpperCase();
    }
}