package inheritance;

public abstract class Parent {

    protected String eyeColor = "Niebieski";
    protected String hairColor = "Brązowy";
    protected String skinType = "Jasna cera";
    protected boolean tendencyToGainWeight = true;
    protected void tryToSwim() {
        System.out.println("Mam zdolność do pywania");
    }


    public abstract void tryToSwimming();
}

