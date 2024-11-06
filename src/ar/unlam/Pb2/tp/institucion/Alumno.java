package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Alumno extends Persona {

	private Boolean asistencia;
	private List<LocalDate> fechas;
	private List<Boolean> asistencias;
	private List<String> nivelesAprobados;
	private Integer edad;
	private boolean aprobado;

	public Alumno(Integer dni, String nombre, String apellido, Integer edad, Boolean asistencia) {
		super(dni, nombre, apellido);

		this.fechas = new ArrayList<>();
		this.asistencias = new ArrayList<>();
		this.nivelesAprobados = new ArrayList<>();
		this.edad = edad;
		this.aprobado = false;
		this.asistencia = false;
	}

	public Integer getEdad() {
		return edad;
	}

	public List<LocalDate> getFechas() {
		return fechas;
	}

	public void setFechas(List<LocalDate> fechas) {
		this.fechas = fechas;
	}

	public boolean isAprobado() {

		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public void registrarAsistencia(LocalDate fecha) throws AsistenciaYaRegistradaException {
		if (fechas.contains(fecha)) {
			throw new AsistenciaYaRegistradaException();
		}
		fechas.add(fecha);
		asistencias.add(true);
	}

	public void agregarNivelAprobado(String nivel) {
		nivelesAprobados.add(nivel);
	}

	public boolean ultimoNivelAprobado() {
		return !nivelesAprobados.isEmpty();
	}

	public Boolean getAsistencia() {
		return asistencia;
	}

	public void setAsistencia(Boolean asistencia) {
		this.asistencia = asistencia;
	}

}
