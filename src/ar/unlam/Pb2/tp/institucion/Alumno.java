package ar.unlam.Pb2.tp.institucion;

import java.time.LocalDate;

public class Alumno extends Persona {

	private Integer edad;
    private boolean aprobado;
    private LocalDate[] fechas;
    private boolean[] asistencias;
    private int indiceClase;

    public Alumno(Integer dni, String nombre, String apellido, Integer edad) {
 		super(dni, nombre, apellido);
 	
   
        this.edad = edad;
        this.aprobado = false;
        this.fechas = new LocalDate[10]; // Inicialmente se reserva espacio para 10 fechas
        this.asistencias = new boolean[10];
        this.indiceClase = 0;
    }

    

    public Integer getEdad() {
        return edad;
    }
    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }
    

    public boolean asistio(LocalDate fecha) {
        for (int i = 0; i < indiceClase; i++) {
            if (fechas[i].equals(fecha)) {
                return asistencias[i];
            }
        }
        return false;
    }

    public void registrarAsistencia(LocalDate fecha, boolean presente) {

        if (indiceClase == fechas.length) {
            aumentarCapacidad();
        }
        fechas[indiceClase] = fecha;
        asistencias[indiceClase] = presente;
        indiceClase++;
    }

    private void aumentarCapacidad() {

        LocalDate[] nuevasFechas = new LocalDate[fechas.length * 2];
        boolean[] nuevasAsistencias = new boolean[asistencias.length * 2];

        System.arraycopy(fechas, 0, nuevasFechas, 0, fechas.length);
        System.arraycopy(asistencias, 0, nuevasAsistencias, 0, asistencias.length);

        fechas = nuevasFechas;
        asistencias = nuevasAsistencias;
    }

}
