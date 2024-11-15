
package sistemagestiontareas;

/**
 *
 * @author dieruiz
 */
public class CompletarTareaComando implements Comando{
    
    private Tarea tarea;

    public CompletarTareaComando(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void ejecutar() {
        System.out.println("Completo la tarea");
        this.tarea.setTareaCompletada(true);
    }

    @Override
    public void revertir() {
        System.out.println("Reverso Completar la tarea");
        this.tarea.setTareaCompletada(false);
    }
    
    
    
}
