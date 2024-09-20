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
		String apellido = "Schneiders";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad);
		
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
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		
		Boolean docenteEsperado = escuela.agregarDocente(docente);
		Integer dniEsperado = docente.getDni();
		
		
		assertEquals(docente.getDni(),dniEsperado);
		assertTrue(docenteEsperado);		
		}
	
	@Test
	public void queSePuedanObtenerLasSalasDiferentesAlJardin() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		String nombre = "Celeste";
		String nombre1 = "Verde";
		String nombre2= "Rojo";
		String nombre3= "Azul";
		String salaMaron = "Maron";
		Integer maxAlumnos = 10;
		Integer maxDocentes = 2;
		Jardin jardin = new Jardin(escuela);
		
		Sala sala = new Sala(nombre, maxAlumnos, maxDocentes);
		Sala salaEsperada = jardin.obtenerSalaPorColor(nombre);
		Sala salaEsperada1 = jardin.obtenerSalaPorColor(nombre1);
		Sala salaEsperada2 = jardin.obtenerSalaPorColor(nombre2);
		Sala salaEsperada3 = jardin.obtenerSalaPorColor(nombre3);
		Sala buscarSalaMaron = jardin.obtenerSalaPorColor(salaMaron);
		
		assertEquals(salaEsperada,sala);
		assertNotNull(salaEsperada);
		assertNotNull(salaEsperada1);
		assertNotNull(salaEsperada2);
		assertNotNull(salaEsperada3);
		assertNull(buscarSalaMaron);
		}
	
	@Test
	public void queSePuedanAgregarUnAlumnoALaSalaCorrecta() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 4;
		String nombreDeSala = "Azul";
		Integer maxAlumnos = 10;
		Integer maxDocentes = 2;

		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad);
		Jardin jardin = new Jardin(escuela);
		Sala sala = new Sala(nombreDeSala, maxAlumnos, maxDocentes);
		String colorDeSalaEsperada = sala.getNombre();
		String SalaEsperada = jardin.agregarAlumnoASala(alumno);
		
		assertTrue(escuela.agregarAlumno(alumno));
		assertNotNull(jardin.agregarAlumnoASala(alumno));
		assertEquals(SalaEsperada,colorDeSalaEsperada);
		
		//POR QUE NO EN EL METODO AGREGAR ALUMNO A SALA NO PUEDO USAR EL METODO CONTAINS PARA VER SI EL ALUMNO ESTA INSCRIPTO EN LA ESCUELA		
}
	@Test
	public void queSePuedanAgregarUnDocentALaSalaCorrecta() {
		
		String nombreDeEscuela = "Unlam";
		Escuela escuela = new Escuela(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		String nombreDeSala = "Azul";
		Integer maxAlumnos = 10;
		Integer maxDocentes = 2;

		Jardin jardin = new Jardin(escuela);
		Sala sala = new Sala(nombreDeSala, maxAlumnos, maxDocentes);
		String colorDeSalaEsperada = sala.getNombre();
	
	
}
}