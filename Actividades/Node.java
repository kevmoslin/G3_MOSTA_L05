package Actividades;

public class Node<T> {
    private T data;
    private Node<T> siguiente;

    public Node(T data, Node<T> siguiente){
        this.data = data;
        this.siguiente = siguiente;
    }

    public T getData(){
        return data;
    }

    public void setData()
}