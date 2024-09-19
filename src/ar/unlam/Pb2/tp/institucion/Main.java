package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jardin jardin = new Jardin();
        Primaria primaria = new Primaria();
        Secundaria secundaria = new Secundaria();
        Escuela escuela = new Escuela("unlam");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        
       
        System.out.println("Ingresar Fecha");
        System.out.println("Fecha (dd/MM/yyyy):");
        String fechaInput = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(fechaInput, formatter);
        System.out.println("Fecha ingresada: " + fecha);

        boolean salir = false;
        String nombreEscuela = "";

        while (!salir) {
            System.out.println("----- Menú de la Escuela -----");            
            System.out.println("1. Ingresar el nombre de la escuela");
            System.out.println("2. Agregar Docente");
            System.out.println("3. Agregar Alumno");
            System.out.println("4. Ver agregado");
            System.out.println("5. Ir a cursos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcionEscuela = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcionEscuela) {
                case 1:
                    System.out.print("Ingrese el nombre de la escuela: ");
                    nombreEscuela = scanner.nextLine();
                    System.out.println("Nombre de la escuela ingresado: " + nombreEscuela);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del docente: ");
                    String nombreDocente = scanner.nextLine();
                    Docente docente = new Docente(nombreDocente);
                    escuela.agregarDocente(docente);
                    System.out.println("Docente agregado: " + nombreDocente);
                    break;

                case 3:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese la edad del alumno:");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    Alumno alumno = new Alumno(edad, nombre);
                    System.out.println("¿Estuvo presente en el día de hoy? (si o no):");
                    String respuesta = scanner.nextLine();
                    boolean presente = respuesta.equalsIgnoreCase("si");
                    alumno.registrarAsistencia(fecha, presente);
                    if (alumno.asistio(fecha)) {
                        System.out.println("El alumno " + nombre + " estuvo presente el " + fecha + ".");
                    } else {
                        System.out.println("El alumno " + nombre + " no estuvo presente el " + fecha + ".");
                    }
                    escuela.agregarAlumno(alumno);
                    System.out.println("Alumno agregado: " + nombre);
                    break;

                case 4:
                    escuela.verTodo();
                    break;

                case 5:
                    System.out.println("Cambiando a menú de cursos...");
                    // Aquí podrías incluir la lógica para mostrar el menú de cursos
                    break;

                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        
            
            boolean continuar = true;
            while(continuar) {
            System.out.println("1 para jardin");
            System.out.println("2 para primaria");
            System.out.println("3 para secundaria");
            System.out.println("0 para salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    boolean enMenuJardin = true;
                    while (enMenuJardin) {
                        System.out.println("Usted eligió Jardín");
                        System.out.println("Elija qué quiere hacer:");
                        System.out.println("1. Agregar un Alumno");
                        System.out.println("2. Agregar un docente a una sala");
                        System.out.println("3. Ver las salas");
                        System.out.println("0. Volver al menú principal");

                        int opcionJardin = scanner.nextInt();
                        switch (opcionJardin) {
                            case 1:
                                System.out.println("Ingrese la edad del alumno:");
                                Integer edad = scanner.nextInt();
                                System.out.println("Ingrese el nombre del alumno:");
                                String nombre = scanner.next();
                                Alumno alumno = new Alumno(edad, nombre);
                                jardin.agregarAlumnoASala(alumno);
                                break;
                            case 2:
                                System.out.println("Ingrese el nombre del Docente:");
                                String nombreDocente = scanner.next();

                                System.out.println("Ingrese la sala (CELESTE, VERDE, AZUL, ROJA):");
                                String colorSala = scanner.next().toUpperCase();
                                System.out.println("¿El docente es maestra jardinera? (Si o No)");
                                String respuesta = scanner.next();
                                Boolean maestra = respuesta.equalsIgnoreCase("Si");
                                DocenteJardin docente = new DocenteJardin(nombreDocente, Sala.valueOf(colorSala));
                                docente.setMaestra(maestra);
                                jardin.agregarDocenteASala(docente, colorSala, maestra);

                                System.out.println("Docente agregado con éxito a la sala " + colorSala);
                                break;
                            case 3:
                                jardin.verSalas();
                                break;
                            case 0:
                                enMenuJardin = false;
                                break;
                            default:
                                System.out.println("Opción no válida, intente de nuevo.");
                        }
                    }
                    break; 

                case 2:
                	 boolean enMenuPrimaria = true;
                     while (enMenuPrimaria) {
                         System.out.println("Usted eligió primaria");
                         System.out.println("Elija qué quiere hacer:");
                         System.out.println("1. Agregar un docente a un grado");
                         System.out.println("2. Agregar un alumno a un grado(El alumno tiene que estar evaluado para poder agregar a un grado que no sea el primero)");
                         System.out.println("3. Evaluación de docente a un alumno");
                         System.out.println("4. Ver los grados");
                         System.out.println("0. Volver al menú principal");

                         int opcionPrimaria = scanner.nextInt();

                         switch (opcionPrimaria) {
                             case 1:
                                 System.out.println("Ingrese el nombre del Docente:");
                                 String nombreDocente = scanner.next();
                                 System.out.println("Ingrese el grado (1, 2, 3, 4, 5 o 6):");
                                 int grado = scanner.nextInt();
                                 System.out.println("¿El docente es Competente para el grado? (Si o No)");
                                 String respuesta = scanner.next();
                                 boolean competente = respuesta.equalsIgnoreCase("Si");
                                 DocentePrimaria docente = new DocentePrimaria(nombreDocente, grado);
                                 docente.setCompetente(competente);
                                 primaria.agregarDocenteAGrado(docente, grado, competente);
                                 System.out.println("Docente agregado con éxito al grado " + grado);
                                 break;

                             case 2:
                                 System.out.println("Ingrese la edad del alumno:");
                                 int edad = scanner.nextInt();
                                 System.out.println("Ingrese el grado (1, 2, 3, 4, 5 o 6):");
                                 int indiceNuevo = scanner.nextInt() - 1;
                                 Grado gradoNuevo = primaria.obtenerGradoPorIndice(indiceNuevo);
                                 if (gradoNuevo != null) {
                                     System.out.println("Ingrese el nombre del alumno:");
                                     String nombre = scanner.next();
                                     Alumno alumnoExistente = gradoNuevo.buscarAlumnoPorNombre(nombre);
                                     if (alumnoExistente == null) {
                                         Alumno nuevoAlumno = new Alumno(edad, nombre);
                                         primaria.agregarAlumnoAGrado(nuevoAlumno);
                                     } else {
                                         System.out.println("El alumno ya existe en este grado.");
                                     }
                                 }
                                 break;

                             case 3:
                                 System.out.println("Ingrese el grado para evaluación (1, 2, 3, 4, 5 o 6):");
                                 int indice = scanner.nextInt() - 1;
                                 Grado grados = primaria.obtenerGradoPorIndice(indice);
                                 if (grados != null) {
                                     System.out.println("Ingrese el nombre del alumno:");
                                     String nombreAlumno = scanner.next();
                                     Alumno alumno = escuela.buscarAlumnoPorNombre(nombreAlumno);
                                     if (alumno != null) {
                                         System.out.println("Ingrese la evaluación del alumno (aprobado o desaprobado):");
                                         String evaluacion = scanner.next();
                                         boolean aprobado = evaluacion.equalsIgnoreCase("aprobado");
                                         alumno.setAprobado(aprobado);
                                         System.out.println("Resultado de evaluación: " + (aprobado ? "Aprobado" : "No aprobado"));
                                     } else {
                                         System.out.println("El alumno no fue encontrado en este grado.");
                                     }
                                 }
                                 break;

                             case 4:
                                 primaria.verGrados();
                                 break;

                            case 0:
                                enMenuPrimaria = false;
                                break;

                            default:
                                System.out.println("Opción no válida, intente de nuevo.");
                        }
                    }
                    break;

               case 3:
                    boolean enMenuSecundaria = true;
                    while (enMenuSecundaria) {
                        System.out.println("Usted eligió Secundaria");
                        System.out.println("Elija qué quiere hacer:");
                        System.out.println("1. Agregar un Alumno");
                        System.out.println("2. Agregar un docente a una materia");
                        System.out.println("3. Evaluacion de un docnente a un alumno");
                        System.out.println("4. Ver las anios");
                        System.out.println("0. Volver al menú principal");

                        int opcionSecundaria = scanner.nextInt();

                        switch (opcionSecundaria) {
                            case 1:
                                System.out.println("Ingrese la edad del alumno:");
                                Integer edad = scanner.nextInt();
                                System.out.println("Ingrese el nombre del alumno:");
                                String nombre = scanner.next();
                                System.out.println("Ingrese el anio que quiera inscribirse(1 al 6 anio)");
                                int indice = scanner.nextInt()-1;
                                Anio anio = secundaria.obtenerAnioPorIndice(indice);
                                Alumno alumnoExistente = anio.buscarAlumnoPorNombre(nombre);
                                if (alumnoExistente == null) {
                                    Alumno nuevoAlumno = new Alumno(edad, nombre);
                                    secundaria.agregarAlumnoAAnio(nuevoAlumno);
                                } else {
                                Alumno alumno = new Alumno(edad, nombre);
                                secundaria.agregarAlumnoAAnio(alumno);
                                System.out.println("Alumno agregado con éxito.");
                                }
                                break;
                                
                            case 2:
                                System.out.println("Ingrese el nombre del Docente:");
                                String nombreDocente = scanner.next();
                                System.out.println("Ingrese la materia:");
                                String materia = scanner.next();
                                System.out.println("¿El docente es Competente para la materia? (Si o No)");
                                String respuesta = scanner.next();
                                Boolean competente = respuesta.equalsIgnoreCase("Si");
                                DocenteSecundario docente = new DocenteSecundario(nombreDocente, materia);
                                docente.setCompetente(competente);
                                secundaria.agregarDocenteAMateria(docente, materia);
                                System.out.println("Docente agregado con éxito a la materia " + materia);
                                break;
                                
                            case 3:
                                System.out.println("Ingrese el anio para evaluación (1, 2, 3, 4, 5 o 6):");
                                indice = scanner.nextInt() - 1;
                                Anio anios = secundaria.obtenerAnioPorIndice(indice);
                                if (anios != null) {
                                    System.out.println("Ingrese el nombre del alumno:");
                                    String nombreAlumno = scanner.next();
                                    Alumno alumno = escuela.buscarAlumnoPorNombre(nombreAlumno);
                                    if (alumno != null) {
                                        System.out.println("Ingrese la evaluación del alumno (aprobado o desaprobado):");
                                        String evaluacion = scanner.next();
                                        boolean aprobado = evaluacion.equalsIgnoreCase("aprobado");
                                        alumno.setAprobado(aprobado);
                                        System.out.println("Resultado de evaluación: " + (aprobado ? "Aprobado" : "No aprobado"));
                                    } else {
                                        System.out.println("El alumno no fue encontrado en este grado.");
                                    }
                                }
                                break;

                               
                            case 4:
                                secundaria.verAnios();
                                break;

                            case 0:
                                enMenuSecundaria = false;
                            break;

                            default:
                                System.out.println("Opción no válida, intente de nuevo.");
                        }
                    }
                    break;

                case 0:
                    salir = false;
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }
        }*/
    }
      