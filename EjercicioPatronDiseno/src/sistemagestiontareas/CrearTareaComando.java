
package sistemagestiontareas;

/**
 *
 * @author dieruiz
 */
public class CrearTareaComando implements Comando {
    
    private Tarea tarea;
    
    public CrearTareaComando(Tarea tarea) {
        this.tarea = tarea;
    }

    
    @Override
    public void ejecutar() {
        System.out.println("Tarea creada: " + tarea.getNombreTarea());
    }

    @Override
    public void revertir() {
        System.out.println("Tarea revertida: " + tarea.getNombreTarea());
    }
    
}
