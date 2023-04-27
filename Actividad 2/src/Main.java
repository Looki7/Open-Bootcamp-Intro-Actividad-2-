
// Actividad 2

/* En este ejercicio practicarás las estructuras de control, para ello deberás crear:

    •	Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    •	Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:

    ◦	Incrementar el valor de la variable en uno cada vez que se ejecute.
    ◦	Mostrarlo por pantalla cada vez que se ejecute.

    •	Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

    •	Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la
        variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
        por pantalla.

    •	Por último, para el Switch, deberás crear la variable estación, y distintos case para las cuatro estaciones del
        año. Dependiendo del valor de la variable estación se deberá mandar un mensaje por consola informando de la
        estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una
        estación. */


public class Main {
    public static void main(String[] args) {

        // If

        int numeroIf = 2;

        if (numeroIf > 0) {
            System.out.println("La variable es positiva");
        } else if (numeroIf < 0) {
            System.out.println("La variable es negativa");
        } else {
            System.out.println("La variable es cero");
        }

        // Bucle While

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println("El valor de la variable en este bucle es " + numeroWhile);
            numeroWhile++;
        }

        // Bucle Do while

        int numeroDoWhile = 1;

        do {
            System.out.println("El valor de la variable en este bucle es " + numeroDoWhile);
            numeroDoWhile++;
        }

        while (numeroDoWhile < 3);

        // Bucle For

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El valor de la variable en este bucle es " + numeroFor);
        }

        // Switch case

        var estación = "Primavera";

        switch (estación) {
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
                System.out.println("El valor de la variable no es una estación");
        }

    }
}



