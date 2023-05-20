import Eggs.Egg;
import Singleton.Rabbit;
import Observer.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean createMoreEggs = true;
        Scanner scannerInput = new Scanner(System.in);
        String userChoice;

        Basket basket = new Basket();
        DuckOne DuckOne = new DuckOne();
        DuckTwo DuckTwo = new DuckTwo();
        DuckThree DuckThree = new DuckThree();

        basket.setEggsCount(0);

        basket.addObserver(DuckOne);
        basket.addObserver(DuckTwo);
        basket.addObserver(DuckThree);
        
        Rabbit rabbit = Rabbit.getInstance();

        while (createMoreEggs) {
            System.out.println("Would you like to create an egg?");
            System.out.println("Yes / No");
            userChoice = scannerInput.next();
            if (userChoice.equalsIgnoreCase("Yes")) {
                Egg egg = rabbit.createEgg();
                rabbit.decorateEgg(egg);
                basket.increaseCount();
                System.out.println("--------------------------------");

            }
            else if (userChoice.equalsIgnoreCase("No")) {
                System.out.printf("The magic basket has disappeared.");
                createMoreEggs = false;
            }
            else {
                System.out.println("Invalid answer. Please answer with either Yes or No.");
                System.out.println("--------------------------------");
            }
        }
    }
}