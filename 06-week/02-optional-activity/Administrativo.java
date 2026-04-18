public class Administrativo extends Persona {
    private String cargo;

    public Administrativo(String documento, String nombre, String correo, String cargo) {
        super(documento, nombre, correo);

        if (cargo.isEmpty()) {
            throw new IllegalArgumentException("El cargo no puede estar vacío");
        }

        this.cargo = cargo;
    }

    public String fichaAdministrativo() {
        return super.ficha() + "\nCargo: " + cargo;
    }
}