package ar.unlam.Pb2.tp.institucion;



public class Jardin{

private Sala[] salas;

	public Jardin() {
	        salas = new Sala[4];
	        salas[0] = new Sala("Celeste", 10, 2);
	        salas[1] = new Sala("Verde", 10, 2);
	        salas[2] = new Sala("Azul", 10, 2);
	        salas[3] = new Sala("Roja", 10, 2);
	    }

	    public void agregarDocenteASala(DocenteJardin docente, String colorSala, Boolean maestra) {
	        Sala sala = obtenerSalaPorColor(colorSala);
	        
	        if (maestra) {  
	            if (sala != null) {
	                sala.agregarDocente(docente);
	            } else {
	                System.out.println("La sala con el color especificado no existe.");
	            }
	        } else {
	            System.out.println("La docente tiene que ser maestra.");
	        }
	    }

	    public void verSalas() {
	        for (Sala sala : salas) {
	            sala.mostrarContenido();
	        }
	    }

	    private Sala obtenerSalaPorColor(String colorSala) {
	        switch (colorSala.toUpperCase()) {
	            case "CELESTE":
	                return salas[0];
	            case "VERDE":
	                return salas[1];
	            case "AZUL":
	                return salas[2];
	            case "ROJA":
	                return salas[3];
	            default:
	                System.out.println("Sala no válida.");
	                return null;
	        }
	    }
	    public boolean agregarAlumnoASala(Alumno alumno) {
	        int edad = alumno.getEdad();
	        Sala sala = null;

	        switch (edad) {
	            case 2:
	                sala = salas[0];
	                break;
	            case 3:
	                sala = salas[1];
	                break;
	            case 4:
	                sala = salas[2];
	                break;
	            case 5:
	                sala = salas[3];
	                break;
	            default:
	                System.out.println("Edad no válida para las salas de jardín.");
	                return false;
	        }

	        if (sala != null) {
	            sala.agregarAlumno(alumno);
	            System.out.println("El alumno " + alumno.getNombre() + " ha sido asignado a la sala " + sala.getNombre());
	            return true;
	        }

	        return false;
	    }
}
