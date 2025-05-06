package Ejercicios;

import java.util.LinkedList;
import java.util.List;

public class Metodos {

    public static <T> boolean buscarElemento(List<T> lista, T valor){

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

    public static <T> void insertarAlFinal(Node<T> head, T valor) {

    }

    public static <T> int contarNodos(Node<T> head){

    }

    public static <T> boolean sonIguales(Node<T> head1, Node<T> head2){

    }

    public static <T> Node<T> concatenarListas(Node<T> head1, Node<T> head2){

    }

    public static <T> void imprimirLista(Node<T> head){

    }
}
