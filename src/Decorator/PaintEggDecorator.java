package Decorator;

import Eggs.Egg;

public class PaintEggDecorator extends EggDecorator{
    public PaintEggDecorator (Egg decoratedEgg) {
        super(decoratedEgg);
    }

    private void setPaintDecoration() {
        System.out.println("Decoration Type: Paint");
    }

    @Override
    public void addEgg() {
        decoratedEgg.addEgg();
        setPaintDecoration();
    }
}
