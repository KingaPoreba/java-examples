public class ElseIf {
    public static void main(String[] args) {

        int number = 12;

        if (number == 0) {
            System.out.println("Liczba nie jest równa 0");
        }else if (number > 10) {
            System.out.println("Liczba jest większa niż 10");
        } else if (number < -5) {
            System.out.println("Liczba jest mniejsza niż -5");
        } else {
            System.out.println("Żaden warunek nie został spełniony");
        }
    }
}
