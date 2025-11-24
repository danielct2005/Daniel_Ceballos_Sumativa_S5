package cl.salmontt.model;

/**
 * Clase que representa a un trabajador de la empresa.
 * Cumple con encapsulamiento y validaciones básicas.
 */
public class Trabajador {
    private String rut;
    private String nombre;
    private String cargo;

    public Trabajador(String rut, String nombre, String cargo) {
        // Validación básica en el constructor
        if(rut == null || rut.isEmpty()) {
            throw new IllegalArgumentException("El RUT no puede estar vacío");
        }
        this.rut = rut;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    // Getters y Setters
    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    @Override
    public String toString() {
        return "Trabajador [RUT=" + rut + ", Nombre=" + nombre + ", Cargo=" + cargo + "]";
    }
}