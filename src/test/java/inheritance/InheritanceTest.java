package inheritance;

import org.testng.annotations.Test;

public class InheritanceTest {

    @Test
    public void testInheritance() {
        Child child = new Child();
        child.writeHairColor();
        child.writeEyeColor();
        child.writeSkinType();
        child.writeTendencyToGainWeight();
        child.tryToSwimming();


    }
}
