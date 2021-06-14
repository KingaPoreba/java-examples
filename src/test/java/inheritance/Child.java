package inheritance;

public class Child extends Parent {

    public String eyeColor = "Brązowy";

    public void writeEyeColor() {
        System.out.println("Moj kolor oczu to : " + eyeColor);
    }

    public void writeHairColor() {
        System.out.println("Mój kolor włosów to : " + hairColor);
    }

    public void writeSkinType() {
        System.out.println("Mój kolor cery to: " + skinType);
    }

    public void writeTendencyToGainWeight() {
        System.out.println("Moje skłonności do tycia to " + tendencyToGainWeight);
    }

    @Override
    public void tryToSwimming() {
        System.out.println("Może mam zdolności do pływania, ale jeszcze jestem za mały, aby wchodzić do basenu");

    }


}
