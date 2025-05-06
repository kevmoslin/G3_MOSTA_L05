package Actividades;

public class Tarea implements Comparable<Tarea> {
    private String titulo;
    private int prioridad;

    public Tarea(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getPrioridad(){
        return prioridad;
    }

    public void setPrioridad(int prioridad){
        this.prioridad = prioridad;
    }


    public int compareTo(Tarea otra){
        return Integer.compare(this.prioridad, otra.prioridad);
    }

    public String toString(){
        return  "Titulo: " + getTitulo() + "; Prioridad: " + getPrioridad();
    }
}
