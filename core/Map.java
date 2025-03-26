package core;

import gameObjects.Wall;
import utils.Config;
import utils.Coordinates;
import utils.Pattern;

import java.util.LinkedList;

public class Map {
    private final LinkedList<Wall> walls;

    private final Pattern[] patterns;

    public Map() {
        walls = new LinkedList<>();
        patterns = new Pattern[]{
                new Pattern(3, 3, new char[][]{
                        {'w', 'w', 'w'},
                        {'w', ' ', ' '},
                        {'w', ' ', 'w'},
                }),
                new Pattern(3, 3, new char[][]{
                        {'w', ' ', 'w'},
                        {' ', ' ', ' '},
                        {'w', ' ', 'w'},
                }),
                new Pattern(3, 3, new char[][]{
                        {'w', 'w', 'w'},
                        {' ', ' ', ' '},
                        {'w', ' ', 'w'},
                }),
                new Pattern(3, 3, new char[][]{
                        {'w', 'w', 'w'},
                        {' ', ' ', ' '},
                        {'w', 'w', 'w'},
                }),
                /*
                new Pattern(3, 3, new char[][]{
                        {'w', 'w', 'w'},
                        {' ', ' ', 'w'},
                        {'w', 'w', 'w'},
                }),
                 */
        };

        for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++) {
            walls.add(new Wall(new Coordinates(0, col)));
            walls.add(new Wall(new Coordinates(Config.TILE_HEIGHT_LENGTH - 1, col)));
        }

        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++) {
            walls.add(new Wall(new Coordinates(row, 0)));
            walls.add(new Wall(new Coordinates(row, Config.TILE_WIDTH_LENGTH - 1)));
        }




    }

    public LinkedList<Wall> getWalls() {
        return walls;
    }
}
