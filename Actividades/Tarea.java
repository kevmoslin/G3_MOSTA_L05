package Actividades;

public class Tarea {
    private String titulo;
    private String prioridad;

    public Tarea(String tarea, String priotidad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getPrioridad(){
        return prioridad;
    }

    public void setPrioridad(String prioridad){
        this.prioridad = prioridad;
    }
}
