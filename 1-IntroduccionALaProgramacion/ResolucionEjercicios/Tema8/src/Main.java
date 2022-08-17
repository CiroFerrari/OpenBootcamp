public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Ciro");
        persona.setEdad(30);
        persona.setTelefono(12345678);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }
}