import java.util.ArrayList;
import java.util.List;

public class Guerrero extends Heroe {
    public Guerrero(String nombre,String traje) {
        super(nombre,traje);
        this.setHabilidades(getHabilidadesBase());
    }

    public Guerrero(String nombre, String traje,String experiencia, int nivel, int puntosHabilidad,List<Habilidad> habilidades) {
        super(nombre,traje, experiencia, nivel, puntosHabilidad, habilidades);
    }

    private List<Habilidad> getHabilidadesBase(){
        List<Habilidad> habilidadesBase = new ArrayList<>();
        habilidadesBase.add(new Habilidad("Ataque", "Ataque con espada"));
        habilidadesBase.add(new Habilidad("Defensa", "Defensa con escudo"));
        habilidadesBase.add(new Habilidad("Magica", "Poder de espada"));
        return habilidadesBase;
    }

    @Override
    public Heroe clonar() {
        return new Guerrero(
                this.getNombre(),
                this.getTraje(),
                this.getExperiencia(),
                this.getNivel(),
                this.getPuntosHabilidad(),
                new ArrayList<>(this.getHabilidades())
        );
    }

    public String stringy() {
        return "Guerrero "+this.getNombre()+" / "+this.getExperiencia()+" / "+this.getNivel()+" / "+this.getPuntosHabilidad()+" / ";
    }
}
