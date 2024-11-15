package clonacionDePersonajes;

import java.util.ArrayList;
import java.util.List;

public class Arquero extends Heroe{
    public Arquero(String nombre, String traje) {
        super(nombre,traje);
        this.setHabilidades(getHabilidadesBase());
    }

    public Arquero(String nombre, String traje,String experiencia, int nivel, int puntosHabilidad,List<Habilidad> habilidades) {
        super(nombre,traje, experiencia, nivel, puntosHabilidad,habilidades);
    }

    private List<Habilidad> getHabilidadesBase(){
        List<Habilidad> habilidadesBase = new ArrayList<>();
        habilidadesBase.add(new Habilidad("Ataque", "Ataque con arco"));
        habilidadesBase.add(new Habilidad("Defensa", "Esquivar"));
        habilidadesBase.add(new Habilidad("Magica", "Flecha de fuego"));
        return habilidadesBase;
    }

    @Override
    public Heroe clonar() {
        return new Arquero(
                this.getNombre(),
                this.getTraje(),
                this.getExperiencia(),
                this.getNivel(),
                this.getPuntosHabilidad(),
                new ArrayList<>(this.getHabilidades())
        );
    }
}
