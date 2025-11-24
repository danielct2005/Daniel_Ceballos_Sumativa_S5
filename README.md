Proyecto SalmonttApp - Semana 5

Este proyecto es una aplicación de consola en Java diseñada para gestionar la información de los centros de cultivo de la empresa Salmontt. Permite cargar datos masivos desde archivos externos y realizar consultas.

Estructura del Proyecto

El código está organizado modularmente siguiendo el patrón MVC básico y buenas prácticas:

cl.salmontt.model: Contiene las clases que representan los objetos del dominio.

Trabajador: Datos del personal.

CentroCultivo: Datos de las instalaciones (Implementa composición con Trabajador).

cl.salmontt.service: Contiene la lógica de negocio y manipulación de datos.

SalmonttService: Actúa como librería de gestión, almacenando la lista en memoria (ArrayList) y proveyendo métodos de búsqueda.

cl.salmontt.util: Herramientas técnicas.

ArchivoUtil: Se encarga exclusivamente de leer el archivo .csv o .txt usando BufferedReader.

cl.salmontt.app: Punto de entrada.

Main: Menú interactivo por consola.

Requerimientos

Java JDK 8 o superior.

Archivo datos_salmontt.csv en la raíz del proyecto.

Instrucciones de Ejecución

Compilar: Asegúrese de que todas las clases estén compiladas.

Datos: Verifique que el archivo datos_salmontt.csv existe.

Ejecutar: Corra la clase cl.salmontt.app.Main.

Uso:

Seleccione la opción 1 para cargar los datos del archivo a la memoria (ArrayList).

Seleccione la opción 2 para ver todos los datos cargados.

Seleccione la opción 3 para filtrar por nombre.

Autor

https://github.com/danielct2005
