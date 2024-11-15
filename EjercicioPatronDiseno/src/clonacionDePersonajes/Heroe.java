package clonacionDePersonajes;

import java.util.ArrayList;
import java.util.List;

public abstract class Heroe {
    private String nombre;
    private List<Habilidad> habilidades;
    private String traje;

    private String experiencia;
    private int nivel;
    private int puntosHabilidad;

    public Heroe(String nombre, String traje) {
        this.nombre = nombre;
        this.traje = traje;
        this.habilidades = new ArrayList<>();
    }

    public Heroe(String nombre, String traje, String experiencia, int nivel, int puntosHabilidad, List<Habilidad> habilidades) {
        this.nombre = nombre;
        this.traje = traje;
        this.experiencia = experiencia;
        this.nivel = nivel;
        this.puntosHabilidad = puntosHabilidad;
        this.habilidades = habilidades;
    }

    /*Metodo abstracto para clonación*/
    public abstract Heroe clonar();

    public String getTraje() {
        return traje;
    }

    public void setTraje(String traje) {
        this.traje = traje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidad> habilidades) {
        this.habilidades = habilidades;
    }

    public void agregarHabilidad(Habilidad habilidad) {
        this.habilidades.add(habilidad);
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getPuntosHabilidad() {
        return puntosHabilidad;
    }

    public void setPuntosHabilidad(int puntosHabilidad) {
        this.puntosHabilidad = puntosHabilidad;
    }

    @Override
    public String toString() {
        return "Heroe{" +
                "nombre='" + nombre + '\'' +
                ", habilidades=" + habilidades +
                ", traje='" + traje + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", nivel=" + nivel +
                ", puntosHabilidad=" + puntosHabilidad +
                '}';
    }
}
