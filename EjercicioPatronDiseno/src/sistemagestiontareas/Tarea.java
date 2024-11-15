
package sistemagestiontareas;

/**
 *
 * @author dieruiz
 */
public class Tarea {
    private String nombreTarea;
    
    private boolean tareaCompletada;
    
    private boolean tareaEliminada;
    
    public Tarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }


    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public boolean isTareaCompletada() {
        return tareaCompletada;
    }

    public void setTareaCompletada(boolean tareaCompletada) {
        this.tareaCompletada = tareaCompletada;
    }

    public boolean isTareaEliminada() {
        return tareaEliminada;
    }

    public void setTareaEliminada(boolean tareaEliminada) {
        this.tareaEliminada = tareaEliminada;
    }
    
    public String toJson() {
        return String.format(
            "{ \"nombreTarea\": \"%s\", \"tareaCompletada\": %b, \"tareaEliminada\": %b }",
            nombreTarea,
            tareaCompletada,
            tareaEliminada
        );
    }
}
