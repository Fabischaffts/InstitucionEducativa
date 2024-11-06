package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Institucion extends Curso {

	private ArrayList<Docente> docentes;
	private ArrayList<Alumno> alumnos;
	private Map<Alumno, LocalDate> asistencia;

	public Institucion(String nombre) {
		super(nombre);
		this.nombre = nombre;
		this.docentes = new ArrayList<Docente>();
		this.alumnos = new ArrayList<Alumno>();
		this.asistencia = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Boolean agregarAlumno(Alumno alumno) {

		for (Alumno alumnoDeEscuela : alumnos) {
			if (alumnoDeEscuela.getDni().equals(alumno.getDni())) {
				System.out.println("el alumno ya existe en la escuela");
				return false;
			}
		}
		return alumnos.add(alumno);
	}

	public Boolean agregarDocente(Docente docente) {
		for (Docente docenteDeEscuela : docentes) {
			if (docenteDeEscuela.getDni().equals(docente.getDni())) {
				System.out.println("el docente ya existe en la escuela");
				return false;
			}
		}

		return docentes.add(docente);
	}

	@Override
	public void registrarAsistencia(Alumno alumno, LocalDate fecha) throws AsistenciaYaRegistradaException {

		if (alumno.getFechas().contains(fecha)) {
			throw new AsistenciaYaRegistradaException();
		}
		alumno.registrarAsistencia(fecha);
		asistencia.put(alumno, fecha);
	}

}
