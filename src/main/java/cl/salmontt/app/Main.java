package cl.salmontt.app;

import cl.salmontt.service.SalmonttService;
import java.util.Scanner;

/**
 * Clase principal de ejecución.
 * Interactúa con el usuario y delega tareas al Service.
 */
public class Main {

    public static void main(String[] args) {
        SalmonttService sistema = new SalmonttService();
        Scanner scanner = new Scanner(System.in);

        String rutaArchivo = "datos_salmontt.csv";

        int opcion = 0;

        do {
            System.out.println("\n========================================");
            System.out.println("      SISTEMA DE GESTIÓN SALMONTT       ");
            System.out.println("========================================");
            System.out.println("1. Cargar datos desde archivo");
            System.out.println("2. Listar todos los centros");
            System.out.println("3. Buscar centro por nombre");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                String input = scanner.nextLine();
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case 1:
                        System.out.println("Cargando datos...");
                        sistema.cargarDatosDesdeArchivo(rutaArchivo);
                        break;
                    case 2:
                        sistema.listarTodos();
                        break;
                    case 3:
                        System.out.print("Ingrese el nombre del centro a buscar: ");
                        String busqueda = scanner.nextLine();
                        sistema.buscarPorNombre(busqueda);
                        break;
                    case 4:
                        System.out.println("Cerrando sistema. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}