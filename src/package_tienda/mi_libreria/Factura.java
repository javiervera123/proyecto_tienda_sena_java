package package_tienda.mi_libreria;

public class Factura {
    private int idFactura;
    private String fecha;
    private double total;

    // Constructor
    public Factura(int idFactura, String fecha, double total) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.total = total;
    }

    // Getters y Setters
    public int getIdFactura() { return idFactura; }
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}

