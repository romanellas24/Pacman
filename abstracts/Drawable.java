package abstracts;

import utils.Config;
import utils.Coordinates;

abstract public class Drawable {

    protected Coordinates coordinates;

    abstract public void update();
    abstract public char draw();
    public Coordinates getCoords() {
        return coordinates;
    }

}
