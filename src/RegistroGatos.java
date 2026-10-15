import java.util.ArrayList;

public class RegistroGatos {

    private ArrayList<GatoMagico> gatos;

    // Constructor
    public RegistroGatos() {
        gatos = new ArrayList<>();
    }

    // Registrar un gato
    public void agregarGato(GatoMagico gato) {
        gatos.add(gato);
    }

    // Mostrar todos los gatos
    public void mostrarGatos() {

        for (GatoMagico gato : gatos) {
            System.out.println("Nombre: " + gato.getNombre());
            System.out.println("Poder base: " + gato.getPoderBase());
            System.out.println("Poder final: " + gato.calcularPoderFinal());
            System.out.println("--------------------");
        }
    }
}
