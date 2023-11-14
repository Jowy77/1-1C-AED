package pkg1.pkg1c.aed.modelo;

public abstract class Vehiculo {

    protected String matricula;
    protected boolean alquilado;

    public Vehiculo(String matricula, boolean alquilado) {
        this.matricula = matricula;
        this.alquilado = alquilado;
    }

    public abstract void alquilar(int numDias);

    public abstract boolean devolver(int numDias);

    public abstract String mostrarInformacion();

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
    
    

}
