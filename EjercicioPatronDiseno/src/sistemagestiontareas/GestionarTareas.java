
package sistemagestiontareas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dieruiz
 */
public class GestionarTareas {
    
    private List<Comando> tareas = new ArrayList<>();
    private List<Comando> historialTareasEjecutadas = new ArrayList<>();
    
    public void recibirTarea(Comando tarea) {
        this.tareas.add(tarea);
    }
    
    public void ejecutarTareas() {
        for(Comando tarea : this.tareas) {
            tarea.ejecutar();
            historialTareasEjecutadas.add(tarea);
        }
    }
    
    public void revertirUltimaEjecucion() {
       if (!historialTareasEjecutadas.isEmpty()) {
            Comando ultimoComando = historialTareasEjecutadas.remove(historialTareasEjecutadas.size() - 1);
            ultimoComando.revertir();
        } else {
           System.out.println("No se puede revertir porque no hay tareas creadas ");
       }
    }
    
}
