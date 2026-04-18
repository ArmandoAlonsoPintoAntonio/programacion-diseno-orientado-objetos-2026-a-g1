public class EnvioEstandar extends Envio {

    public EnvioEstandar(String codigo, double pesoKg) {
        super(codigo, pesoKg);
    }

    @Override
    public double calcularCosto() {
        return 8000 + (pesoKg * 2000);
    }
}