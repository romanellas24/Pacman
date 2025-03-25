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
        coords = switch (direction) {
            case UP -> new Coordinates(coordinates.getX() - 1, coordinates.getY());
            case DOWN -> new Coordinates(coordinates.getX() + 1, coordinates.getY());
            case LEFT -> new Coordinates(coordinates.getX(), coordinates.getY() - 1);
            case RIGHT -> new Coordinates(coordinates.getX(), coordinates.getY() + 1);
            default -> coords;
        };
        if (this.isPositionValid(coords))
            this.coordinates = coords;

        direction = Direction.STAY;
    }

    @Override
    public char draw() {
        return 'P';
    }

}
