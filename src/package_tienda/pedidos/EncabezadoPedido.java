package package_tienda.pedidos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EncabezadoPedido {
    private int idEncabezado;
    private Pedido pedido;
    private Date fecha;
    private List<DetallePedido> listaDetalles;
    private double total;

    // Constructor
    public EncabezadoPedido(int idEncabezado, Pedido pedido) {
        this.idEncabezado = idEncabezado;
        this.pedido = pedido;
        this.fecha = new Date();
        this.listaDetalles = new ArrayList<>();
        this.total = 0.0;
    }

    // Lógica
    public void agregarDetalle(DetallePedido detalle) {
        if (detalle != null) {
            listaDetalles.add(detalle);
            calcularTotal();
        }
    }

    public void eliminarDetalle(DetallePedido detalle) {
        if (detalle != null && listaDetalles.remove(detalle)) {
            calcularTotal();
        }
    }

    public void vaciarDetalles() {
        listaDetalles.clear();
        total = 0.0;
    }

    public void calcularTotal() {
        total = 0.0;
        for (DetallePedido d : listaDetalles) {
            total += d.getSubtotal();
        }
        // Si el pedido tiene un costo de entrega asociado, podrías añadirlo aquí
        // Ejemplo: if (pedido != null && pedido.getMetodoPago() != null) { total += entrega.getCosto(); }
    }

    public void mostrarEncabezado() {
        System.out.println("---- Encabezado Pedido ----");
        System.out.println("ID Encabezado: " + idEncabezado);
        System.out.println("ID Pedido: " + (pedido != null ? pedido.getIdPedido() : "N/A"));
        System.out.println("Fecha: " + fecha);
        System.out.println("Total: " + total);
        System.out.println("Detalles (" + listaDetalles.size() + "):");
        for (DetallePedido d : listaDetalles) {
            System.out.println("  - " + d.getProducto().getNombre() + " x" + d.getCantidad() + " => " + d.getSubtotal());
        }
    }

    // Getters y Setters
    public int getIdEncabezado() {
        return idEncabezado;
    }

    public void setIdEncabezado(int idEncabezado) {
        this.idEncabezado = idEncabezado;
    }


}