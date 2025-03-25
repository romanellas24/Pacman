package todo;

import abstracts.Controllable;
import utils.Coordinates;
import utils.Direction;

public class Player extends Controllable {

    private Direction direction;

    public Player(Coordinates coordinates) {
        direction = Direction.STAY;
        this.coordinates = coordinates;
    }

    @Override
    public void move(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void update() {
        Coordinates coords = coordinates;
        switch (direction) {
            case UP:
                coords = new Coordinates(coordinates.getX() - 1, coordinates.getY());
                break;
            case DOWN:
                coords = new Coordinates(coordinates.getX() + 1, coordinates.getY());
                break;
            case LEFT:
                coords = new Coordinates(coordinates.getX(), coordinates.getY() - 1);
                break;
            case RIGHT:
                coords = new Coordinates(coordinates.getX(), coordinates.getY() + 1);
                break;
        }
        if (this.isPositionValid(coords))
            this.coordinates = coords;

        direction = Direction.STAY;
    }

    @Override
    public char draw() {
        return 'P';
    }

    @Override
    public Coordinates getCoords() {
        return this.coordinates;
    }
}
