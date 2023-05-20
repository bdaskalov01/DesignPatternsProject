package Observer;

import java.util.Observable;
import lombok.*;

@Getter
@Setter
public class    Basket extends Observable {
    private int eggsCount;

    public Basket() {}

    public void setEggsCount(int eggsCount) {
        this.eggsCount = eggsCount;
    }

    public int getEggsCount() {
        return this.eggsCount;
    }
    public void increaseCount() {
        this.eggsCount++;
        setChanged();
        System.out.println("Amount of eggs in the basket: " + eggsCount);
        notifyObservers(eggsCount);
    }
}
