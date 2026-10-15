public class GatoHechizero extends GatoMagico {

    private boolean hechizoActivo;

    public boolean isHechizoActivo() {
        return hechizoActivo;
    }

    public void setHechizoActivo(boolean hechizoActivo) {
        this.hechizoActivo = hechizoActivo;
    }

    public GatoHechizero(String nombre, int poderBase, boolean hechizoActivo) {
        super(nombre, poderBase);
        this.hechizoActivo = hechizoActivo;
    }

    public GatoHechizero(String nombre, int poderBase) {
        super(nombre, poderBase);
    }

    public GatoHechizero() {
    }

    @Override
    public int calcularPoderFinal() {
        if (hechizoActivo) {
            return getPoderBase() * 2;
        }

        return getPoderBase();
    }
}
