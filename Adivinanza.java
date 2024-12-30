import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // Generar un número aleatorio entre 1 y 100
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego de adivinanzas.");
        System.out.println("Debes adivinar un número entre 1 y 100. Tienes 3 intentos.");

        do {
            System.out.println("\nIntento #" + (intentos + 1) + ": Ingresa tu número:");
            int numero = scanner.nextInt();
            intentos++;

            if (numero == numeroAleatorio) {
                System.out.println("¡Felicidades! Has adivinado el número.");
                adivinado = true;
                break;
            } else if (numero < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        } while (intentos < 3);

        if (!adivinado) {
            System.out.println("\nLo siento, has agotado todos tus intentos. El número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
