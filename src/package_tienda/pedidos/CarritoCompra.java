package package_tienda.pedidos;
import package_tienda.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompra {
    private int idCarrito;
    private List<Producto> listaProductos;
    private double subtotal;

    public CarritoCompra(int idCarrito) {
        this.idCarrito = idCarrito;
        this.listaProductos = new ArrayList<>();
        this.subtotal = 0;
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        calcularSubtotal();
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
        calcularSubtotal();
    }

    public void calcularSubtotal() {
        subtotal = 0;
        for (Producto p : listaProductos) {
            subtotal += p.obtenerPrecio();
        }
    }

    public double getSubtotal() {
        return subtotal;
    }
}
