package Actividades;

public class GestordeTareas<T extends Comparable<T>> {
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
            actual.siguiente = nuevo;
        }
    }

    public boolean eliminarTarea(T tarea){
        if (lista == null) {
           return false; 
        }

        if (lista.data.equals(tarea)) {
            lista = lista.siguiente;
            return true;
        }

        Node<T> actual = lista;
        while (actual.siguiente != null) {
            if (actual.siguiente.equals(tarea)) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimirTareas(){
        Node<T> actual = lista;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.siguiente;
        }
    }

    public int contarTareas(){
        int contador = 0;
        Node<T> actual = lista;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;

    }

    public boolean contieneTarea(T tarea){
        Node<T> actual = lista;
        while (actual != null) {
            if (actual.data.equals(tarea)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public T obtenerTareaMasPrioritaria(){
        if (lista == null) {
            return null;
        }

        T masPrioridad = lista.data;
        Node<T> actual = lista.siguiente;

        while (actual != null) {
            if (actual.data.compareTo(masPrioridad) < 0) {
                masPrioridad = actual.data;
            }
            actual = actual.siguiente;
        }
        return masPrioridad;
    }

    public void invertirTareas(){
        Node<T> prev = null;
        Node<T> actual = lista;
        while (actual != null) {
            Node<T> sigue = actual.siguiente;
            actual.siguiente = prev;
            prev = actual;
            actual = sigue;
        }
        lista = prev;
    }
}
