package package_tienda.productos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Inventario
 * Sirve para almacenar los productos que tiene la tienda
 * y calcular el valor total según su stock y precio.
 */
public class Inventario {
    // ================== ATRIBUTOS ==================
    private int idInventario;         // Identificador único del inventario
    private String fecha;             // Fecha en la que se creó o actualizó el inventario
    private String descripcion;       // Breve descripción (ejemplo: "Inventario inicial")
    private double valorTotal;        // Valor total del inventario (suma de precios * stock)
    private List<Producto> listaProductos; // Lista de productos que están en este inventario

    // ================== CONSTRUCTOR ==================
    /**
     * Constructor del inventario.
     * Inicializa la lista de productos vacía y el valor total en 0.
     */
    public Inventario(int idInventario, String fecha, String descripcion) {
        this.idInventario = idInventario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.listaProductos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    // ================== MÉTODOS DE LÓGICA ==================
    /**
     * Agregar un producto al inventario
     * @param producto Producto a añadir en la lista
     */
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        calcularValorTotal(); // recalcula el total cada vez que se agrega un producto
    }

    /**
     * Calcular el valor total del inventario.
     * Se multiplica el precio * stock de cada producto.
     */
    public void calcularValorTotal() {
        valorTotal = 0.0; // reiniciamos el acumulador
        for (Producto p : listaProductos) {
            valorTotal += p.getPrecio() * p.getStock();
        }
    }

    /**
     * Generar un reporte en consola con los productos y el valor total.
     */
    public void generarReporteInventario() {
        System.out.println("==== REPORTE DE INVENTARIO ====");
        System.out.println("ID Inventario: " + idInventario);
        System.out.println("Fecha: " + fecha);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Productos en inventario: " + listaProductos.size());

        // Recorrer todos los productos de la lista
        for (Producto p : listaProductos) {
            System.out.println(" - " + p.getNombre()
                    + " | Precio: " + p.getPrecio()
                    + " | Stock: " + p.getStock()
                    + " | Subtotal: " + (p.getPrecio() * p.getStock()));
        }

        System.out.println("Valor Total Inventario: " + valorTotal);
        System.out.println("=================================");
    }

    /**
     * Simula que el inventario se guarda en una base de datos.
     */
    public void guardarInventario() {
        System.out.println("Inventario guardado correctamente en la base de datos (simulado).");
    }

    // ================== GETTERS Y SETTERS ==================
    public int getIdInventario() { return idInventario; }
    public void setIdInventario(int idInventario) { this.idInventario = idInventario; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    public List<Producto> getListaProductos() { return listaProductos; }
    public void setListaProductos(List<Producto> listaProductos) { this.listaProductos = listaProductos; }
}
