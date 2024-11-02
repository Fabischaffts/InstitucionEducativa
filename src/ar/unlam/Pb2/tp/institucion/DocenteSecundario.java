package ar.unlam.Pb2.tp.institucion;

public class DocenteSecundario extends Docente {
	private String nombre;
	private String materia;


	public DocenteSecundario(Integer dni, String nombre, String apellido, TipoDeEspecialidad tipo, String materia) {
		super(dni, nombre, apellido, tipo);
		this.setMateria(materia);
	}

	public void setCompetente(Boolean competente) {
	
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}



}

