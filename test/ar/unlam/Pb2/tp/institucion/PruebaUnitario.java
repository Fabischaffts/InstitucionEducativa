package ar.unlam.Pb2.tp.institucion;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import org.junit.Test;

public class PruebaUnitario {

	@Test
	public void queSePuedaCrearUnaEscuelatest() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		
		String nombre = institucionEducativa.getNombre();
		
		assertNotNull(institucionEducativa);
		assertEquals(nombre, nombreDeEscuela);
	}
	@Test
	public void queSePuedanAgregarAlumnosALaEscuela() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		
		Boolean alumnoEsperado = institucionEducativa.agregarAlumno(alumno);
		Integer dniEsperado = alumno.getDni();
		
		assertEquals(alumno.getDni(),dniEsperado);
		assertTrue(alumnoEsperado);		
		}
	@Test
	public void queSePuedanAgregarDocentesALaEscuela() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		
		Boolean docenteEsperado = institucionEducativa.agregarDocente(docente);
		Integer dniEsperado = docente.getDni();
		
		
		assertEquals(docente.getDni(),dniEsperado);
		assertTrue(docenteEsperado);		
		}
	
	@Test
	public void queSePuedanObtenerLasSalasDiferentesAlJardin() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		String nombre = "Celeste";
		String nombre1 = "Verde";
		String nombre2= "Rojo";
		String nombre3= "Azul";
		String salaMaron = "Maron";
		Integer maxAlumnos = 10;
		Jardin jardin = new Jardin(institucionEducativa, nombreDeEscuela);
		
		Sala sala = new Sala(nombre, maxAlumnos);
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
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 4;
		String nombreDeSala = "Azul";
		Integer minAlumnos = 10;
		Integer maxDocentes = 2;

		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		Jardin jardin = new Jardin(institucionEducativa, nombreDeEscuela);
		Sala sala = new Sala(nombreDeSala, minAlumnos);
		String colorDeSalaDelAlumnoEsperada = sala.getNombre();
		String SalaEsperadaDelAlumno = jardin.agregarAlumnoASala(alumno);
		
		assertTrue(institucionEducativa.agregarAlumno(alumno));
		assertNotNull(jardin.agregarAlumnoASala(alumno));
		assertEquals(SalaEsperadaDelAlumno,colorDeSalaDelAlumnoEsperada);
		
}
	@Test
	public void queSePuedaAgregarUnDocentALaSalaCorrecta() throws CantidadMaximaDocentesException {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.JARDIN;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		String nombreDeSala = "Azul";
		Integer minAlumnos = 10;
		

		Jardin jardin = new Jardin(institucionEducativa, nombreDeEscuela);
		Sala sala = new Sala(nombreDeSala, minAlumnos);
		jardin.agregarDocenteASala(docente, nombreDeSala);
		ArrayList<Docente> docentebuscado = sala.getDocentes();
		assertTrue(institucionEducativa.agregarDocente(docente));;
		assertNotNull(sala.getDocentes());
	
}
	@Test
	public void queSeSiHayUnaSalaConMenosDe10AlumnosSePuedaMezclarLaSala() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 4;
		String nombreDeSala = "Azul";
		Integer minAlumnos = 10;


		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		Jardin jardin = new Jardin(institucionEducativa, nombreDeEscuela);
		Sala sala = new Sala(nombreDeSala, minAlumnos);
		Integer cantidadDeAlumnosEnLaSala = sala.obtenerCantidadDeAlumnos();
		Integer cantidadDeAlumnosEsperados = 0;
		institucionEducativa.agregarAlumno(alumno);
		jardin.agregarAlumnoASala(alumno);
		
		assertEquals(cantidadDeAlumnosEnLaSala,cantidadDeAlumnosEsperados);
}
	
	//Primaria
	@Test
	public void queSePuedaAgregarUnAlumnoALaPrimaria() {

		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 7;
		
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		alumno.setAprobado(false);
		Primaria primaria = new Primaria(nombreDeEscuela);
		Grado grado = new Grado("primer Grado", 8, 1);
		boolean agregarAlumnno = primaria.agregarAlumno(alumno);
		boolean agregarAlumnnoAGrado = primaria.inscribirAlumnoEnGrado(alumno,grado);
		assertTrue(institucionEducativa.agregarAlumno(alumno));
		assertTrue(agregarAlumnno);
		assertTrue(agregarAlumnnoAGrado);
		
}
	@Test
	public void queSePuedaAgregarUnDocentALGradoCorrecta() throws CantidadMaximaDocentesException {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.PRIMARIA;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		String nombreDeSala = "Azul";
		Integer minAlumnos = 10;
		

		Jardin jardin = new Jardin(institucionEducativa, nombreDeEscuela);
		Sala sala = new Sala(nombreDeSala, minAlumnos);
		jardin.agregarDocenteASala(docente, nombreDeSala);
		ArrayList<Docente> docentebuscado = sala.getDocentes();
		assertTrue(institucionEducativa.agregarDocente(docente));;
		assertNotNull(sala.getDocentes());
	
	}
	//Secundaria
	@Test
	public void queSePuedaAgregarUnAlumnoALaSecundaria() {

		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Leon";
		String apellido = "Schneiders";
		Integer edad = 15;
		Integer edadMinima = 12;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		alumno.setAprobado(true);
		Secundaria secundaria = new Secundaria(nombreDeEscuela);
		Anio anio = new Anio("primer anio", 8, 1, edadMinima);
		Boolean agregarAlumnno = secundaria.agregarAlumno(alumno);
		Boolean agregarAlumnnoAAnio = secundaria.agregarAlumnoAAnio(alumno,anio);
		assertTrue(institucionEducativa.agregarAlumno(alumno));
		assertTrue(agregarAlumnno);
		assertTrue(agregarAlumnnoAAnio);
		
}
	@Test
	public void queSePuedaAgregarUnDocentAlCursoCorrecto() throws CantidadMaximaDocentesException {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelDocente = "Leon";
		String apellido = "Schneiders";
		TipoDeEspecialidad especialidad = TipoDeEspecialidad.SECUNDARIA;

		Docente docente = new Docente(dni, nombreDelDocente, apellido, especialidad);
		String nombreDeSala = "Azul";
		Integer minAlumnos = 10;
		

		Jardin jardin = new Jardin(institucionEducativa, nombreDeEscuela);
		Sala sala = new Sala(nombreDeSala, minAlumnos);
		jardin.agregarDocenteASala(docente, nombreDeSala);
		ArrayList<Docente> docentebuscado = sala.getDocentes();
		assertTrue(institucionEducativa.agregarDocente(docente));;
		assertNotNull(sala.getDocentes());
		
	}
	@Test
	public void devolverUnaListaDeLosAlumnosInscriptoAlfabeticamente() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 5620300;
		String nombreDelAlumno = "Bauti";
		String apellido = "Schneiders";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad,true);
		Alumno alumno2 = new Alumno(dni,"Ale", apellido, edad, true);
		Alumno alumno3 = new Alumno(dni,"Cesar", apellido, edad, true);
		
		institucionEducativa.agregarAlumno(alumno);
		institucionEducativa.agregarAlumno(alumno2);
		institucionEducativa.agregarAlumno(alumno3);	
		
		List<Alumno> listaAlumnos = institucionEducativa.getAlumnos();
		int indice =0;
		for (Persona persona : listaAlumnos) {
		    if (persona instanceof Alumno) {
		        Alumno alumnos = (Alumno) persona; 
		switch (indice) {
		case 1:
			assertEquals(alumno2, alumnos);
			break;
		case 2:
			assertEquals(alumno, alumnos);
			break;
		case 3:
			assertEquals(alumno3, alumnos);
			break;
		}
		indice ++;
		}	
	}
	}
	@Test
	public void devolverUnaListaDeLosAlumnosInscriptoAlCursoPorDni() {
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 1;
		String nombreDelAlumno = "Bauti";
		String apellido = "Schneiders";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		Alumno alumno2 = new Alumno(2,"Ale", apellido, edad, true);
		Alumno alumno3 = new Alumno(3,"Cesar", apellido, edad, true);
		
		institucionEducativa.agregarAlumno(alumno);
		institucionEducativa.agregarAlumno(alumno2);
		institucionEducativa.agregarAlumno(alumno3);	
		
		List<Alumno> listaAlumnos = institucionEducativa.getAlumnos();
		int indice =0;
		for (Persona persona : listaAlumnos) {
		    if (persona instanceof Alumno) {
		        Alumno alumnos = (Alumno) persona; 
		switch (indice) {
		case 1:
			assertEquals(alumno2, alumnos);
			break;
		case 2:
			assertEquals(alumno3, alumnos);
			break;
		case 3:
			assertEquals(alumno, alumnos);
			break;
		}
		indice ++;
		}	
	}
	}
	@Test(expected = AlumnoNoEncontradoException.class )
	public void buscarUnAlumnoEnUnaSala() throws AlumnoNoEncontradoException {
		
		
		Sala sala =new Sala("celeste", 20);
		Integer dni = 1;
		String nombreDelAlumno = "Bauti";
		String apellido = "Schneiders";
		Integer edad = 4;
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		sala.agregarAlumno(alumno);
		assertEquals(sala.getAlumnos().size(),1);
		assertEquals(sala.buscarAlumno(dni),alumno);
}
	
	@Test(expected = AsistenciaYaRegistradaException.class)
	public void queNoSePuedeRegistrarLaAsistenciaDosVecesEnElMismoDia() throws AsistenciaYaRegistradaException{
		
		String nombreDeEscuela = "Unlam";
		Institucion institucionEducativa = new Institucion(nombreDeEscuela);
		Integer dni = 1;
		String nombreDelAlumno = "Bauti";
		String apellido = "Schneiders";
		Integer edad = 4;
		LocalDate fecha = LocalDate.of(2024, 10, 29);
		Alumno alumno = new Alumno(dni, nombreDelAlumno, apellido, edad, true);
		
		institucionEducativa.registrarAsistencia(alumno, fecha);
		institucionEducativa.registrarAsistencia(alumno, fecha);
}
	
	
}
	
	
