package package_tienda.productos;
import java.util.ArrayList;
import java.util.List; // libreria para las listas

public class Inventario {
    private int idInventario;
    private String fecha;
    private String descripcion;
    private double valorTotal;
    private List<Producto> productos;

    public Inventario(int idInventario, String fecha, String descripcion) {
        this.idInventario = idInventario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.productos = new ArrayList<>(); // empieza vacío
        generarReporteInventario();
    }

    public void generarReporteInventario() {
        valorTotal = 0;
        for (Producto p : productos) {
            valorTotal += p.obtenerPrecio();
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }
    public void guardarInventario() {
        System.out.println("Inventario guardando");
    }
}

