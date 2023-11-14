package pkg1.pkg1c.aed.modelo;

public class Turismo extends Vehiculo implements Coste {
    
    protected double precioPorDia;
    protected int diasAlquiler = 0;
    protected int diasDevolucion = 0;
    
    public Turismo(String matricula, boolean alquilado) {
        super(matricula, alquilado);
    }
    
    public Turismo(double precioPorDia, String matricula, boolean alquilado) {
        super(matricula, alquilado);
        this.precioPorDia = precioPorDia;
    }
    
    @Override
    public void alquilar(int numDias) {
        setAlquilado(true);
        setDiasAlquiler(numDias);
    }
    
    @Override
    public boolean devolver(int numDias) {
        setAlquilado(false);
        setDiasAlquiler(numDias);
        return true;
    }
    
    @Override
    public String mostrarInformacion() {
        String alquiladoString = isAlquilado() ? "Sí" : "No";
        return "--> Datos de un Turismo:"
                + "\nMatrícula: " + getMatricula()
                + "\nAlquilado: " + alquiladoString
                + "\nPrecio por día: " + getPrecioPorDia()
                + "\n----------------------------\n";
    }
    
    @Override
    public void importeFinal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double getPrecioPorDia() {
        return precioPorDia;
    }
    
    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }
    
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    
    public int getDiasDevolucion() {
        return diasDevolucion;
    }
    
    public void setDiasDevolucion(int diasDevolucion) {
        this.diasDevolucion = diasDevolucion;
    }
    
}
