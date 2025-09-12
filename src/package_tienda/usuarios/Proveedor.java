package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;

import java.awt.*;

public class Proveedor extends Usuario {
    //aqui van las var que le pueda adicionar con private
    private String celular2, descripcion, pagina_Web;
    private String imagen;
    // Constructor → llama al constructor de Usuario con super()
    public Proveedor(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String celular, String email,String celular2,
                     String pagina_Web, String descripcion, String imagen) {
        super(id, nombre,apellido1,apellido2,direccion,celular,email); //Constructor de Usuario
        this.celular2 = celular2;
        this.descripcion = descripcion;
        this.pagina_Web = pagina_Web;
        this.imagen = imagen;
    }
    //@Override me permite soobreescribir metodos para dar comportamientos propios
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Proveedor. ");
    }
    public void suministrarProducto() {
        System.out.println("Aqui vá la información del pedido ");
    }
}
