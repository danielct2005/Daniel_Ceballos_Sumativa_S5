package cl.salmontt.model;

/**
 * Clase que representa un Centro de Cultivo.
 * Implementa COMPOSICIÓN: Un centro "tiene un" Trabajador encargado.
 */
public class CentroCultivo {
    private String idCentro;
    private String nombreCentro;
    private String ubicacion;
    private int capacidadToneladas;
    private Trabajador encargado; // Composición/Agregación

    public CentroCultivo(String idCentro, String nombreCentro, String ubicacion, int capacidadToneladas, Trabajador encargado) {
        this.idCentro = idCentro;
        this.nombreCentro = nombreCentro;
        this.ubicacion = ubicacion;
        this.capacidadToneladas = capacidadToneladas;
        this.encargado = encargado;
    }

    // Getters y Setters
    public String getIdCentro() { return idCentro; }
    public void setIdCentro(String idCentro) { this.idCentro = idCentro; }

    public String getNombreCentro() { return nombreCentro; }
    public void setNombreCentro(String nombreCentro) { this.nombreCentro = nombreCentro; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public int getCapacidadToneladas() { return capacidadToneladas; }
    public void setCapacidadToneladas(int capacidadToneladas) { this.capacidadToneladas = capacidadToneladas; }

    public Trabajador getEncargado() { return encargado; }
    public void setEncargado(Trabajador encargado) { this.encargado = encargado; }

    @Override
    public String toString() {
        return "Centro: " + nombreCentro + " (" + idCentro + ") | Ubicación: " + ubicacion +
                " | Capacidad: " + capacidadToneladas + "t | Encargado: " + encargado.getNombre();
    }
}