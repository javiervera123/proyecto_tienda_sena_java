package package_tienda.envios;

public class Direccion {
    private String calle;
    private String barrio;
    private String ciudad;
    private String coordenadas; // opcional: lat/lon

    public Direccion(String calle, String barrio, String ciudad, String coordenadas) {
        this.calle = calle;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.coordenadas = coordenadas;
    }

    public void mostrarDireccion() {
        System.out.println(calle + ", " + barrio + ", " + ciudad + " (" + coordenadas + ")");
    }

    // Getters y Setters
    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getBarrio() { return barrio; }
    public void setBarrio(String barrio) { this.barrio = barrio; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getCoordenadas() { return coordenadas; }
    public void setCoordenadas(String coordenadas) { this.coordenadas = coordenadas; }
}
