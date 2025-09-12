package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;

public class Cliente extends Usuario {
    //aqui van las var que le pueda adicionar con private

    // Constructor → llama al constructor de Usuario con super()
    public Cliente(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String celular, String email) {
        super(id, nombre,apellido1,apellido2,direccion,celular,email); //Constructor de Usuario
        //this.nuevaVariable = nuevaVariable;
    }
    //@Override me permite soobreescribir metodos para dar comportamientos propios
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Cliente. ");
    }
}