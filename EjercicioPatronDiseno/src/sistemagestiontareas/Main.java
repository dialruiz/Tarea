
package sistemagestiontareas;

/**
 *
 * @author dieruiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Tarea tarea = incializarTarea();
        
        CrearTareaComando crear = new CrearTareaComando(tarea);
        
        EditarTareaComando editar = new EditarTareaComando(tarea,"Recarga");
        
        CompletarTareaComando completar = new CompletarTareaComando(tarea);
        
        GestionarTareas gestion = new GestionarTareas();
        
        gestion.revertirUltimaEjecucion();
        
        gestion.recibirTarea(crear);
        gestion.recibirTarea(editar);
        gestion.recibirTarea(completar);
        
        EliminarTareaComando eliminarTarea = new EliminarTareaComando(tarea);
        gestion.recibirTarea(eliminarTarea);
        
        gestion.ejecutarTareas();
        
        gestion.revertirUltimaEjecucion();
        
        gestion.revertirUltimaEjecucion();
        
        System.out.println("La tarea  esta " + tarea.toJson());
        
        
        
    }
    
    private static Tarea incializarTarea() {
        Tarea tarea = new Tarea("Comprar");
        return tarea;
    }
    
}
