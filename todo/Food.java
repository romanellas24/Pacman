package todo;

import abstracts.Drawable;
import utils.Coordinates;

public class Food extends Drawable {

    public Food(Coordinates coords) {
        this.coordinates = coords;
    }

    @Override
    public void update() {}

    @Override
    public char draw() {
        return 'f';
    }
}
