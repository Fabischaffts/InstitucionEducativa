package ar.unlam.Pb2.tp.institucion;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaUnitario {

	@Test
	public void queSePuedaCrearUnaEscuelatest() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		
		String nombre = escuela.getNombre();
		
		assertNotNull(escuela);
		assertEquals(nombre, nombreDeEscuela);
	}
	
	public void queSePuedanAgregarAlumnosALaEscuela() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad);
		
		Boolean alumnoEsperado = escuela.agregarAlumno(alumno);
		Integer dniEsperado = alumno.getDni();
		
		assertEquals(alumno.getDni(),dniEsperado);
		assertTrue(alumnoEsperado);		
		}
	
	public void queSePuedanAgregarDocentesALaEscuela() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		
		Boolean docenteEsperado = escuela.agregarDocente(docente);
		Integer dniEsperado = docente.getDni();
		
		
		assertEquals(docente.getDni(),dniEsperado);
		assertTrue(docenteEsperado);		
		}
	
	public void queSePuedanAgregarUnaSalaAlJardin() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		
		Boolean docenteEsperado = escuela.agregarDocente(docente);
		Integer dniEsperado = docente.getDni();
		
		
		assertEquals(docente.getDni(),dniEsperado);
		assertTrue(docenteEsperado);		
		}

}
