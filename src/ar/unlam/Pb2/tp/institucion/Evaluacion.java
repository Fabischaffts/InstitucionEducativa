package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;


public class Evaluacion {
	
	private LocalDate fecha;
	private Materia materia;
	private Integer nota;

	public Evaluacion(LocalDate fecha, Materia materia, Integer nota) {
		this.fecha = fecha;
		this.materia = materia;
		this.nota =nota;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}
	

}
