import java.util.ArrayList;
import java.util.List;

public class Mago extends Heroe{
    public Mago(String nombre,String traje) {
        super(nombre,traje);
        this.setHabilidades(getHabilidadesBase());
    }

    public Mago(String nombre, String traje,String experiencia, int nivel, int puntosHabilidad,List<Habilidad> habilidades) {
        super(nombre,traje, experiencia, nivel, puntosHabilidad,habilidades);
    }

    private List<Habilidad> getHabilidadesBase(){
        List<Habilidad> habilidadesBase = new ArrayList<>();
        habilidadesBase.add(new Habilidad("Ataque", "Ataque con barita"));
        habilidadesBase.add(new Habilidad("Defensa", "Defensa con escudo magico"));
        habilidadesBase.add(new Habilidad("Magica", "Rayo destructor"));
        return habilidadesBase;
    }

    @Override
    public Heroe clonar() {
        return new Mago(
                this.getNombre(),
                this.getTraje(),
                this.getExperiencia(),
                this.getNivel(),
                this.getPuntosHabilidad(),
                new ArrayList<>(this.getHabilidades())
        );
    }
}
