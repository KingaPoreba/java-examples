public class LoopsCheck {

    /* public static void main(String[] args) {
         for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " jest podzielna przez 3");
            } */


    public static void main(String[] args) {
        int[] numbers = new int[] {1,3,5,7,9};

        for (int i=0; i< (numbers.length/2); i++) {
            int temp = numbers[i]; //i=0 1 i=1 3
            numbers[i] = numbers[numbers.length-1-i]; //4-> 9 3->7
            numbers[numbers.length-1-i] = temp;
        }

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}




