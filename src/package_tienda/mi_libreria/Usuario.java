package package_tienda.mi_libreria;

public abstract class Usuario {
    // Variables protegidas (accesibles en las subclases)
    protected int id;
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected String direccion;
    protected String celular;
    protected String email;

    // Constructor común para todos los usuarios
    public Usuario(int id, String nombre, String apellido1, String apellido2,
                   String direccion, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
    }

    // 🔹 Método concreto (se hereda tal cual)
    public void mostrarInfo() {
        System.out.println("****** Datos Personales ******");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido1 + " " + apellido2);
        System.out.println("Dirección: " + direccion);
        System.out.println("Celular: " + celular);
        System.out.println("Email: " + email);
    }

    // 🔹 Método abstracto (cada subclase debe implementarlo)
    public abstract void mostrarRol();

    // 🔹 Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido1() { return apellido1; }
    public void setApellido1(String apellido1) { this.apellido1 = apellido1; }

    public String getApellido2() { return apellido2; }
    public void setApellido2(String apellido2) { this.apellido2 = apellido2; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
