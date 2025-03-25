package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;

public class Wall extends Drawable {


    public Wall(Coordinates coords) {
        this.coordinates = coords;
    }

    @Override
    public void update() {}

    @Override
    public char draw() {
        return 'w';
    }

}
