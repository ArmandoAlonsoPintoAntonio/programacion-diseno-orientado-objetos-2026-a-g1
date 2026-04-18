public class Docente extends Persona {
    private String area;

    public Docente(String documento, String nombre, String correo, String area) {
        super(documento, nombre, correo);

        if (area.isEmpty()) {
            throw new IllegalArgumentException("El área no puede estar vacía");
        }

        this.area = area;
    }

    public String fichaDocente() {
        return super.ficha() + "\nÁrea: " + area;
    }
}