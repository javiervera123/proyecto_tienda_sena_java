package package_tienda.productos;
import java.util.List;

public class Inventario {
    private int idInventario;
    private String fecha;
    private String descripcion;
    private double valorTotal;
    private List<Producto> productos;

    public Inventario(int idInventario, String fecha, String descripcion, List<Producto> productos) {
        this.idInventario = idInventario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.productos = productos;
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

