package package_tienda;
import package_tienda.mi_libreria.Usuario;
import package_tienda.usuarios.Proveedor;
import package_tienda.usuarios.*;



public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "César", "londoño", "",
                              "Cartago Valle- Los Sauces por la cancha","3183829****","londono@hotmail.com");
        Empleado empleado = new Empleado(1, "Felipe", "Cardona", "Arias",
                              "Cartago Valle- Las Veraneras","3267629****","123@gmail.com");
        Administrador admin = new Administrador(1, "Javier", "vera", "Ramirez",
                              "Cartago Valle- La arenera","323829****","veraadsi123@gmail.com","admin","admin123");
        Proveedor proveedor = new Proveedor(1, "Gaseosas Angie", "", "",
                               "Cartago Valle- Centro","323829****","angiegaseosas@gmail.com",
                                "2323434","angiegaseosas.com.co", "Es un proveedor de refrescos","logo");
        cliente.mostrarRol();
        cliente.mostrarInfo();

        empleado.mostrarRol();
        empleado.registrarVenta();
        empleado.generarFactura();
        empleado.cerrarCaja();
        empleado.registrarPeticiones();

        proveedor.mostrarRol();
        proveedor.mostrarInfo();
        proveedor.suministrarProducto();

        // falta metodos carritoCompra
        // falta metodos inventario= generarReporteInventario y guardarInventario()
        // falta oferta
        // falta venta

        admin.mostrarRol();
        admin.mostrarInfo();
        if (admin.iniciarSesion("admin", "admin123")) {
            System.out.println("Login correcto ✅");
            admin.gestionarUsuarios();
            admin.gestionarProductos();
            admin.verReporteVentas();
        } else {
            System.out.println("Login fallido ❌");
        }

    }
}