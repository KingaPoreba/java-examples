public class StudentChecker {

    public static void main(String[] args) {

        String[] intArray = new String[3];

        Student firstPerson = new Student();
        firstPerson.imię = "Jarek";
        firstPerson.nazwisko = "Bochenek";
        firstPerson.numerIndeksu = 12;
        firstPerson.nick = "JA";
        firstPerson.email = "jarek@test.com";

        firstPerson.przedstawSię();
        firstPerson.zalogujSię();

        Student secondPerson = new Student();
        secondPerson.imię = "Marek";
        secondPerson.nazwisko = "Black";
        secondPerson.numerIndeksu = 1;
        secondPerson.nick = "KA";
        secondPerson.email = "ka@gmail.com";

        secondPerson.przedstawSię();
        secondPerson.zalogujSię();

        Student thirdPerson = new Student();
        thirdPerson.imię = "Darek";
        thirdPerson.nazwisko = "White";
        thirdPerson.numerIndeksu = 9;
        thirdPerson.nick = "DARO";
        thirdPerson.email = "daro.motylek.com";

        thirdPerson.przedstawSię();
        thirdPerson.zalogujSię();


        for (int i=0; i<intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}
