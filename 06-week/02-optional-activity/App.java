public class App {
    public static void main(String[] args) {

        Persona p1 = new Persona("123", "Carlos", "carlos@gmail.com");
        Docente d1 = new Docente("456", "Ana", "ana@gmail.com", "Matemáticas");
        Administrativo a1 = new Administrativo("789", "Luis", "luis@gmail.com", "Secretario");

        System.out.println("=== PERSONA ===");
        System.out.println(p1.ficha());

        System.out.println("\n=== DOCENTE ===");
        System.out.println(d1.fichaDocente());

        System.out.println("\n=== ADMINISTRATIVO ===");
        System.out.println(a1.fichaAdministrativo());
    }
}