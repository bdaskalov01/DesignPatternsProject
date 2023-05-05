package Decorator;

import Eggs.*;
public abstract class EggDecorator implements Egg{
    protected Egg decoratedEgg;

    public EggDecorator(Egg decoratedEgg) {
        this.decoratedEgg = decoratedEgg;
    }

    public void addEgg() {
        decoratedEgg.addEgg();
        // TODO Return egg object
    }
}
