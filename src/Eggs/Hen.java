package Eggs;

public class Hen implements Egg {
    @Override
    public void addEgg() {
        System.out.println("Egg type: Hen");
    }
}
