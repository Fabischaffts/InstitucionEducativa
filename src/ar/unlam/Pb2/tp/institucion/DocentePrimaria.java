package ar.unlam.Pb2.tp.institucion;

public class DocentePrimaria {

    private String nombre;
    private int gradoCompetente;

    public DocentePrimaria(String nombre, int gradoCompetente) {
        this.nombre = nombre;
        this.gradoCompetente = gradoCompetente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCompetente(Boolean competente) {
       
    }

    public int getGradoCompetente() {
        return gradoCompetente;
    }

    public boolean puedeEvaluar(int grado) {
        return this.gradoCompetente == grado;
    }
}
