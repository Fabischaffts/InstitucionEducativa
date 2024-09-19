package ar.unlam.Pb2.tp.institucion;

public class Sala {
	   
	private String nombre;
    private Alumno[] alumnos;
    private DocenteJardin[] docentes;
    private int indiceAlumno;
    private int indiceDocente;

    public Sala(String nombre, int maxAlumnos, int maxDocentes) {
        this.nombre = nombre;
        this.alumnos = new Alumno[maxAlumnos];
        this.docentes = new DocenteJardin[maxDocentes];
        this.indiceAlumno = 0;
        this.indiceDocente = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        if (indiceAlumno < alumnos.length) {
            alumnos[indiceAlumno++] = alumno;
        } else {
            System.out.println("No hay más espacio para alumnos en la sala " + nombre);
        }
    }

    public void agregarDocente(DocenteJardin docente) {
        if (indiceDocente < docentes.length) {
            docentes[indiceDocente++] = docente;
        } else {
            System.out.println("No hay más espacio para docentes en la sala " + nombre);
        }
    }

    public void mostrarContenido() {
        System.out.println("Sala: " + nombre);
        System.out.println("Alumnos:");
        for (Alumno alumno : alumnos) {
            if (alumno != null) {
                System.out.println(" - " + alumno.getNombre());
            }
        }
        System.out.println("Docentes:");
        for (DocenteJardin docente : docentes) {
            if (docente != null) {
                System.out.println(" - " + docente.getNombre());
            }
        }
    }

	public static Sala valueOf(String colorSala) {
		
		return null;
	}
}
