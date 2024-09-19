package ar.unlam.Pb2.tp.institucion;

public class DocenteJardin {
	private String nombre; 
	private Sala color;
	private boolean maestra;
	 
	
	public DocenteJardin(String nombre, Sala color) {
		
		this.nombre = nombre;
		this.color = color;
		this.setMaestra(true);
		

	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Sala getColor() {
		return color;
	}

	public void setColor(Sala color) {
		this.color = color;
	}

	public boolean isMaestra() {
		return maestra;
	}

	   public void setMaestra(boolean maestra) {
	        if (!maestra) {
	            System.out.println("No puede ser docente de jardín.");
	        }
	        this.maestra = maestra;
	    }


	}
