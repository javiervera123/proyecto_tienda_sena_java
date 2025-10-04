package package_tienda.ventas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Encabezado de factura (EncFactura).
 * Contiene la referencia a la venta, la lista de detalles y el total.
 */
public class EncFactura {
    private int idEncabezado;
    private Venta venta;
    private Date fecha;
    private List<DetalleFactura> listaDetalles;
    private double total;

    // Constructor
    public EncFactura(int idEncabezado, Venta venta) {
        this.idEncabezado = idEncabezado;
        this.venta = venta;
        this.fecha = new Date();
        this.listaDetalles = new ArrayList<>();
        this.total = 0.0;
    }

    // Agrega un detalle y recalcula el total
    public void agregarDetalle(DetalleFactura detalle) {
        if (detalle != null) {
            listaDetalles.add(detalle);
            calcularTotal();
        }
    }

    // Elimina un detalle y recalcula el total
    public void eliminarDetalle(DetalleFactura detalle) {
        if (detalle != null && listaDetalles.remove(detalle)) {
            calcularTotal();
        }
    }

    // Vacía todos los detalles
    public void vaciarDetalles() {
        listaDetalles.clear();
        total = 0.0;
    }

    // Calcula el total sumando los subtotales de los detalles.
    // Si la Venta ya tiene un total calculado, no lo sobreescribe
    // (pero aquí priorizamos la suma de detalles).
    public void calcularTotal() {
        total = 0.0;
        for (DetalleFactura d : listaDetalles) {
            total += d.getSubtotal();
        }
    }

    // Imprime por consola una factura simple (cabecera + detalles + total)
    public void imprimirFactura() {
        System.out.println("===== ENCABEZADO FACTURA =====");
        System.out.println("ID Encabezado: " + idEncabezado);
        System.out.println("Fecha: " + fecha);
        if (venta != null) {
            System.out.println("ID Venta asociada: " + venta.getIdVenta());
        }
        System.out.println("------------------------------");
        System.out.println("DETALLES:");
        for (DetalleFactura d : listaDetalles) {
            System.out.printf(" %s | Cant: %d | PU: %.2f | Sub: %.2f%n",
                    d.getProducto().getNombre(),
                    d.getCantidad(),
                    d.getPrecioUnitario(),
                    d.getSubtotal());
        }
        System.out.println("------------------------------");
        System.out.println("TOTAL FACTURA: " + total);
        System.out.println("==============================");
    }

    // ===== Getters y Setters =====
    public int getIdEncabezado() { return idEncabezado; }
    public void setIdEncabezado(int idEncabezado) { this.idEncabezado = idEncabezado; }

    public Venta getVenta() { return venta; }
    public void setVenta(Venta venta) { this.venta = venta; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public List<DetalleFactura> getListaDetalles() { return listaDetalles; }
    public void setListaDetalles(List<DetalleFactura> listaDetalles) {
        this.listaDetalles = (listaDetalles != null) ? listaDetalles : new ArrayList<>();
        calcularTotal();
    }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}
