package Eggs;

public class Hen implements Egg {
    @Override
    public void addEgg() {
        System.out.println("Hen egg has been created.");
    }
}
