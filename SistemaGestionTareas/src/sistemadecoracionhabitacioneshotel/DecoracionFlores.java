package sistemadecoracionhabitacioneshotel;

public class DecoracionFlores extends DecoradorBase {

    public DecoracionFlores(Decorador wrapper) {
        super(wrapper);
    }

    @Override
    public String decorar() {
        return super.decorar().concat(" Con Flores");
    }
}
