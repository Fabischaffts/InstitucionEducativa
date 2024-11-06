package ar.unlam.Pb2.tp.institucion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Primaria extends Institucion {

	private ArrayList<Alumno> alumnos;
	private LinkedList<Grado> grados;

	public Primaria(String nombre) {
		super(nombre);
		this.grados = new LinkedList<Grado>();
		this.alumnos = new ArrayList<Alumno>();
	}

	@Override
	public Boolean agregarAlumno(Alumno alumno) {
		int edad = alumno.getEdad();
		if (edad >= 6) {
			alumnos.add(alumno);
			return super.agregarAlumno(alumno);
		}
		return false;
	}

	public Boolean inscribirAlumnoEnGrado(Alumno alumno, Grado grado) {
		for (Alumno alumnoEnPrimaria : alumnos) {
			if (alumnoEnPrimaria.equals(alumno))
				;
			if (alumno.isAprobado() == true && alumno.getEdad() >= grado.getEdadMinima())
				;
			return grado.agregarAlumno(alumno);
		}
		return false;
	}

	@Override
	public Boolean agregarDocente(Docente docente) {
		return super.agregarDocente(docente);
	}

	public LinkedList<Grado> getGrados() {
		return grados;
	}

	public void setGrados(LinkedList<Grado> grados) {
		this.grados = grados;
	}

}
