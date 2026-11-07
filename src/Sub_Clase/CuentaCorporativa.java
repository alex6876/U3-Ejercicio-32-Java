package Sub_Clase;

import Super_Clase.CuentaSocial;

public class CuentaCorporativa extends CuentaSocial {

    private int limiteAdministradores;
    private String sitioWebOficial;
    private int administradoresActuales;

    public CuentaCorporativa(String username, String email, int seguidores,
                             int limiteAdministradores, String sitioWebOficial) {

        super(username, email, seguidores);

        this.limiteAdministradores = limiteAdministradores;
        this.sitioWebOficial = sitioWebOficial;
        this.administradoresActuales = 0;
    }

    public void agregarAdministrador() {

        if (administradoresActuales < limiteAdministradores) {

            administradoresActuales++;

            System.out.println("Administrador agregado correctamente.");

        } else {

            System.out.println("Se alcanzó el límite de administradores.");
        }
    }

    @Override
    public double calcularImpacto() {

        return seguidores * 1.5;
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();

        System.out.println("Tipo de cuenta: Corporativa");
        System.out.println("Sitio web oficial: " + sitioWebOficial);
        System.out.println("Límite de administradores: " + limiteAdministradores);
        System.out.println("Administradores actuales: " + administradoresActuales);
        System.out.println("Impacto: " + calcularImpacto());
    }
}