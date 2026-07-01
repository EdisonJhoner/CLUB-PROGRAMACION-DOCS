public class ConfiguracionClub {

    private static ConfiguracionClub instancia;

    private String nombreClub;
    private String correoClub;
    private int maximoMiembros;

    private ConfiguracionClub() {
        nombreClub = "Club de Programación";
        correoClub = "club@institucion.edu";
        maximoMiembros = 100;
    }

    public static synchronized ConfiguracionClub getInstance() {
        if (instancia == null) {
            instancia = new ConfiguracionClub();
        }
        return instancia;
    }

    public String getNombreClub() {
        return nombreClub;
    }

    public String getCorreoClub() {
        return correoClub;
    }

    public int getMaximoMiembros() {
        return maximoMiembros;
    }
}