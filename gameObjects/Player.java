package gameObjects;

import abstracts.Controllable;
import utils.Coordinates;
import utils.Direction;
import utils.DrawingInformation;

import java.awt.*;

public class Player extends Controllable {

    private Direction direction;
    private Coordinates previousCoordinates;
    private boolean isWinner;
    private boolean isLooser;

    public Player(Coordinates coordinates) {
        direction = Direction.STAY;
        this.coordinates = coordinates;
        this.previousCoordinates = coordinates;
        this.isWinner = false;
        this.isLooser = false;
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

        if (Coordinates.isPositionValid(coords)) {
            if(!coords.equals(this.previousCoordinates))
                this.previousCoordinates = this.coordinates;
            this.coordinates = coords;
        }


        direction = Direction.STAY;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public boolean isLooser() {
        return isLooser;
    }

    public void markAsWinner() {
        this.isWinner = true;
    }

    public void markAsLooser(){
        this.isLooser = true;
    }

    @Override
    public DrawingInformation draw() {
        return new DrawingInformation('P', Color.YELLOW);
    }

    public void resetCoordinates() {
        this.coordinates = previousCoordinates;
    }

}
