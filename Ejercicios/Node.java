package Ejercicios;

public class Node<T> {
    T data;
    Node<T> siguiente;

    public Node(T data){
        this.data = data;
        this.siguiente = null;
    }
}
