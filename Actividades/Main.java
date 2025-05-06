package Actividades;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestordeTareas<Tarea> gestor = new GestordeTareas<>(null);
        List<Tarea> tareasCompletadas = new LinkedList<>();

        gestor.agregarTarea(new Tarea("generar informe", 2));
        gestor.agregarTarea(new Tarea("envia notificacion", 5));
        gestor.agregarTarea(new Tarea("pedido", 1));
        gestor.agregarTarea(new Tarea("revisar", 3));

        System.out.println("\nTareas:");
        gestor.imprimirTareas();

        System.out.println("\nEliminando.....");
        gestor.eliminarTarea(new Tarea("pedido", 1));

        System.out.println("\nTareas despues de Eliminar");
        gestor.imprimirTareas();

        System.out.println("\nBuscando tarea....");
        Tarea buscar = new Tarea("revisar", 3);
        boolean existe = gestor.contieneTarea(buscar);
        System.out.println("¿la tarea existe?: " + existe);

        System.out.println("\ninvirtiendo lista...");
        gestor.invertirTareas();
        gestor.imprimirTareas();

        System.out.println("\nbuscando tarea mas prirotaria...");
        Tarea prioritaria = gestor.obtenerTareaMasPrioritaria();
        System.out.println("\nTarea más prioritaria: " + prioritaria);

        System.out.println("\nTransfiriendo tarea mas prioritaria a tareas completadas...");
        tareasCompletadas.add(prioritaria);
        gestor.eliminarTarea(prioritaria);

        System.out.println("\ntareas despues de transferir la completada");
        gestor.imprimirTareas();

        System.out.println("\nTareas completadas:");
        for (Tarea t : tareasCompletadas) {
            System.out.println(t);
        }
    }
}
