public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "Klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 2340;

        mercedes.info();
        mercedes.hamuj();
        mercedes.jedz();

        Auto audi =new Auto();
        audi.marka = "Audi";
        audi.model = "A6";
        audi.rok = 2009;
        audi.przebieg = 10000;

        audi.info();
        audi.hamuj();
        audi.jedz();

        Auto noName = new Auto();

        noName.jedz();
        noName.hamuj();
        noName.info();

    }
}
