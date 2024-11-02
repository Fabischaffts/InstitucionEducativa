package ar.unlam.Pb2.tp.institucion;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona{
	
	private String nombre; 
	private TipoDeEspecialidad tipo;
	private List<String> especialidades;

	public Docente(Integer dni, String nombre, String apellido, TipoDeEspecialidad tipo) {
		super(dni, nombre, apellido);
		
		this.setTipo(tipo);
		this.especialidades = new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoDeEspecialidad getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeEspecialidad tipo) {
		tipo = this.tipo;
	}
    public void agregarEspecialidad(String especialidad) {
        if (!especialidades.contains(especialidad)) {
            especialidades.add(especialidad);
        }
    }

    public List<String> getEspecialidades() {
        return especialidades;
    }

	}

