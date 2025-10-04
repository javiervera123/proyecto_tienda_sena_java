package package_tienda.mi_libreria;

public abstract class Pago {
    private int idPago;
    private String descripcionPago;
    private double monto;

    // Constructor
    public Pago(int idPago, String descripcionPago, double monto) {
        this.idPago = idPago;
        this.descripcionPago = descripcionPago;
        this.monto = monto;
    }

    // Método abstracto
    public abstract void procesarPago();

    // Getters y Setters
    public int getIdPago() { return idPago; }
    public void setIdPago(int idPago) { this.idPago = idPago; }

    public String getDescripcionPago() { return descripcionPago; }
    public void setDescripcionPago(String descripcionPago) { this.descripcionPago = descripcionPago; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
}
