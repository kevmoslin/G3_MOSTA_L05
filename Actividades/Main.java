package Actividades;

public class Main {
    public static void main(String[] args) {
        GestordeTareas<Tarea> gestor = new GestordeTareas<>();

        gestor.agregarTarea(new Tarea("generar informe", 2));
    }
}
