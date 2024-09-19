package ar.unlam.Pb2.tp.institucion;

import java.util.ArrayList;
import java.util.List;



public class Escuela {
	
	private String nombre;
	private ArrayList<Docente> docentes;
	private ArrayList <Alumno> alumnos;
	private Curso[] cursos;
	private int indiceAlumno;
    private int indiceDocente;
	
	public Escuela(String nombre) {
		
		this.nombre = nombre;
		this.docentes = new ArrayList <Docente>();
		this.alumnos = new ArrayList<Alumno>();
		this.cursos = new Curso[3];
		this.indiceAlumno = 0;
	    this.indiceDocente = 0;
	    
		
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

	public Curso[] getCursos() {
		return cursos;
	}

	public void setCursos(Curso[] cursos) {
		this.cursos = cursos;
	}
	public boolean agregarAlumno(Alumno alumno) {
		
		for (Alumno alumnoDeEscuela : alumnos) {
			if(alumnoDeEscuela.getDni().equals(alumno.getDni())) {
				System.out.println("el alumno ya existe en la escuela");
				return false;
			}
		}
		return alumnos.add(alumno);
	}
       

	public Boolean agregarDocente(Docente docente) {
	       for (Docente docenteDeEscuela : docentes) {
	    		if(docenteDeEscuela.getDni().equals(docente.getDni())) {
	            System.out.println("No hay más espacio para docentes en la sala " + nombre);
	            return false;
	        }
	       }
	       
	    		return docentes.add(docente);
	}
/*	 public void verTodo() {
	       
	                System.out.println("Alumnos:");
	                Alumno[] alumnos = getAlumnos();
	                for (Alumno alumno : alumnos) {
	                    if (alumno != null) {
	                        System.out.println(" - " + alumno.getNombre());//+alumno.asistio(null));
	                    }
	                }
	                
	                System.out.println("Docentes:");
	                Docente[] docentes = getDocentes();
	                for (Docente docente : docentes) {
	                    if (docente != null) {
	                        System.out.println(" - " + docente.getNombre());
	                    }
	                }
	            }
	    public Alumno buscarAlumnoPorNombre(String nombreAlumno) {
	        Alumno[] alumnos = getAlumnos(); 
	        for (int i = 0; i < alumnos.length; i++) { 
	            if (alumnos[i] != null && alumnos[i].getNombre().equals(nombreAlumno)) {  
	                return alumnos[i];  
	            }
	        }
	        return null;  
	    }
*/
	        }
