package package_tienda.ventas;
import package_tienda.productos.Producto;

import java.util.Date;
import java.util.List;

public class Venta {
    private int idVenta;
    private Date fecha;
    private double total;
    private List<Producto> productos;

    public Venta(int idVenta, Date fecha, List<Producto> productos) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.productos = productos;
        calcularTotal();
    }

    public void calcularTotal() {
        total = 0;
        for (Producto p : productos) {
            total += p.obtenerPrecio();
        }
    }

    public double getTotal() {
        return total;
    }
    public void registrarVenta(){
        System.out.println("Registrando Venta ");
    }
    public void ImprimirFactura(){
        System.out.println("Registrando Venta ");
    }
    public void guardarVenta(){
        System.out.println("Registrando Venta ");
    }
}
