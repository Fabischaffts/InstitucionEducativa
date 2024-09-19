package ar.unlam.Pb2.tp.institucion;

public class Docente {
	
	private String nombre; 
	private Integer dni;
	private TipoDeEspecialidad Tipo;

	
	public Docente(Integer dni, String nombre, TipoDeEspecialidad Tipo) {
		this.setDni(dni);
		this.nombre = nombre;
		this.setTipo(Tipo);
		
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public TipoDeEspecialidad getTipo() {
		return Tipo;
	}
	public void setTipo(TipoDeEspecialidad tipo) {
		Tipo = tipo;
	}
	}

