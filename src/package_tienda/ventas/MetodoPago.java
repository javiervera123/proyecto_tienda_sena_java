package package_tienda.ventas;

/**
 * MetodoPago: representación simple del medio de pago.
 * Nota: para la lógica real de pagos usa la abstracción package_tienda.mi_libreria.Pago / PagoPedido.
 */
public class MetodoPago {
    private int idMetodo;
    private String tipo; // Efectivo, Tarjeta, Transferencia, etc.
    private String descripcion; // opcional: detalles del método (ej. "VISA ****1234")

    public MetodoPago(int idMetodo, String tipo) {
        this.idMetodo = idMetodo;
        this.tipo = tipo;
        this.descripcion = "";
    }

    public MetodoPago(int idMetodo, String tipo, String descripcion) {
        this.idMetodo = idMetodo;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    // Método auxiliar para mostrar el método en consola
    public void mostrarMetodo() {
        System.out.println("Método de pago: " + tipo + " " + (descripcion.isEmpty() ? "" : (" - " + descripcion)));
    }

    // ===== Getters y Setters =====
    public int getIdMetodo() { return idMetodo; }
    public void setIdMetodo(int idMetodo) { this.idMetodo = idMetodo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
