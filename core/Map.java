package core;

import gameObjects.Wall;
import utils.Config;
import utils.Coordinates;

import java.util.LinkedList;

public class Map {
    private final LinkedList<Wall> walls;

    public Map() {
        walls = new LinkedList<>();
        for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++) {
            walls.add(new Wall(new Coordinates(0, col)));
            walls.add(new Wall(new Coordinates(Config.TILE_HEIGHT_LENGTH - 1, col)));
        }

        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++) {
            walls.add(new Wall(new Coordinates(row, 0)));
            walls.add(new Wall(new Coordinates(row, Config.TILE_WIDTH_LENGTH - 1)));
        }

        int seedX = 2;
        int seedY = 2;
        walls.add(new Wall(new Coordinates(seedX, seedY)));
        walls.add(new Wall(new Coordinates(seedX, seedY + 1)));
        walls.add(new Wall(new Coordinates(seedX, seedY + 2)));
        walls.add(new Wall(new Coordinates(seedX, seedY + 3)));
        walls.add(new Wall(new Coordinates(seedX + 1, seedY)));
        walls.add(new Wall(new Coordinates(seedX + 2, seedY)));
        walls.add(new Wall(new Coordinates(seedX + 3, seedY)));


        seedX = 2;
        seedY = 37;
        walls.add(new Wall(new Coordinates(seedX, seedY)));
        walls.add(new Wall(new Coordinates(seedX, seedY - 1)));
        walls.add(new Wall(new Coordinates(seedX, seedY - 2)));
        walls.add(new Wall(new Coordinates(seedX, seedY - 3)));
        walls.add(new Wall(new Coordinates(seedX + 1, seedY)));
        walls.add(new Wall(new Coordinates(seedX + 2, seedY)));
        walls.add(new Wall(new Coordinates(seedX + 3, seedY)));

        seedX = 27;
        seedY = 2;
        walls.add(new Wall(new Coordinates(seedX, seedY)));
        walls.add(new Wall(new Coordinates(seedX, seedY + 1)));
        walls.add(new Wall(new Coordinates(seedX, seedY + 2)));
        walls.add(new Wall(new Coordinates(seedX, seedY + 3)));
        walls.add(new Wall(new Coordinates(seedX - 1, seedY)));
        walls.add(new Wall(new Coordinates(seedX - 2, seedY)));
        walls.add(new Wall(new Coordinates(seedX - 3, seedY)));

        seedX = 27;
        seedY = 37;
        walls.add(new Wall(new Coordinates(seedX, seedY)));
        walls.add(new Wall(new Coordinates(seedX, seedY - 1)));
        walls.add(new Wall(new Coordinates(seedX, seedY - 2)));
        walls.add(new Wall(new Coordinates(seedX, seedY - 3)));
        walls.add(new Wall(new Coordinates(seedX - 1, seedY)));
        walls.add(new Wall(new Coordinates(seedX - 2, seedY)));
        walls.add(new Wall(new Coordinates(seedX - 3, seedY)));

        seedY = 7; //Da 7 a 19
        int limY = 19;
        for (int col = seedY; col < limY; col++) {
            walls.add(new Wall(new Coordinates(2, col)));
            walls.add(new Wall(new Coordinates(2, col + 14)));
            walls.add(new Wall(new Coordinates(27, col)));
            walls.add(new Wall(new Coordinates(27, col + 14)));
        }

        int limX = 23;
        for (int row = 7; row < limX; row++) {
            walls.add(new Wall(new Coordinates(row, 2)));
            walls.add(new Wall(new Coordinates(row, 37)));
        }

    }

    public LinkedList<Wall> getWalls() {
        return walls;
    }
}
