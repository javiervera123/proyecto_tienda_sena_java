package package_tienda.ventas;

import package_tienda.productos.Producto;

import java.util.Date;
import java.util.List;

/**
 * Clase Venta
 * Representa la transacción de venta en la tienda.
 * Contiene una lista de productos, la fecha y el total calculado.
 */
public class Venta {
    // ================== ATRIBUTOS ==================
    private int idVenta;            // Identificador único de la venta
    private Date fecha;             // Fecha de la venta
    private double total;           // Total de la venta (suma de precios)
    private List<Producto> productos; // Lista de productos vendidos

    // ================== CONSTRUCTOR ==================
    public Venta(int idVenta, Date fecha, List<Producto> productos) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.productos = productos;
        calcularTotal(); // se calcula el total al momento de crear la venta
    }

    // ================== MÉTODOS DE LÓGICA ==================
    /**
     * Calcular el total de la venta sumando los precios de los productos.
     */
    public void calcularTotal() {
        total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
    }

    /**
     * Registrar la venta en el sistema (simulado).
     */
    public void registrarVenta() {
        System.out.println("Venta registrada con ID: " + idVenta + " en fecha " + fecha);
    }

    /**
     * Imprimir factura simple en consola.
     */
    public void imprimirFactura() {
        System.out.println("===== FACTURA VENTA =====");
        System.out.println("ID Venta: " + idVenta);
        System.out.println("Fecha: " + fecha);
        for (Producto p : productos) {
            System.out.println(" - " + p.getNombre() + " | Precio: " + p.getPrecio());
        }
        System.out.println("TOTAL: " + total);
        System.out.println("==========================");
    }

    /**
     * Simular que la venta se guarda en la base de datos.
     */
    public void guardarVenta() {
        System.out.println("Venta guardada correctamente en la base de datos (simulado).");
    }

    // ================== GETTERS Y SETTERS ==================
    public int getIdVenta() { return idVenta; }
    public void setIdVenta(int idVenta) { this.idVenta = idVenta; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }

    public List<Producto> getProductos() { return productos; }
    public void setProductos(List<Producto> productos) { this.productos = productos; }


}
