package abstracts;

import utils.Coordinates;
import utils.DrawingInformation;

abstract public class Drawable {

    protected Coordinates coordinates;

    abstract public void update();
    abstract public DrawingInformation draw();
    public Coordinates getCoords() {
        return coordinates;
    }

}
