package package_tienda;

import package_tienda.envios.Entrega;
import package_tienda.usuarios.*;
import package_tienda.productos.*;
import package_tienda.pedidos.*;
import package_tienda.ventas.*;
import package_tienda.envios.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ================== USUARIOS ==================
        Cliente cliente = new Cliente(1, "César", "Londoño", "",
                "Cartago Valle - Los Sauces", "3183829****", "londono@hotmail.com");
        cliente.setCategoriaCliente("VIP");

        Empleado empleado = new Empleado(2, "Felipe", "Cardona", "Arias",
                "Cartago Valle - Las Veraneras", "3267629****", "123@gmail.com");

        Administrador admin = new Administrador(3, "Javier", "Vera", "Ramirez",
                "Cartago Valle - La arenera", "323829****", "veraadsi123@gmail.com",
                "admin", "admin123");

        Proveedor proveedor = new Proveedor(4, "Gaseosas Angie", "", "",
                "Cartago Valle - Centro", "323829****", "angiegaseosas@gmail.com",
                "2323434", "angiegaseosas.com.co", "Es un proveedor de refrescos", "logo");

        // ================== PRODUCTOS ==================
        Producto arroz = new Producto(1, "11111", "Arroz 1kg", "Arroz blanco",
                5000, 5, "Kg", new Date());

        Producto leche = new Producto(2, "22222", "Leche 1L", "Leche entera",
                3500, 10, "Litro", new Date());

        // ================== PEDIDO Y PAGO ==================
        Pedido pedido = new Pedido(1, new Date(), "Pendiente", "Tarjeta");

        PagoPedido pago = new PagoPedido(1, "Pago con tarjeta",
                arroz.getPrecio() * arroz.getStock(), pedido, "Tarjeta");

        pago.procesarPago();

        System.out.println("Estado pedido: " + pedido.getEstado());
        System.out.println("Estado pago: " + pago.getEstado());

        // ================== CARRITO ==================
        CarritoCompra carrito = new CarritoCompra(1);
        carrito.agregarProducto(arroz);
        carrito.agregarProducto(leche);
        System.out.println("Subtotal del carrito: " + carrito.getSubtotal());

        // ================== INVENTARIO ==================
        Inventario inventario = new Inventario(1, "03/10/2025", "Inventario general");
        inventario.agregarProducto(arroz);
        inventario.agregarProducto(leche);
        inventario.calcularValorTotal();
        System.out.println("Valor total del inventario: " + inventario.getValorTotal());

        // ================== OFERTA ==================
        Oferta oferta = new Oferta(1, "Promo Arroz", "Descuento especial", 10,
                new Date(), new Date());
        double precioConDescuento = oferta.aplicarDescuento(arroz.getPrecio());
        System.out.println("Precio con descuento del arroz: " + precioConDescuento);

        // ================== VENTA ==================
        List<Producto> productosVenta = new ArrayList<>();
        productosVenta.add(arroz);
        productosVenta.add(leche);

        Venta venta = new Venta(1, new Date(), productosVenta);
        System.out.println("Total de la venta: " + venta.getTotal());
        venta.registrarVenta();
        venta.imprimirFactura();

        // ================== ENVIOS ==================
        Direccion direccion = new Direccion("Calle 10", "Los Sauces", "Cartago", "4.7523,-75.9123");
        Entrega entrega = new Entrega(1, direccion, 8000);

        pedido.asignarEntrega(entrega);
        entrega.despachar();
        entrega.entregar();

        // ================== MOSTRAR INFO USUARIOS ==================
        cliente.mostrarRol();
        cliente.mostrarInfo();
        System.out.println("Categoría del cliente: " + cliente.getCategoriaCliente());

        empleado.mostrarRol();
        empleado.registrarVenta();
        empleado.generarFactura();
        empleado.cerrarCaja();
        empleado.registrarPeticiones();

        proveedor.mostrarRol();
        proveedor.mostrarInfo();
        proveedor.suministrarProducto();

        admin.mostrarRol();
        admin.mostrarInfo();
        if (admin.iniciarSesion("admin", "admin123")) {
            System.out.println("Login correcto ");
            admin.gestionarUsuarios();
            admin.gestionarProductos();
            admin.verReporteVentas();
        } else {
            System.out.println("Login fallido ");
        }
    }
}
