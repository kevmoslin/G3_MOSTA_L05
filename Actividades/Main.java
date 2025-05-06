package Actividades;

public class Main {
    public static void main(String[] args) {
        GestordeTareas<Tarea> gestor = new GestordeTareas<>(null);

        gestor.agregarTarea(new Tarea("generar informe", 2));
        gestor.agregarTarea(new Tarea("envia notificacion", 5));
        gestor.agregarTarea(new Tarea("pedido", 1));
        gestor.agregarTarea(new Tarea("revisar", 3));

        gestor.eliminarTarea(new Tarea("envia norificacion", 5));

        gestor.imprimirTareas();
    }
}
