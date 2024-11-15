/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestiontareas;

/**
 *
 * @author dieruiz
 */
public class EditarTareaComando implements Comando {
    
    private Tarea tarea;
    
    private String nombreNuevo;
    private String nombreAnterior;

    public EditarTareaComando(Tarea tarea, String nombreNuevo) {
        this.tarea = tarea;
        this.nombreNuevo = nombreNuevo;
    }

    @Override
    public void ejecutar() {
       System.out.println("Edito la tarea");
       this.nombreAnterior = tarea.getNombreTarea();
       tarea.setNombreTarea(this.nombreNuevo);
    }

    @Override
    public void revertir() {
        System.out.println("Reverso la Edicion de la tarea");
        tarea.setNombreTarea(this.nombreAnterior);
    }
    
}
