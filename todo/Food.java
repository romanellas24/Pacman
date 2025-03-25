package todo;

import abstracts.Drawable;
import utils.Coordinates;

public class Food extends Drawable {

    private boolean isDeleted;

    public Food(Coordinates coords) {
        this.coordinates = coords;
        this.isDeleted = false;
    }

    @Override
    public void update() {}

    @Override
    public char draw() {
        if(!isDeleted())
            return 'f';
        return ' ';
    }

    public void markAsDeleted() {
        isDeleted = true;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

}
