package Observer;

import java.util.Observable;
import java.util.Observer;

public class DuckOne implements Observer {
    public DuckOne(){}

    @Override
    public void update(Observable obj, Object arg) {
        if (arg instanceof Integer) {
            if (arg.equals(6)) {
                System.out.println("Eggs are ready!");
            }
        }
    }
}
