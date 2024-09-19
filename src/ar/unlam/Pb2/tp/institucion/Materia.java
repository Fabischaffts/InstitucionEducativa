package ar.unlam.Pb2.tp.institucion;

public class Materia {
	
	private String nombre;
	private DocenteSecundario docente;
	
	public Materia(String nombre) {
		this.setNombre(nombre);
		this.docente =docente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public DocenteSecundario getDocente() {
		return docente;
	}

	public void setDocente(DocenteSecundario docente) {
		this.docente = docente;
	}

}

