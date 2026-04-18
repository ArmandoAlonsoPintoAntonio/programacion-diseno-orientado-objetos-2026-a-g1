public abstract class Envio {
    protected String codigo;
    protected double pesoKg;

    public Envio(String codigo, double pesoKg) {
        if (codigo.isEmpty()) {
            throw new IllegalArgumentException("Código no puede estar vacío");
        }
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("Peso debe ser mayor a 0");
        }

        this.codigo = codigo;
        this.pesoKg = pesoKg;
    }

    public abstract double calcularCosto();

    public String resumen() {
        return "Código: " + codigo + 
               "\nPeso: " + pesoKg + " kg";
    }
}