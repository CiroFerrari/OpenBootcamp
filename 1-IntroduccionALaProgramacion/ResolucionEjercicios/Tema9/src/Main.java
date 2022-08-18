public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.edad = 30;
        cliente.nombre = "Ciro";
        cliente.telefono = 12345678;
        cliente.credito = 87654321;

        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        Trabajador trabajador = new Trabajador();

        trabajador.edad = 31;
        trabajador.nombre = "Ferrari";
        trabajador.telefono = 87654321;
        trabajador.salario = 12345678;

        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}