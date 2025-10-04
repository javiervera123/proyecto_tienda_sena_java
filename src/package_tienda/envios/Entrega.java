package package_tienda.envios;

import java.util.Date;

public class Entrega {
    private int idEntrega;
    private Direccion direccion;
    private double costoEnvio;
    private String estado; // Pendiente, En camino, Entregado
    private Date fechaEntrega;

    public Entrega(int idEntrega, Direccion direccion, double costoEnvio) {
        this.idEntrega = idEntrega;
        this.direccion = direccion;
        this.costoEnvio = costoEnvio;
        this.estado = "Pendiente";
        this.fechaEntrega = null;
    }

    public void despachar() {
        estado = "En camino";
        System.out.println("Entrega #" + idEntrega + " despachada hacia: ");
        direccion.mostrarDireccion();
    }

    public void entregar() {
        estado = "Entregado";
        fechaEntrega = new Date();
        System.out.println("Entrega #" + idEntrega + " realizada.");
    }

    // Getters y Setters
    public int getIdEntrega() { return idEntrega; }
    public void setIdEntrega(int idEntrega) { this.idEntrega = idEntrega; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    public double getCostoEnvio() { return costoEnvio; }
    public void setCostoEnvio(double costoEnvio) { this.costoEnvio = costoEnvio; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public Date getFechaEntrega() { return fechaEntrega; }
    public void setFechaEntrega(Date fechaEntrega) { this.fechaEntrega = fechaEntrega; }
}
