public class EnvioInternacional extends Envio {
    private String paisDestino;

    public EnvioInternacional(String codigo, double pesoKg, String paisDestino) {
        super(codigo, pesoKg);

        if (paisDestino.isEmpty()) {
            throw new IllegalArgumentException("País destino no puede estar vacío");
        }

        this.paisDestino = paisDestino;
    }

    @Override
    public double calcularCosto() {
        return 30000 + (pesoKg * 6000);
    }

    @Override
    public String resumen() {
        return super.resumen() + "\nDestino: " + paisDestino;
    }
}