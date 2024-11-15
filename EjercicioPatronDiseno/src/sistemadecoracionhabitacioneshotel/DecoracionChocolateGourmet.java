package sistemadecoracionhabitacioneshotel;

public class DecoracionChocolateGourmet extends DecoradorBase {
    public DecoracionChocolateGourmet(Decorador wrapper) {
        super(wrapper);
    }
    @Override
    public String decorar() {
        return super.decorar().concat(" Con Chocolate Gourmet");
    }
}
