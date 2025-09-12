package package_tienda.mi_libreria;

public abstract class  Usuario {
    // variabl protegidas sólo las subclases pueden acceder a ellas
     protected int id;
     protected String nombre, apellido1, apellido2, direccion;
     protected String celular, email;

    // Constructor heredado de Usuario, es decir es común)
    public Usuario(int id,String nombre, String apellido1, String
            apellido2, String direccion, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 =apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.celular = celular;
        this.email = email;
    }

    // metodos getter obtienen valores de retorno.
// registrar(), actualizar(), eliminar(), comprar().

// métodos setter no trae valores, sólo los muestra
// Metodo concreto (ya implementado, se hereda tal cual)
    public void mostrarInfo() {
        System.out.println(" ****** Datos Personales son: ******");
        System.out.println("id: "+id);
        System.out.println("nombre: "+nombre+"\napellidos: " +apellido1+" "+apellido2);
        System.out.println("dirección: " + direccion + "\ncelular " + celular + "\nemail " + email);
    }

    // Metodo abstracto → cada subclase debe implementarlo
    public void mostrarRol(){
        System.out.println("Soy un Empleado. ");
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
}


