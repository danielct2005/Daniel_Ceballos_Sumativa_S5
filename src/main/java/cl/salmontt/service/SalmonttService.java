package cl.salmontt.service;

import cl.salmontt.model.CentroCultivo;
import cl.salmontt.model.Trabajador;
import cl.salmontt.util.ArchivoUtil;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase actúa como la "Librería Personalizada".
 * Centraliza el manejo de la colección de datos y la lógica de negocio.
 */
public class SalmonttService {

    // Colección principal para almacenar objetos en memoria
    private List<CentroCultivo> listaCentros;

    public SalmonttService() {
        this.listaCentros = new ArrayList<>();
    }

    /**
     * Carga datos desde un archivo CSV transformándolos en objetos.
     * Formato esperado CSV: ID_Centro,Nombre_Centro,Ubicacion,Capacidad,Rut_Encargado,Nombre_Encargado,Cargo
     */
    public void cargarDatosDesdeArchivo(String ruta) {
        List<String> lineas = ArchivoUtil.leerArchivo(ruta);
        int cargados = 0;

        for (String linea : lineas) {
            try {
                String[] datos = linea.split(",");

                // Validar que la línea tenga los datos mínimos
                if (datos.length >= 7) {
                    // 1. Crear el Trabajador (Composición)
                    Trabajador encargado = new Trabajador(datos[4].trim(), datos[5].trim(), datos[6].trim());

                    // 2. Crear el Centro de Cultivo inyectando el Trabajador
                    int capacidad = Integer.parseInt(datos[3].trim()); // Puede lanzar NumberFormatException
                    CentroCultivo centro = new CentroCultivo(
                            datos[0].trim(),
                            datos[1].trim(),
                            datos[2].trim(),
                            capacidad,
                            encargado
                    );

                    listaCentros.add(centro);
                    cargados++;
                }
            } catch (Exception e) {
                System.out.println("Error procesando línea: " + linea + " -> " + e.getMessage());
            }
        }
        System.out.println(">>> Carga finalizada. Registros válidos: " + cargados);
    }

    public void listarTodos() {
        if (listaCentros.isEmpty()) {
            System.out.println("No hay registros en el sistema.");
        } else {
            System.out.println("\n--- LISTADO DE CENTROS SALMONTT ---");
            for (CentroCultivo c : listaCentros) {
                System.out.println(c.toString());
            }
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado = false;
        System.out.println("\n--- RESULTADOS DE BÚSQUEDA: " + nombre + " ---");
        for (CentroCultivo c : listaCentros) {
            // Búsqueda insensible a mayúsculas/minúsculas
            if (c.getNombreCentro().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(c.toString());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron centros con ese nombre.");
        }
    }
}