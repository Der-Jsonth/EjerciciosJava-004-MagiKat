public class GatoGuerrero extends GatoMagico {

    private int bonusEspada;

    public GatoGuerrero(String nombre, int poderBase, int bonusEspada) {
        super(nombre, poderBase);
        this.bonusEspada = bonusEspada;
    }

    public GatoGuerrero() {
    }

    public GatoGuerrero(int bonusEspada) {
        this.bonusEspada = bonusEspada;
    }

    public int getBonusEspada() {
        return bonusEspada;
    }

    public void setBonusEspada(int bonusEspada) {
        this.bonusEspada = bonusEspada;
    }

    @Override
    public int calcularPoderFinal() {
        return getPoderBase() + bonusEspada;
    }
}
