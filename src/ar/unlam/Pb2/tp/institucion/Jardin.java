package ar.unlam.Pb2.tp.institucion;

import java.util.ArrayList;

public class Jardin extends Institucion {

	private ArrayList<Sala> salas;

	public Jardin(Institucion institucionEducativa, String nombre) {
		super(nombre);
		;
		this.salas = new ArrayList<Sala>(4);
		salas.add(new Sala("Celeste", 10));
		salas.add(new Sala("Verde", 10));
		salas.add(new Sala("Azul", 10));
		salas.add(new Sala("Rojo", 10));
	}

	public Sala obtenerSalaPorColor(String colorSala) {
		for (Sala sala : salas) {
			if (sala.getNombre().equals(colorSala)) {
				return sala;
			}
		}
		System.out.println("Sala no válida.");
		return null;
	}

	public String agregarAlumnoASala(Alumno alumno) {

		int edad = alumno.getEdad();
		Sala sala = null;

		switch (edad) {
		case 2:
			sala = obtenerSalaPorColor("Celeste");
			break;
		case 3:
			sala = obtenerSalaPorColor("Verde");
			break;
		case 4:
			sala = obtenerSalaPorColor("Azul");
			break;
		case 5:
			sala = obtenerSalaPorColor("Rojo");
			break;
		default:
			System.out.println("Edad no válida para las salas de jardín.");
			return null;
		}

		if (sala != null) {
			sala.agregarAlumno(alumno);
			System.out.println("El alumno " + alumno.getNombre() + " ha sido asignado a la sala " + sala.getNombre());
			return sala.getNombre();
		}
		// }

		return null;
	}

	public boolean agregarDocenteASala(Docente docente, String colorSala) throws CantidadMaximaDocentesException {
		if (docente.getTipo() == TipoDeEspecialidad.JARDIN) {
			Sala sala = obtenerSalaPorColor(colorSala);
			if (sala != null) {
				return sala.agregarDocente(docente);
			}
		}
		return false;
	}
}
