package ar.unlam.Pb2.tp.institucion;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
	
	private Integer dni;
    private String nombre;
    private String apellido;
    
    public Persona(Integer dni, String nombre, String apellido) {
    	this.dni = dni;
    	this.nombre = nombre;
    	this.apellido = apellido;
    	
    }

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	public int compareTo(Persona alumno) {
		return apellido.compareTo(alumno.getApellido())+nombre.compareTo(alumno.getNombre())+dni.compareTo(alumno.getDni());
	}	

}
