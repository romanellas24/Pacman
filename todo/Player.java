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
        switch (direction) {
            case UP:
                this.coordinates = new Coordinates(coordinates.getX(), coordinates.getY() - 1);
                break;
            case DOWN:
                this.coordinates = new Coordinates(coordinates.getX(), coordinates.getY() + 1);
                break;
            case LEFT:
                this.coordinates = new Coordinates(coordinates.getX() - 1, coordinates.getY());
                break;
            case RIGHT:
                this.coordinates = new Coordinates(coordinates.getX() + 1, coordinates.getY());
                break;
        }

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
