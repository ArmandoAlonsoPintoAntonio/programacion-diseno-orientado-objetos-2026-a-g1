public class App {

    public static void main(String[] args) {


        // SE DA USO AL ACCION NEW
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        // SE REALIZAN LAS REFERENCAIS
        p2 = p1;

        System.out.println("Después de p2 = p1");
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        // NO SE TIENE UN VALOR, PARA ESO NULL
        Producto pNull = null;
        System.out.println("pNull: " + pNull);

        // SE COMPREDIO COMO QEU SE CREARA PARA IMPRIMIR EL NULL, QEU NO HACE REFERENCIA A NADA
    }
}