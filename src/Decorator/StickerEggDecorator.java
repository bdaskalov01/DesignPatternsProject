package Decorator;

import Eggs.*;
public class StickerEggDecorator extends EggDecorator{
    public StickerEggDecorator (Egg decoratedEgg) {
        super(decoratedEgg);
    }

    private void setStickerDecoration() {
        System.out.println("Sticker has been applied to the egg.");
    }

    @Override
    public void addEgg() {
        decoratedEgg.addEgg();
        setStickerDecoration();
    }
}
