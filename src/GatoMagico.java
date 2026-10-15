public abstract class GatoMagico {

    private String nombre;
    private int poderBase;

    public GatoMagico(String nombre, int poderBase) {
        this.nombre = nombre;
        setPoderBase(poderBase);
    }

    public GatoMagico() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoderBase() {
        return poderBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Única validación del ejercicio
    public void setPoderBase(int poderBase) {
        if (poderBase <= 0) {
            throw new IllegalArgumentException(
                    "El poder base debe ser mayor que cero"
            );
        }
        this.poderBase = poderBase;
    }

    public abstract int calcularPoderFinal();
}
