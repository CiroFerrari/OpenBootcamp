public class Main {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma( 10, 20, 30);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int puertas = 4;

    public void SumarPuerta() {
        this.puertas--;
    }
}

