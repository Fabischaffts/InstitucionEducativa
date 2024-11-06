package ar.unlam.Pb2.tp.institucion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Secundaria extends Institucion {

	// private Anio[] anios;
	private Materia[] materias;
	private Set<Anio> anios;
	private List<Alumno> alumnos;

	public Secundaria(String nombre) {
		super(nombre);
		this.anios = new HashSet<>();
		materias = new Materia[1];
		this.alumnos = new ArrayList<>();
//	        anios = new Anio[6];
//	        anios[0] = new Anio("Primer anio", 12,1,3);
//	        anios[1] = new Anio("Segundo anio", 13,1,3);
//	        anios[2] = new Anio("Tercer anio", 14, 1,3);
//	        anios[3] = new Anio("Cuarto anio", 15, 1,3);
//	        anios[4] = new Anio("Quinto anio", 16, 1,3);
//	        anios[5] = new Anio("Sexto anio", 17, 1,3);
	}

	@Override
	public Boolean agregarAlumno(Alumno alumno) {
		int edad = alumno.getEdad();
		if (edad >= 12 && edad <= 18) {
			alumnos.add(alumno);
			return super.agregarAlumno(alumno);
		}
		return false;
	}

	public Boolean agregarAlumnoAAnio(Alumno alumno, Anio anio) {
		for (Alumno alumnoEnSecunadaria : alumnos) {
			if (alumnoEnSecunadaria.equals(alumno))
				;
			if (alumno.isAprobado() == true && alumno.getEdad() >= anio.getEdadMinima())
				;
			return anio.agregarAlumno(alumno);
		}
		return false;
	}

//	public boolean agregarAlumnoAAnio(Alumno alumno) {
//		int edad = alumno.getEdad();
//        if (edad >= 12 && edad <= 18) {
//            anio = anios[edad - 12];
//
//            if (edad > 6 && !alumno.isAprobado()) {
//                System.out.println("El alumno " + alumno.getNombre() + " no aprobó el anio anterior y no puede inscribirse en " + anio.getNombre());
//                return false;
//            }
//        } else {
//            System.out.println("Edad no válida para primaria.");
//            return false;
//        }
//
//        if (anio.agregarAlumno(alumno)) {
//            System.out.println("El alumno " + alumno.getNombre() + " ha sido asignado al " + anio.getNombre());
//            return true;
//        }
//
//        return false;
//    }

	public void agregarDocenteAMateria(DocenteSecundario docente, String nombreMateria) {
		// Buscar la materia por nombre en el array
		for (Materia materia : materias) {
			if (materia != null && materia.getNombre().equalsIgnoreCase(nombreMateria)) {
				materia.setDocente(docente);
				System.out.println("Docente agregado a la materia " + nombreMateria);
				return;
			}
		}
		System.out.println("Materia no encontrada: " + nombreMateria);
	}

//	public Anio obtenerAnioPorIndice(int indice) {
//		 if (indice >= 0 && indice < anios.length) {
//	            return anios[indice];
//	        } else {
//	            System.out.println("Índice de grado inválido.");
//	            return null;
//	        }
//	    
//	}
	public void verAnios() {
		for (Anio anio : anios) {
			if (anio != null) {
				System.out.println("Anio: " + anio.getNombre());

				System.out.println("Alumnos:");
				List<Alumno> alumnos = anio.getAlumnos();
				for (Alumno alumno : alumnos) {
					if (alumno != null) {
						System.out.println(" - " + alumno.getNombre());
					}
				}

				System.out.println("Docentes:");
				List<Docente> docentes = anio.getDocentes();
				for (Docente docente : docentes) {
					if (docente != null) {
						System.out.println(" - " + docente.getNombre());
					}
				}
			}
		}

	}

}
