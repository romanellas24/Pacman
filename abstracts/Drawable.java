package abstracts;

import utils.Coordinates;

abstract public class Drawable {

    protected Coordinates coordinates;

    abstract public void update();
    abstract public char draw();
    public Coordinates getCoords() {
        return coordinates;
    }

}
