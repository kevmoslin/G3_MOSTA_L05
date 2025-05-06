package Actividades;

public class Main {
    public static void main(String[] args) {
        GestordeTareas<Tarea> gestor = new GestordeTareas<>(null);

        gestor.agregarTarea(new Tarea("generar informe", 2));
        gestor.agregarTarea(new Tarea("envia notificacion", 5));
        gestor.agregarTarea(new Tarea("pedido", 1));
        gestor.agregarTarea(new Tarea("revisar", 3));

        System.out.println("\nTareas:");
        gestor.imprimirTareas();

        System.out.println("\nEliminando.....");
        gestor.eliminarTarea(new Tarea("envia norificacion", 5));

        System.out.println("\nTareas despues de Eliminar");
        gestor.imprimirTareas();

        System.out.println("\nBuscando tarea....");
        Tarea buscar = new Tarea("pedido", 1);
        boolean existe = gestor.contieneTarea(buscar);
        System.out.println("¿la tarea existe?: " + existe);

        System.out.println("\ninvirtiendo lista...");
        gestor.invertirTareas();
        gestor.imprimirTareas();
    }
}
