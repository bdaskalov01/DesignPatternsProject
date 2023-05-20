package Factory;

import Eggs.*;

public class EggFactory {
    public Egg getShape(String shapeType){

        if(shapeType.equalsIgnoreCase("DINO")){
            return new Dino();

        }
        else if(shapeType.equalsIgnoreCase("HEN")){
            return new Hen();

        }
        else if(shapeType.equalsIgnoreCase("QUAIL")){
            return new Quail();
        }

        else if(shapeType == null){
            return null;
        }

        return null;
    }
}
