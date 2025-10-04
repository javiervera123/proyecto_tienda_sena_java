package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;

public class Empleado extends Usuario {
    // 🔹 Atributos propios del empleado
    private String cargo;
    private double salario;

    // Constructor → llama al constructor de Usuario con super()
    public Empleado(int id, String nombre, String apellido1, String apellido2,
                    String direccion, String celular, String email) {
        super(id, nombre, apellido1, apellido2, direccion, celular, email);
        this.cargo = "Cajero";   // valor por defecto
        this.salario = 0.0;
    }

    // @Override → comportamiento propio
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Empleado.");
    }

    // Métodos específicos del empleado
    public void registrarVenta() {
        System.out.println(nombre + " registró una venta.");
    }

    public void generarFactura() {
        System.out.println(nombre + " generó una factura.");
    }

    public void cerrarCaja() {
        System.out.println(nombre + " cerró la caja.");
    }

    public void registrarPeticiones() {
        System.out.println(nombre + " registró una petición (queja o permiso).");
    }

    // 🔹 Getters y Setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
