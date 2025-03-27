package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.DrawingInformation;

import java.awt.*;

public class Food extends Drawable {

    private boolean isDeleted;

    public Food(Coordinates coords) {
        this.coordinates = coords;
        this.isDeleted = false;
    }

    @Override
    public void update() {}

    @Override
    public DrawingInformation draw() {
        if(!isDeleted())
            return new DrawingInformation('f', Color.ORANGE) ;
        return new DrawingInformation(' ', Color.BLACK) ;
    }

    public void markAsDeleted() {
        isDeleted = true;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

}
