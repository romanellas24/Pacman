package utils;

public class Config {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 600;
    public static final int TILE_DIMENSION = 20;
    public static final int TILE_WIDTH_LENGTH = WINDOW_WIDTH / TILE_DIMENSION;
    public static final int TILE_HEIGHT_LENGTH = WINDOW_HEIGHT / TILE_DIMENSION;
    public static final Coordinates MIDDLE_COORDINATES = new Coordinates(TILE_HEIGHT_LENGTH / 2, TILE_WIDTH_LENGTH / 2);
}
