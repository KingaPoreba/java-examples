import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int modulo = firstNumber % secondNumber;

        System.out.println("Wynik dodawania to: " + addition);
        System.out.println("Wynik odejmowania to: " + subtraction);
        System.out.println("Wynik mnożenia to: " + multiplication);
        System.out.println("Wynik dzielenia to: " + division);
        System.out.println("Wynik modulo to: " + modulo);
    }
}
