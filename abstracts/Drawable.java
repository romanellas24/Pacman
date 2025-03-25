package abstracts;

import utils.Coordinates;

abstract public class Drawable {

    protected Coordinates coordinates;

    abstract public void update();
    abstract public char draw();
    abstract public Coordinates getCoords();

}
