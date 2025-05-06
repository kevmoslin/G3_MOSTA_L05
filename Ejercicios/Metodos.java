package Ejercicios;

import java.util.LinkedList;
import java.util.List;

public class Metodos {

    public static <T> boolean buscarElemento(List<T> lista, T valor){
        for(T elemento : lista){
            if (elemento.equals(valor)) {
                return true;
            }
        }
        return false;
    }

    public static <T> Node<T> invertirListaEnlazada(Node<T> head){
        Node<T> prev = null;
        Node<T> actual = head;
        while (actual != null) {
            Node<T> sigue = actual.siguiente;
            actual.siguiente = prev;
            prev = actual;
            actual = sigue;
        }
        return prev;
    }

    public static <T> Node<T> insertarAlFinal(Node<T> head, T valor) {
        Node<T> nuevo = new Node<T>(valor);
        if (head == null) {
            return nuevo;
        } else{
            Node<T> actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            return head;
        }
    }

    public static <T> int contarNodos(Node<T> head){
        int contador = 0;
        Node<T> actual = head;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }

    public static <T> boolean sonIguales(Node<T> head1, Node<T> head2){
        int tamañolista1 = contarNodos(head1);
        int tamañolista2 = contarNodos(head2);

        if (tamañolista1 != tamañolista2) {
            return false;
        }

        Node<T> actual1 = head1;
        Node<T> actual2 = head2;

        while (actual1 != null) {
            if (!actual1.data.equals(actual2.data)) {
                return false;
            }
            actual1 = actual1.siguiente;
            actual2 = actual2.siguiente;
        }

        return true;
    }

    public static <T> Node<T> concatenarListas(Node<T> head1, Node<T> head2){

    }

    public static <T> void imprimirLista(Node<T> head){
        Node<T> actual = head;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.siguiente;
        }
    }
}
