package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.DrawingInformation;

import java.awt.*;

public class Wall extends Drawable {


    public Wall(Coordinates coords) {
        this.coordinates = coords;
    }

    @Override
    public void update() {}

    @Override
    public DrawingInformation draw() {
        return new DrawingInformation('w', new Color(0, 34, 150));
    }

}
