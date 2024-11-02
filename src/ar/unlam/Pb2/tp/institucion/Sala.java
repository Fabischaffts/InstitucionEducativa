package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Sala extends Curso{
	   
	
    private ArrayList <Alumno> alumnos;
    private ArrayList <Docente>docentes;
    private int indiceAlumno;
    private int indiceDocente;
    private final static Integer maxDocentes = 2;

    public Sala(String nombre, Integer minAlumnos) {
       super(nombre);
        this.alumnos = new ArrayList<Alumno>();
        this.docentes = new ArrayList<Docente>();
        this.indiceAlumno = 0;
        this.indiceDocente = 0;
       
    }

    public String getNombre() {
        return nombre;
    }

    public Boolean agregarAlumno(Alumno alumno) {
   //    if (indiceAlumno < alumnos.size()) {
           alumnos.add(alumno);
        
		return false;

    }

    public Boolean agregarDocente(Docente docente) throws CantidadMaximaDocentesException   {
       
    		if(docentes.size()<=maxDocentes) {
    		docentes.add(docente);
    		return true;
		}
    	 throw new CantidadMaximaDocentesException();	
    } 


	public Integer obtenerCantidadDeAlumnos() {
		return alumnos.size();
		
		
	}
    
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}

	public int getIndiceAlumno() {
		return indiceAlumno;
	}

	public void setIndiceAlumno(int indiceAlumno) {
		this.indiceAlumno = indiceAlumno;
	}

	public int getIndiceDocente() {
		return indiceDocente;
	}

	public void setIndiceDocente(int indiceDocente) {
		this.indiceDocente = indiceDocente;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Sala valueOf(String colorSala) {
		
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sala other = (Sala) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public void registrarAsistencia(Alumno alumno, LocalDate fecha) throws AsistenciaYaRegistradaException {
	}


	
}
