package ar.unlam.Pb2.tp.institucion;

public class Docente extends Persona{
	
	private String nombre; 
	private Integer dni;
	private TipoDeEspecialidad tipo;

	public Docente(Integer dni, String nombre, String apellido, TipoDeEspecialidad tipo) {
		super(dni, nombre, apellido);
		
		this.setTipo(tipo);
		
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
		return tipo;
	}
	public void setTipo(TipoDeEspecialidad tipo) {
		tipo = this.tipo;
	}

	}

