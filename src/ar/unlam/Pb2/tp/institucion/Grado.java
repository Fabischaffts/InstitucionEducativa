package ar.unlam.Pb2.tp.institucion;



public class Grado {

    private String nombre;
    private Alumno[] alumnos;
    private DocentePrimaria[] docentes;
    private int indiceAlumno;
    private int edadMinima;
    private int indiceDocente;

    public Grado(String nombre, int edadMinima, int MaxDocente) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
        this.alumnos = new Alumno[30]; 
        this.indiceAlumno = 0;
        this.docentes = new DocentePrimaria[1];
        this.indiceDocente = 0;
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (alumno.getEdad() < edadMinima) {
            System.out.println("El alumno " + alumno.getNombre() + " no cumple con la edad mínima de " + edadMinima + " años para " + nombre);
            return false;
        }
        if (indiceAlumno < alumnos.length) {
            alumnos[indiceAlumno++] = alumno;
            return true;
        } else {
            System.out.println("No hay más espacio para alumnos en la sala " + nombre);
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Alumno buscarAlumnoPorNombre(String nombreAlumno) {
        for (int i = 0; i < indiceAlumno; i++) {
            if (alumnos[i].getNombre().equals(nombreAlumno)) {
                return alumnos[i];
            }
        }
        return null;
    }

	public void agregarDocente(DocentePrimaria docente) {
		if (indiceDocente < docentes.length) {
            docentes[indiceDocente++] = docente;
        } else {
            System.out.println("No hay más espacio para docentes en la sala " + nombre);
        }
		
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public DocentePrimaria[] getDocentes() {
		return docentes;
	}

	public void setDocentes(DocentePrimaria[] docentes) {
		this.docentes = docentes;
	}
	
}