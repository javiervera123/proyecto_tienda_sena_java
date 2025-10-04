package package_tienda.pedidos;

import package_tienda.productos.Producto;

public class DetallePedido {
    private int idDetalle;
    private Producto producto;
    private int cantidad;
    private double subtotal;

    // Constructor
    public DetallePedido(int idDetalle, Producto producto, int cantidad) {
        this.idDetalle = idDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    // Método de lógica
    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }

    // Getters y Setters
    public int getIdDetalle() { return idDetalle; }
    public void setIdDetalle(int idDetalle) { this.idDetalle = idDetalle; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
