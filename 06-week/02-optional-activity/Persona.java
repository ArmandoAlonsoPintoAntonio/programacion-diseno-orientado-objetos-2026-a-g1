public class Persona {
    protected String documento;
    protected String nombre;
    protected String correo;

    public Persona(String documento, String nombre, String correo) {
        if (documento.isEmpty() || nombre.isEmpty()) {
            throw new IllegalArgumentException("Documento y nombre no pueden estar vacíos");
        }
        if (!correo.contains("@")) {
            throw new IllegalArgumentException("Correo inválido");
        }

        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String ficha() {
        return "Documento: " + documento +
               "\nNombre: " + nombre +
               "\nCorreo: " + correo;
    }
}