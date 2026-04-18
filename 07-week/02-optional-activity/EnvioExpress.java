public class EnvioExpress extends Envio {

    public EnvioExpress(String codigo, double pesoKg) {
        super(codigo, pesoKg);
    }

    @Override
    public double calcularCosto() {
        return 15000 + (pesoKg * 3500);
    }
}