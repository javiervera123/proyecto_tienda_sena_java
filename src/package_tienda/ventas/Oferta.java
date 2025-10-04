package package_tienda.ventas;

import java.util.Date;

/**
 * Clase Oferta
 * Representa promociones aplicables a productos.
 */
public class Oferta {
    // ================== ATRIBUTOS ==================
    private int idOferta;             // Identificador único de la oferta
    private String nombreOferta;      // Nombre de la promoción (ejemplo: "Descuento 2x1")
    private String descripcionOferta; // Detalle de la promoción
    private double descuento;         // Descuento en porcentaje (%)
    private Date fechaInicio;         // Fecha de inicio de la oferta
    private Date fechaFin;            // Fecha de fin de la oferta

    // ================== CONSTRUCTOR ==================
    public Oferta(int idOferta, String nombreOferta, String descripcionOferta,
                  double descuento, Date fechaInicio, Date fechaFin) {
        this.idOferta = idOferta;
        this.nombreOferta = nombreOferta;
        this.descripcionOferta = descripcionOferta;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // ================== MÉTODOS DE LÓGICA ==================
    /**
     * Aplica el descuento a un precio dado.
     * @param precio precio original
     * @return precio con descuento
     */
    public double aplicarDescuento(double precio) {
        return precio - (precio * descuento / 100);
    }

    /**
     * Mostrar la oferta en consola.
     */
    public void mostrarOferta() {
        System.out.println("===== OFERTA =====");
        System.out.println("ID: " + idOferta);
        System.out.println("Nombre: " + nombreOferta);
        System.out.println("Descripción: " + descripcionOferta);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Válida desde " + fechaInicio + " hasta " + fechaFin);
        System.out.println("===================");
    }

    // ================== GETTERS Y SETTERS ==================
    public int getIdOferta() { return idOferta; }
    public void setIdOferta(int idOferta) { this.idOferta = idOferta; }

    public String getNombreOferta() { return nombreOferta; }
    public void setNombreOferta(String nombreOferta) { this.nombreOferta = nombreOferta; }

    public String getDescripcionOferta() { return descripcionOferta; }
    public void setDescripcionOferta(String descripcionOferta) { this.descripcionOferta = descripcionOferta; }

    public double getDescuento() { return descuento; }
    public void setDescuento(double descuento) { this.descuento = descuento; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }
}
