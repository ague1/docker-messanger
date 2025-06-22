import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int attempts = 0;
        //int numeroAletorio = (int)(Math.random()*10); Esta es otra forma de poder generar un numero aleatorio
        int numeroAletorio = new Random().nextInt(10);
        System.out.println("Adivina el numero");
        Scanner scanner = new Scanner(System.in);
        System.out.println(numeroAletorio);
        while (attempts < 5){
            System.out.println("Ingresa un numero :");
            int numero = scanner.nextInt();
            attempts ++;
            if (numero == numeroAletorio) {
                System.out.println("Adivinaste el numero\n");
                break;
            }else if ( numero < numeroAletorio){
                System.out.println("Tu numero es menor\n");
            }else {
                System.out.println("numero es mayor\n");
            }
        }
        if (attempts == 5) {
            System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era " + numeroAletorio);
        }
    }
}