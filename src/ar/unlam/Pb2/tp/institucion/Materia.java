package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;

public class Materia extends Curso {
	
	private String nombre;
	private Docente docente;
	private final static Integer maxDocentes = 1;
	
	public Materia(String nombre) {
		super(nombre);
		this.docente =docente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(DocenteSecundario docente) {
		this.docente = docente;
	}

	@Override
	public Boolean agregarAlumno(Alumno alumno) throws AlumnoInscriptoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean agregarDocente(Docente docente) throws CantidadMaximaDocentesException {
		if(docentes.size()<=maxDocentes) {
		docentes.add(docente);
		return true;
	}
	 throw new CantidadMaximaDocentesException();	
} 
	

	@Override
	public void registrarAsistencia(Alumno alumno, LocalDate fecha) throws AsistenciaYaRegistradaException {
		// TODO Auto-generated method stub
		
	}
	
}

