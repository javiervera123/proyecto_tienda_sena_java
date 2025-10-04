package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;
import package_tienda.validaciones.Credencial;

public class Administrador extends Usuario {
    private Credencial credencial;  //composición:
    // Constructor → llama al constructor de Usuario con super()
    public Administrador(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String celular, String email,String username, String password) {
        super(id, nombre,apellido1,apellido2,direccion,celular,email); //Constructor de Usuario
        //aqui van las var que le pueda adicionar con private
        this.credencial = new Credencial(username, password); // instancia de la clase Credencial para login

    }
    //@Override me permite soobreescribir metodos para dar comportamientos propios
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Administrador de la tienda. ");
    }
    public boolean iniciarSesion(String user, String pass) {
        return credencial.validarLogin(user, pass);
    }

    public void gestionarUsuarios() {
        System.out.println("Gestionando usuarios...");
    }

    public void gestionarProductos() {
        System.out.println("Gestionando productos...");
    }
    public void verReporteVentas(){
        System.out.println("Reporte de ventas...");
    }
    // Getters y Setters
    public Credencial getCredencial() { return credencial; }
    public void setCredencial(Credencial credencial) { this.credencial = credencial; }
}
