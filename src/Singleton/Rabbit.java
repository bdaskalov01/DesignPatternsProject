package Singleton;

import Decorator.PaintEggDecorator;
import Factory.EggFactory;
import Eggs.Egg;
import Decorator.StickerEggDecorator;
import Observer.Basket;
import Utility.RNG;
import Observer.*;
import java.util.Observer;
import java.util.Observable;

public class Rabbit {
    private static Rabbit rabbit = new Rabbit();

    private Rabbit(){};

    public static Rabbit getInstance() {
        return rabbit;
    }

    EggFactory eggFactory = new EggFactory();

    // TODO function to create egg
    Egg egg1 = eggFactory.getShape("DINO");

    public Egg createEgg() {
        RNG rng = new RNG();
        Egg egg;
        int typeOfEgg = rng.eggType();

        switch(typeOfEgg) {
            case 1:
                egg = eggFactory.getShape("DINO");
                return egg;
            case 2:
                egg = eggFactory.getShape("HEN");
                return egg;
            case 3:
                egg = eggFactory.getShape("QUAIL");
                return egg;
        }
        return null;
    }


    // TODO function to decorate egg
    Egg decoratedEgg1 = new StickerEggDecorator(egg1);

    public void decorateEgg(Egg egg) {
        RNG rng = new RNG();
        Egg decoratedEgg;
        int typeOfDecoration = rng.decorationType();

        switch(typeOfDecoration) {
            case 1:
                decoratedEgg = new StickerEggDecorator(egg);
                decoratedEgg.addEgg();
                break;
            case 2:
                decoratedEgg = new PaintEggDecorator(egg);
                decoratedEgg.addEgg();
                break;
        }
    }

    /*
    public Egg getDecoratedEgg1() {
        return decoratedEgg1;
    }

    public void setDecoratedEgg1(Egg decoratedEgg1) {
        this.decoratedEgg1 = decoratedEgg1;
    }
     */

}
