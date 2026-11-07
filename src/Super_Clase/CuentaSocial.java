package Super_Clase;

public class CuentaSocial {
    protected String username;
    protected String email;
    protected int seguidores;

    public CuentaSocial(String username, String email, int seguidores) {
        this.username = username;
        this.email = email;
        this.seguidores = seguidores;
    }

    public void publicarContenido(String contenido){
        System.out.println(username + "publicó: " + contenido);
    }

    public void seguir(String seguir){
        System.out.println(username + "ahora sigues a @" + seguir);
    }

    public double calcularImpacto(){
        return seguidores;
    }


    public void mostrarInformacion(){
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Seguidores: " + seguidores);
    }
}
