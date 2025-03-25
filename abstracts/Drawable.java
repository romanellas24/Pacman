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

    protected boolean isPositionValid(Coordinates coordinates) {
        if(coordinates.getX() < 0) return false;
        if(coordinates.getY() < 0) return false;
        if(coordinates.getX() >= Config.TILE_HEIGHT_LENGTH) return false;
        return coordinates.getY() < Config.TILE_WIDTH_LENGTH;
    }

}
