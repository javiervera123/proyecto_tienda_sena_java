package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;

public class Cliente extends Usuario {
    // 🔹 Atributo propio de Cliente
    private String categoriaCliente;

    // Constructor → llama al constructor de Usuario con super()
    public Cliente(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String celular, String email) {
        super(id, nombre, apellido1, apellido2, direccion, celular, email);
        this.categoriaCliente = "Nuevo"; // valor por defecto
    }

    // @Override → comportamiento propio del cliente
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Cliente.");
    }

    // Getters y Setters
    public String getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(String categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }
}
