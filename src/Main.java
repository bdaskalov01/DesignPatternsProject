import Eggs.Egg;
import Singleton.Rabbit;
import Observer.*;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Basket basket = new Basket();
        DuckOne DuckOne = new DuckOne();
        DuckTwo DuckTwo = new DuckTwo();
        DuckThree DuckThree = new DuckThree();

        basket.setEggsCount(0);

        basket.addObserver(DuckOne);
        basket.addObserver(DuckTwo);
        basket.addObserver(DuckThree);
        
        Rabbit rabbit = Rabbit.getInstance();

        for (int i = 0; i < 10; i++) {
            Egg egg = rabbit.createEgg();
            rabbit.decorateEgg(egg);
            basket.increaseCount();
        }
    }
}