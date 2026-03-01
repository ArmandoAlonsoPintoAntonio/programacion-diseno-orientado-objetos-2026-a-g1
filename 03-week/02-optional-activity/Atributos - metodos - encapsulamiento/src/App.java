public class App {

    public static void main(String[] args) {

        TarjetaTransporte tarjeta = new TarjetaTransporte("T001", 10000);

        System.out.println("=== ESTADO INICIAL ===");
        tarjeta.resumen();

        System.out.println("=== PAGO VÁLIDO ===");
        tarjeta.pagarPasaje(3000);
        tarjeta.resumen();

        System.out.println("=== PAGO INVÁLIDO ===== " +
                "saldo insuficiente ===");
        tarjeta.pagarPasaje(20000);
        tarjeta.resumen();

        System.out.println("=== RECARGA VÁLIDA ===");
        tarjeta.recargar(5000);
        tarjeta.resumen();

        System.out.println("=== DESACTIVAR TARJETA ===");
        tarjeta.desactivar();
        tarjeta.pagarPasaje(2000);
        tarjeta.resumen();
    }
}