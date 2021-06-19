import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz swój wiek");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Jesteś niepełnoletni, nie możesz kupić alkoholu!");

        } else {
            System.out.println("Dziękujemy za zakupy, zapraszamy ponownie!");
        }
    }
}



