import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Envio> envios = new ArrayList<>();

        envios.add(new EnvioEstandar("E1", 2));
        envios.add(new EnvioExpress("E2", 1.5));
        envios.add(new EnvioInternacional("E3", 3, "México"));

        double total = 0;

        for (Envio e : envios) {
            double costo = e.calcularCosto(); // 🔥 POLIMORFISMO
            System.out.println("=== ENVÍO ===");
            System.out.println(e.resumen());
            System.out.println("Costo: $" + costo + "\n");

            total += costo;
        }

        System.out.println("TOTAL ENVÍOS: $" + total);
    }
}