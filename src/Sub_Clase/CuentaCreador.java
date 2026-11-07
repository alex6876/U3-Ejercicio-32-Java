package Sub_Clase;

import Super_Clase.CuentaSocial;

public class CuentaCreador extends CuentaSocial {
    private double ingresoPublicidad;
    private int visualizaciones;

    public CuentaCreador(String username, String email, int seguidores, double ingresoPublicidad, int visualizaciones) {

        super(username, email, seguidores);

        this.ingresoPublicidad = ingresoPublicidad;
        this.visualizaciones = visualizaciones;
    }

    @Override
    public double calcularImpacto() {
        return seguidores + (visualizaciones / 100.0);
    }


    public void registrarIngresos(double monto){
        if(monto > 0){
            ingresoPublicidad += monto;
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        System.out.println("Tipo de cuenta: Creador");
        System.out.println("Ingresos por publicidad: $" + ingresoPublicidad);
        System.out.println("Visualizaciones: " + visualizaciones);
        System.out.println("Impacto: " + calcularImpacto());
    }
}
