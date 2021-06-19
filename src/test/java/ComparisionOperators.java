import java.util.Scanner;

public class ComparisionOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Wprowadź drugą liczbę");
        int secondNumber = scanner.nextInt();

        boolean result = firstNumber > secondNumber;

        System.out.println(result); //false
        System.out.println(secondNumber < firstNumber); // false
        System.out.println(firstNumber > secondNumber); // false
        System.out.println(firstNumber <= secondNumber); // true
        System.out.println(firstNumber >= secondNumber); //false
        System.out.println(firstNumber != secondNumber); // true
        System.out.println(firstNumber == secondNumber); // false
    }
}
