package sistemadecoracionhabitacioneshotel;

public class DecoracionVinoEspecial extends DecoradorBase {

    public DecoracionVinoEspecial(Decorador wrapper) {
        super(wrapper);
    }

    @Override
    public String decorar() {
        return super.decorar().concat(" Con Vino Especial");
    }
}
