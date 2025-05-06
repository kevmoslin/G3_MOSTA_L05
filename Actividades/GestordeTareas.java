package Actividades;

public class GestordeTareas<T> {
    private Node<T> lista;

    public GestordeTareas(Node<T> lista){
        this.lista = lista;
    }

    public void agregarTarea(T tarea){
        Node<T> nuevo = new Node<>(tarea);
        if (lista == null) {
            lista = nuevo;
        } else {
            Node<T> actual = lista;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
        }
    }

    
}
