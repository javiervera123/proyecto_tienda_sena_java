package package_tienda.pedidos;

import package_tienda.envios.Entrega;
import java.util.Date;

public class Pedido {
    private int idPedido;
    private Date fecha;
    private String estado; // Pendiente, En Proceso, Entregado, Cancelado
    private String metodoPago;
    private Entrega entrega; // 👈 asociación con Entrega

    // Constructor
    public Pedido(int idPedido, Date fecha, String estado, String metodoPago) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.metodoPago = metodoPago;
    }

    // 👇 Nuevo método para asignar una entrega
    public void asignarEntrega(Entrega entrega) {
        this.entrega = entrega;
        System.out.println("Entrega asignada al pedido #" + idPedido);
    }

    // Getter para consultar la entrega
    public Entrega getEntrega() {
        return entrega;
    }

    // Resto de getters/setters y lógica que ya tenías...
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
}
