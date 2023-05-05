package Utility;

import java.util.Random;

public class RNG {
    Random random = new Random();

    public RNG(){};
    public int eggType () {
        return random.nextInt(3) + 1;
    }

    public int decorationType () {
        return random.nextInt(2) + 1;
    }
}
