package package_tienda.pedidos;

public class Entrega {
    private int idEntrega;
    private String direccion;
    private String barrio;
    private String coordenadas;
    private double costo;

    // Constructor
    public Entrega(int idEntrega, String direccion, String barrio, String coordenadas, double costo) {
        this.idEntrega = idEntrega;
        this.direccion = direccion;
        this.barrio = barrio;
        this.coordenadas = coordenadas;
        this.costo = costo;
    }

    // Método de lógica
    public double calcularCosto() {
        return costo;
    }

    // Getters y Setters
    public int getIdEntrega() { return idEntrega; }
    public void setIdEntrega(int idEntrega) { this.idEntrega = idEntrega; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getBarrio() { return barrio; }
    public void setBarrio(String barrio) { this.barrio = barrio; }

    public String getCoordenadas() { return coordenadas; }
    public void setCoordenadas(String coordenadas) { this.coordenadas = coordenadas; }

    public double getCosto() { return costo; }
    public void setCosto(double costo) { this.costo = costo; }
}
