package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;

public class Empleado extends Usuario {
    //aqui van las var que le pueda adicionar con private

    // Constructor → llama al constructor de Usuario con super()
    public Empleado(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String celular, String email) {
        super(id, nombre,apellido1,apellido2,direccion,celular,email); //Constructor de Usuario
        //this.nuevaVariable = nuevaVariable;
    }
    //@Override me permite soobreescribir metodos para dar comportamientos propios
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Empleado. ");
    }
    // Métodos específicos del empleado
    public void registrarVenta(){
        System.out.println("Registro de ventas.....");
    }
    public void generarFactura(){
        System.out.println("Generando factura...");
    }
    public void cerrarCaja(){
        System.out.println("Cerrando caja...");
    }
    public void registrarPeticiones(){
        System.out.println("Registrando peticiones, ya sea reclamos..");
    }
}
