package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
    protected String nombre;
    protected List<Alumno> alumnos;
    protected List<Docente> docentes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    public abstract Boolean agregarAlumno(Alumno alumno) throws AlumnoInscriptoException;
    public abstract Boolean agregarDocente(Docente docente) throws CantidadMaximaDocentesException;
    public abstract void registrarAsistencia(Alumno alumno, LocalDate fecha) throws AsistenciaYaRegistradaException;

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public String getNombre() {
        return nombre;
    }
    public Alumno buscarAlumno(Integer dni) throws AlumnoNoEncontradoException {
        return alumnos.stream()
                .filter(alumno -> alumno.getDni().equals(dni))
                .findFirst()
                .orElseThrow(() -> new AlumnoNoEncontradoException());
    }
}