package package_tienda.usuarios;

import package_tienda.mi_libreria.Usuario;

public class Proveedor extends Usuario {
    // 🔹 Atributos propios del proveedor
    private String nit;
    private String celular2;
    private String descripcion;
    private String paginaWeb;
    private String imagen;

    // Constructor → llama al constructor de Usuario con super()
    public Proveedor(int id, String nombre, String apellido1, String apellido2,
                     String direccion, String celular, String email,
                     String celular2, String paginaWeb, String descripcion, String imagen) {
        super(id, nombre, apellido1, apellido2, direccion, celular, email);
        this.nit = "N/A"; // lo puedes asignar luego con setNit()
        this.celular2 = celular2;
        this.descripcion = descripcion;
        this.paginaWeb = paginaWeb;
        this.imagen = imagen;
    }

    // @Override → comportamiento propio
    @Override
    public void mostrarRol() {
        System.out.println("Soy un Proveedor.");
    }

    public void suministrarProducto() {
        System.out.println(nombre + " está suministrando productos.");
    }

    // 🔹 Getters y Setters
    public String getNit() { return nit; }
    public void setNit(String nit) { this.nit = nit; }

    public String getCelular2() { return celular2; }
    public void setCelular2(String celular2) { this.celular2 = celular2; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getPaginaWeb() { return paginaWeb; }
    public void setPaginaWeb(String paginaWeb) { this.paginaWeb = paginaWeb; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }
}
