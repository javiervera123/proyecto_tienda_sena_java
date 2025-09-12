package package_tienda.validaciones;

public class Credencial {
    private String username;
    private String password;
    // metodo constructor tipo set
    public  Credencial(String username,String password) {
       this.username=username;
       this.password=password;
    }

    public boolean validarLogin(String user, String pass) {
        return this.username.equals(user) && this.password.equals(pass);
    }
}

