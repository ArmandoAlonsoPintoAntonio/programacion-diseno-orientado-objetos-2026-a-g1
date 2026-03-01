public class TarjetaTransporte {


    private String codigo;
    private double saldo;
    private boolean activa;


    public TarjetaTransporte(String codigo, double saldoInicial) {
        this.codigo = codigo;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido. Se asigna 0.");
        }

        this.activa = true;
    }
    // recarga
    public void recargar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Recarga exitosa.");
        } else {
            System.out.println("Monto inválido.");
        }
    }

    public void pagarPasaje(double valorPasaje) {
        if (valorPasaje > 0 && activa && saldo >= valorPasaje) {
            saldo -= valorPasaje;
            System.out.println("Pago realizado.");
        } else {
            System.out.println("No se pudo realizar el pago.");
        }
    }

    // NO LOGRE INGENIARMELAS
    public void activar() {
        activa = true;
    }

    public void desactivar() {
        activa = false;
    }

    public double getSaldo() {
        return saldo;
    }

    public void resumen() {
        System.out.println("Código: " + codigo);
        System.out.println("Saldo: " + saldo);
        System.out.println("Activa: " + activa);
        System.out.println("----------------------");
    }
}