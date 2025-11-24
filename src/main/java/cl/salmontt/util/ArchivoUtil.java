package cl.salmontt.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase utilitaria para manejar lectura de archivos.
 * Separa la lógica técnica (I/O) de la lógica de negocio.
 */
public class ArchivoUtil {

    /**
     * Lee un archivo CSV y retorna una lista de líneas (Strings).
     * Usa try-catch para manejo de excepciones.
     */
    public static List<String> leerArchivo(String rutaArchivo) {
        List<String> lineas = new ArrayList<>();

        // Try-with-resources asegura que el archivo se cierre automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error crítico leyendo el archivo: " + e.getMessage());
        }

        return lineas;
    }
}