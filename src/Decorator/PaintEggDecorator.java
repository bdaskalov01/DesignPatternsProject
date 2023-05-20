package Decorator;

import Eggs.Egg;

public class PaintEggDecorator extends EggDecorator{
    public PaintEggDecorator (Egg decoratedEgg) {
        super(decoratedEgg);
    }

    private void setPaintDecoration() {
        System.out.println("The egg has been painted.");
    }

    @Override
    public void addEgg() {
        decoratedEgg.addEgg();
        setPaintDecoration();
    }
}
