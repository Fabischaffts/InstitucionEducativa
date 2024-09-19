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
	@Test
	public void queSePuedanAgregarAlumnosALaEscuela() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, edad, nombreDelAlumno);
		
		Boolean alumnoEsperado = escuela.agregarAlumno(alumno);
		Integer dniEsperado = alumno.getDni();
		
		assertEquals(alumno.getDni(),dniEsperado);
		assertTrue(alumnoEsperado);		
		}
	@Test
	public void queSePuedanAgregarDocentesALaEscuela() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, especialidad);
		
		Boolean docenteEsperado = escuela.agregarDocente(docente);
		Integer dniEsperado = docente.getDni();
		
		
		assertEquals(docente.getDni(),dniEsperado);
		assertTrue(docenteEsperado);		
		}

}