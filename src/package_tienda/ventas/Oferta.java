package package_tienda.ventas;

import java.util.Date;

public class Oferta {
    private int idOferta;
    private String nombreOferta;
    private String descripcionOferta;
    private double descuento; // porcentaje
    private Date fechaInicio;
    private Date fechaFin;

    public Oferta(int idOferta, String nombreOferta, String descripcionOferta, double descuento,
                Date fechaInicio, Date fechaFin) {
        this.idOferta = idOferta;
        this.nombreOferta = nombreOferta;
        this.descripcionOferta = descripcionOferta;
        this.descuento = descuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public double aplicarDescuento(double precio) {
        return precio - (precio * descuento / 100);
    }
    public void actualizarInventario(){
        System.out.println("Inventario Actualizado");
    }
    public void mostrarOferta(){
        System.out.println("Método mostrar Ofertas");
    }
}