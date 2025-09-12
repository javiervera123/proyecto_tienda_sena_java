package package_tienda.productos;

import java.util.Date;

public class Producto {
    private int idProducto;
    private String codigoBarras, nombre, descripcion;
    private double precio;
    private int stock;
    private String tipoMedida;
    private Date fechaVto;
    // creamos el constructor con parámetros
    public Producto (int idProducto, String codigoBarras, String nombre,String descripcion,
                     double precio, int stock, String tipoMedida, Date fechaVto){
        this.idProducto = idProducto;
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.tipoMedida = tipoMedida;
        this.fechaVto = fechaVto;
    }
    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void cambiarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }
}
