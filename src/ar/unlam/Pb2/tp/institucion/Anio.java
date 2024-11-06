package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anio extends Curso {

	private String nombre;
	private List<Alumno> alumnos;
	private int edadMinima;
	private Map<Alumno, LocalDate> listaDeAsistencia;
	private final Integer maxDocentes = 1;

	public Anio(String nombre, int edadMinima, int maxDocente, int cantidadMaxDeMateria) {
		super(nombre);
		this.nombre = nombre;
		this.edadMinima = edadMinima;
		this.alumnos = new ArrayList<>();
		this.alumnos = new ArrayList<>();
		this.listaDeAsistencia = new HashMap<>();

	}

	public Boolean agregarAlumno(Alumno alumno) {

		if (alumno.getEdad() > 13) {
			return alumnos.add(alumno);
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public Alumno buscarAlumnoPorNombre(String nombreAlumno) {
		for (Alumno alumno : alumnos) {
			if (alumno.getNombre().equals(nombreAlumno))
				;
			return alumno;
		}
		return null;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public List<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(List<Docente> docentes) {
		this.docentes = docentes;
	}

	public Integer getEdadMinima() {
		return edadMinima;
	}

	@Override
	public Boolean agregarDocente(Docente docente) throws CantidadMaximaDocentesException {

		if (docentes.size() <= maxDocentes) {
			docentes.add(docente);
			return true;
		}
		throw new CantidadMaximaDocentesException();
	}

	@Override
	public void registrarAsistencia(Alumno alumno, LocalDate fecha) throws AsistenciaYaRegistradaException {
		if (listaDeAsistencia.get(alumno).equals(fecha)) {
			throw new AsistenciaYaRegistradaException();
		} else {
			alumno.setAsistencia(true);
			listaDeAsistencia.put(alumno, fecha);
		}

	}

}
