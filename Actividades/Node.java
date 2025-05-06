package Actividades;

public class Node<T> {
    private T data;
    private Node<T> siguiente;

    public Node(T data){
        this.data = data;
        this.siguiente = null;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Node<T> getSiguiente(){
        return siguiente;
    }

    public void setPrioridad(Node<T> siguiente){
        this.siguiente = siguiente;
    }
}