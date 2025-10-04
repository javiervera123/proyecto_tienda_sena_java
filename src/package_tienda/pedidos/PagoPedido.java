package package_tienda.pedidos;

import package_tienda.mi_libreria.Pago;
import java.util.Date;

public class PagoPedido extends Pago {
    private Pedido pedido;
    private Date fecha;
    private String estado;      // "Pendiente", "Procesado", "Fallido"
    private String metodoPago;  // "Efectivo", "Tarjeta", "Transferencia"

    // Constructor
    public PagoPedido(int idPago, String descripcionPago, double monto,
                      Pedido pedido, String metodoPago) {
        super(idPago, descripcionPago, monto);
        this.pedido = pedido;
        this.fecha = new Date();
        this.estado = "Pendiente";
        this.metodoPago = metodoPago;
    }

    // Implementación del método abstracto de la clase padre
    @Override
    public void procesarPago() {
        if (getMonto() <= 0) {
            this.estado = "Fallido";
            System.out.println("Pago fallido: monto inválido.");
            return;
        }
        this.estado = "Procesado";
        if (pedido != null) {
            pedido.setEstado("Confirmado");
        }
        System.out.println("Pago procesado correctamente. Monto: " + getMonto());
    }

    // Getters y Setters
    public Pedido getPedido() { return pedido; }
    public void setPedido(Pedido pedido) { this.pedido = pedido; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
}
