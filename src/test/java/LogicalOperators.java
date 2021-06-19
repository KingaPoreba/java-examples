public class LogicalOperators {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = false;
        boolean fourthValue = true;

        // && -> true wtedy  gdy wyrażenia składowe są równe true
        System.out.println(firstValue && secondValue); //false
        System.out.println(firstValue && fourthValue); //true
        System.out.println(secondValue && thirdValue); //false

        // || lub -> true gdy jedno wyrażenie skadowe jest równe true

        System.out.println(firstValue || secondValue); //true
        System.out.println(firstValue || fourthValue); //true
        System.out.println(secondValue || thirdValue); //false

        // ! negacja - zwraca wartość przeciwną do wyrażenia przed którą się znajduje
        System.out.println(!firstValue); // false
        System.out.println(!secondValue); // true
        System.out.println(!thirdValue); // true
        System.out.println(!fourthValue); // false


    }
}
