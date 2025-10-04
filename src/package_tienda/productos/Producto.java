package package_tienda.productos;

import java.util.Date;

public class Producto {
    private int idProducto;
    private String codigoBarras, nombre, descripcion;
    private double precio;
    private int stock;
    private String tipoMedida;
    private Date fechaVto;
    private String imagen;

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
    // Getters y Setters
    public int getIdProducto() { return idProducto; }
    public void setIdProducto(int idProducto) { this.idProducto = idProducto; }

    public String getCodigoBarras() { return codigoBarras; }
    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getFechaVto() { return fechaVto; }
    public void setFechaVto(String fechaVto) { this.fechaVto = fechaVto; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}
