package Observer;

import java.util.Observable;
import lombok.*;

@Getter
@Setter
public class    Basket extends Observable {
    //private ArrayList<Egg> eggBasket = new ArrayList<Egg>();
    private int eggsCount;

    public Basket() {}

    public void setEggsCount(int eggsCount) {
        this.eggsCount = eggsCount;
    }
    public void increaseCount() {
        this.eggsCount++;
        setChanged();
        System.out.println("Брой яйца в кошницата: " + eggsCount);
        notifyObservers(eggsCount);
    }
}
