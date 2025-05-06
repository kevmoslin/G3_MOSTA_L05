package Ejercicios;

import java.util.LinkedList;
import java.util.List;

public class main {
    public static void Main(String[] args) {
        Node<Integer> lista1 = null;

        lista1 = Metodos.insertarAlFinal(lista1, 1);
        lista1 = Metodos.insertarAlFinal(lista1, 2);
        lista1 = Metodos.insertarAlFinal(lista1, 3);

        System.out.println("lista1 original: ");
        Metodos.imprimirLista(lista1);

        int cont1 = Metodos.contarNodos(lista1);
        System.out.println("cantidad de nodos lista 1: " + cont1);

        lista1 = Metodos.invertirListaEnlazada(lista1);
        System.out.println("lista1 invertida: ");
        Metodos.imprimirLista(lista1);

        Node<Integer> lista2 = null;
        lista2 = Metodos.insertarAlFinal(lista2, 1);
        lista2 = Metodos.insertarAlFinal(lista2, 2);
        lista2 = Metodos.insertarAlFinal(lista2, 3);

        System.out.println("lista2: ");
        Metodos.imprimirLista(lista2);

        boolean iguales = Metodos.sonIguales(lista1, lista2);
        System.out.println("¿las dos listas con iguales?: " + iguales);
    }
}
