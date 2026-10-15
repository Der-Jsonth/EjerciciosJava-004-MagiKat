public class Main {
    public static void main(String[] args) {

        // Crear registro
        RegistroGatos registro = new RegistroGatos();

        // Crear gatos
        GatoGuerrero gato1 = new GatoGuerrero("Charlie", 50, 15);
        GatoHechizero gato2 = new GatoHechizero("Baldomero", 40, true);
        GatoHechizero gato3 = new GatoHechizero("Merlin", 30, false);

        // Registrar gatos
        registro.agregarGato(gato1);
        registro.agregarGato(gato2);
        registro.agregarGato(gato3);

        // Mostrar información
        System.out.println("===== REINO DE LOS GATOS MAGICOS =====");

        registro.mostrarGatos();
    }
}

