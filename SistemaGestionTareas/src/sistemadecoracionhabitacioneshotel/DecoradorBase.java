package sistemadecoracionhabitacioneshotel;

public abstract class DecoradorBase implements Decorador {

    private Decorador wrapper;

    public DecoradorBase(Decorador wrapper) {
        this.wrapper = wrapper;
    }

    @Override
    public String decorar() {
        return wrapper.decorar();
    }
}
