import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = scanner.nextInt();

        Calculator calculator = new Calculator();

        int addition = calculator.addition(firstNumber, secondNumber);
        int mod = calculator.mod(firstNumber,secondNumber);
        int division = calculator.division (firstNumber, secondNumber);
        int multiplication = calculator.multiplication(firstNumber, secondNumber);
        int subtraction = calculator.subtraction(firstNumber, secondNumber);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Modulo: " + mod);
        System.out.println("Dzielenie:" + division);
        System.out.println("Mnożenie: " + multiplication);

    }
}
