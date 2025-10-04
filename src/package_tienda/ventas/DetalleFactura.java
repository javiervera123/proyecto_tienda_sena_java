package package_tienda.ventas;

import package_tienda.productos.Producto;

/**
 * Detalle de factura: una línea con producto, cantidad, precio unitario y subtotal.
 */
public class DetalleFactura {
    private int idDetalle;
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;

    // Constructor: toma precio unitario desde el producto al crear el detalle
    public DetalleFactura(int idDetalle, Producto producto, int cantidad) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = (producto != null) ? producto.getPrecio() : 0.0;
        this.subtotal = calcularSubtotal();
    }

    // Calcula subtotal = precioUnitario * cantidad
    public double calcularSubtotal() {
        return precioUnitario * cantidad;
    }

    // ===== Getters y Setters =====
    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) {
        this.producto = producto;
        this.precioUnitario = (producto != null) ? producto.getPrecio() : 0.0;
        this.subtotal = calcularSubtotal();
    }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.subtotal = calcularSubtotal();
    }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
