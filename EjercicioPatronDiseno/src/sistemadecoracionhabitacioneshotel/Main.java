package sistemadecoracionhabitacioneshotel;

import java.util.Scanner;

public class Main {

    private static final String SALIR = "5";

    private static final String NO_DECORACION = "1";

    public static void main(String[] args) {

        var opcionSeleccionada = preguntarDecoracion();

        Decorador decoracionSeleccionada = new DecoracionHabitacionBasica();

        while (!SALIR.equals(opcionSeleccionada)) {
            decoracionSeleccionada = switch (opcionSeleccionada) {
                case "1" -> decoracionSeleccionada;
                case "2" -> new DecoracionFlores(decoracionSeleccionada);
                case "3" -> new DecoracionVinoEspecial(decoracionSeleccionada);
                case "4" -> new DecoracionChocolateGourmet(decoracionSeleccionada);
                default -> throw new IllegalStateException("Opcion no valida");
            };
            System.out.println("La decoracion de tu habitacion es: ".concat(decoracionSeleccionada.decorar()));
            if (NO_DECORACION.equals(opcionSeleccionada)) {
                break;
            }
            opcionSeleccionada = preguntarNuevamenteDecoracion();
        }
        System.out.println("Que disfrutes tu habitacion");
    }

    private static String preguntarDecoracion() {
        System.out.println("""
                Bienvenido al sistema de decoracion de habitaciones en nuestro hotel de lujo
                Las habitaciones vienen con una decoracion basica pero puedes agregar adicionales
                Selecciona una opcion (Solo el numero)
                1. No quiero adicionar nada
                2. Agregar flores
                3. Agregar vino especial
                4. Agregar chocolate gourmet
                5. Salir
                """);
        final var ingresoOpcionUsuario = new Scanner(System.in);
        return ingresoOpcionUsuario.nextLine();
    }

    private static String preguntarNuevamenteDecoracion() {
        System.out.println("""
                Deseas agregar algo mas?
                1. No quiero adicionar nada
                2. Agregar flores
                3. Agregar vino especial
                4. Agregar chocolate gourmet
                5. Salir
                """);
        final var ingresoOpcionUsuario = new Scanner(System.in);
        return ingresoOpcionUsuario.nextLine();
    }
}
