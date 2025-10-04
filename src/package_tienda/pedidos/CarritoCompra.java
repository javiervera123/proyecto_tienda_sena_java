package package_tienda.pedidos;

import package_tienda.productos.Producto;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private int idCarrito;
    private List<Producto> listaProductos;
    private double subtotal;

    // Constructor
    public CarritoCompra(int idCarrito) {
        this.idCarrito = idCarrito;
        this.listaProductos = new ArrayList<>();
        this.subtotal = 0.0;
    }

    // Métodos de lógica
    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            listaProductos.add(producto);
        }
        calcularSubtotal();
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
        calcularSubtotal();
    }

    public void vaciarCarrito() {
        listaProductos.clear();
        subtotal = 0.0;
    }

    public void calcularSubtotal() {
        subtotal = 0.0;
        for (Producto p : listaProductos) {
            subtotal += p.getPrecio();
        }
    }

    // Getters y Setters
    public int getIdCarrito() { return idCarrito; }
    public void setIdCarrito(int idCarrito) { this.idCarrito = idCarrito; }

    public List<Producto> getListaProductos() { return listaProductos; }
    public void setListaProductos(List<Producto> listaProductos) { this.listaProductos = listaProductos; }

    public double getSubtotal() { return subtotal; }
    public void setSubtotal(double subtotal) { this.subtotal = subtotal; }
}
