package clonacionDePersonajes;

public class Main {
    public static void main(String[] args) {
        /*Juego*/

        /*Creación de guerrero*/
        Heroe guerrero1 = new Guerrero("Hercules","Armadura");
        guerrero1.setPuntosHabilidad(5);
        guerrero1.setExperiencia("55 exp");
        guerrero1.setPuntosHabilidad(23);
        guerrero1.agregarHabilidad(new Habilidad("Ataque","Puño"));
        /*1. Clonación de guerrero1*/
        Heroe guerrero2 = guerrero1.clonar();
        guerrero2.setNombre("Kratos");
        guerrero2.agregarHabilidad(new Habilidad("Defensa","Agacharse"));

        /*Creación de arqueros*/
        Heroe arquero1 = new Arquero("Juan","Toga");
        arquero1.setPuntosHabilidad(7);
        arquero1.setExperiencia("85 exp");
        arquero1.setPuntosHabilidad(12);
        /*1. Clonación de arquero1*/
        Heroe arquero2 = arquero1.clonar();
        arquero2.setNombre("Pedro");
        arquero2.setTraje("Camisa");

        /*Imprimir heroes*/
        System.out.println("---GUERREROS---");
        System.out.println(guerrero1);
        System.out.println();
        System.out.println(guerrero2);

        System.out.println("\n---ARQUEROS---");
        System.out.println(arquero1);
        System.out.println();
        System.out.println(arquero2);
    }
}
