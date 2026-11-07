import Sub_Clase.CuentaCreador;
import Sub_Clase.CuentaCorporativa;
import Super_Clase.CuentaSocial;

public class Main {

    public static void main(String[] args) {

        CuentaCreador creador = new CuentaCreador(
                "gamer123",
                "gamer@gmail.com",
                10000,
                50000,
                250000
        );

        CuentaCorporativa empresa = new CuentaCorporativa(
                "tecnologia_oficial",
                "contacto@tecnologia.com",
                20000,
                3,
                "www.tecnologia.com"
        );

        System.out.println("===== CUENTA DE CREADOR =====");

        creador.publicarContenido("Nuevo video disponible.");
        creador.seguir("programador");
        creador.registrarIngresos(10000);

        System.out.println("\n--- MÉTRICAS DEL CREADOR ---");
        creador.mostrarInformacion();

        System.out.println("\n===== CUENTA CORPORATIVA =====");

        empresa.publicarContenido("Conocé nuestros nuevos productos.");
        empresa.seguir("clientes");

        empresa.agregarAdministrador();
        empresa.agregarAdministrador();
        empresa.agregarAdministrador();
        empresa.agregarAdministrador();

        System.out.println("\n--- MÉTRICAS DE LA EMPRESA ---");
        empresa.mostrarInformacion();
    }
}