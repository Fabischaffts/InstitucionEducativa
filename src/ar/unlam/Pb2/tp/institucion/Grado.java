package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Grado extends Curso{

  
    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente >docentes;
    private Integer edadMinima = 6;
    private final static Integer maxDocentes = 1;


    public Grado(String nombre, int edadMinima, int MaxDocente) {
        super(nombre);
        this.edadMinima = 6;
        this.alumnos = new ArrayList<Alumno>();
        this.docentes = new ArrayList<Docente>();
    }

	public Integer getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(Integer edadMinima) {
		this.edadMinima = edadMinima;
	}
    
    
@Override
    public Boolean agregarAlumno(Alumno alumno) {
    	if(alumno.getEdad()>6) {
    	return alumnos.add(alumno);
    }
		return false;
    }

    public Boolean agregarDocente(Docente docente) throws CantidadMaximaDocentesException   {
       
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

	