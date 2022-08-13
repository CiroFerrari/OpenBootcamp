public class Main {
    public static void main(String[] args) {

        // Ejercicio 1 IF
        var numeroIf = 8;

        if( numeroIf > 0) {
            System.out.println("El número es positivo");
        } else if (numeroIf<0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Ejercicio 2 WHILE
        int numeroWhile = 0;

        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Ejercicio 3 DO-WHILE
        int numeroDoWhile = 3;

        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroDoWhile<3);

        // Ejercicio 4 FOR
        for( int numeroFor = 0 ; numeroFor <= 3 ; numeroFor++ ) {
            System.out.println(numeroFor);
        }

        // Ejercicio 5 SWITCH
        var estacion = "Primavera";

        switch (estacion) {
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}