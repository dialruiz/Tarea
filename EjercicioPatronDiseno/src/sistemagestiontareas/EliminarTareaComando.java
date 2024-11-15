package sistemagestiontareas;

/**
 *
 * @author dieruiz
 */
public class EliminarTareaComando implements Comando {
    
    private Tarea tarea;

    public EliminarTareaComando(Tarea tarea) {
        this.tarea = tarea;
    }
    
    @Override
    public void ejecutar() {
        System.out.println("Elimino la tarea");
        this.tarea.setTareaEliminada(true);
    }

    @Override
    public void revertir() {
       System.out.println("Reverso la Edicion de la tarea");
       this.tarea.setTareaEliminada(false);
    }
    
}
