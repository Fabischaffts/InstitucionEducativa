package ar.unlam.Pb2.tp.institucion;

public class Primaria {

    private Grado[] grados;

    public Primaria() {
        grados = new Grado[6];
        grados[0] = new Grado("Primer Grado", 6,1);
        grados[1] = new Grado("Segundo Grado", 7,1);
        grados[2] = new Grado("Tercer Grado", 8, 1);
        grados[3] = new Grado("Cuarto Grado", 9, 1);
        grados[4] = new Grado("Quinto Grado", 10, 1);
        grados[5] = new Grado("Sexto Grado", 11, 1);
    }

    public boolean agregarAlumnoAGrado(Alumno alumno) {
    	int edad = alumno.getEdad();
        Grado grado = null;

        if (edad >= 6 && edad <= 11) {
            grado = grados[edad - 6];

            if (edad > 6 && alumno.isAprobado()) {
                System.out.println("El alumno " + alumno.getNombre() + " no aprob� el grado anterior y no puede inscribirse en " + grado.getNombre());
                return false;
            }
        } else {
            System.out.println("Edad no v�lida para primaria.");
            return false;
        }

        if (grado.agregarAlumno(alumno)) {
            System.out.println("El alumno " + alumno.getNombre() + " ha sido asignado al " + grado.getNombre());
            return true;
        }

        return false;
    }

    public void agregarDocenteAGrado(DocentePrimaria docente, int grado, Boolean competente) {
       Grado gradoElegido = obtenerGradoPorIndice(grado);
    	if(competente) {
    	   if( grado != 0) {
    		   gradoElegido.agregarDocente(docente);
    	   }else {
    		   System.out.println("el grado no existe");
    		   
    	   }
       }
    }

    public void verGrados() {
        for (Grado grado : grados) {
            if (grado != null) {
                System.out.println("Grado: " + grado.getNombre());
                
                System.out.println("Alumnos:");
                Alumno[] alumnos = grado.getAlumnos();
                for (Alumno alumno : alumnos) {
                    if (alumno != null) {
                        System.out.println(" - " + alumno.getNombre());
                    }
                }
                
                System.out.println("Docentes:");
                DocentePrimaria[] docentes = grado.getDocentes();
                for (DocentePrimaria docente : docentes) {
                    if (docente != null) {
                        System.out.println(" - " + docente.getNombre());
                    }
                }
            }
        }
    }
    

    public Grado obtenerGradoPorIndice(int indice) {
        if (indice >= 0 && indice < grados.length) {
            return grados[indice];
        } else {
            System.out.println("�ndice de grado inv�lido.");
            return null;
        }
      
   
    }
}

