package gameObjects;

import abstracts.Drawable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ghost extends Drawable {

    private ArrayList<Direction> availDirections; //Here avail directions
    private Direction followDirection;

    public Ghost(Coordinates coords) {
        this.coordinates = coords;
        this.availDirections = new ArrayList<>();
        followDirection = Direction.STAY;
    }

    public void setAvailDirections(ArrayList<Direction> availDirections) {
        this.availDirections = availDirections;
    }

    @Override
    public void update() {
        Direction direction = chooseDirection();
        if (direction == Direction.getOpposite(followDirection) && isDirectionValid(followDirection))
            direction = followDirection;
        followDirection = direction;
        moveAlongFollowingDirection();
    }

    private void moveAlongFollowingDirection() {
        Coordinates coords = this.coordinates;
        switch (followDirection) {
            case UP:
                coords = new Coordinates(coordinates.getRow() - 1, coordinates.getCol());
                break;
            case DOWN:
                coords = new Coordinates(coordinates.getRow() + 1, coordinates.getCol());
                break;
            case LEFT:
                coords = new Coordinates(coordinates.getRow(), coordinates.getCol() - 1);
                break;
            case RIGHT:
                coords = new Coordinates(coordinates.getRow(), coordinates.getCol() + 1);
                break;
        }
        this.coordinates = coords;
    }

    private boolean isDirectionValid(Direction dir) {
        for (Direction direction : availDirections)
            if (direction == dir)
                return true;
        return false;
    }

    private Direction chooseDirection() {
        int rnd = new Random().nextInt(availDirections.size());
        return availDirections.get(rnd);
    }

    @Override
    public DrawingInformation draw() {
        return new DrawingInformation('G', Color.RED);
    }
}
