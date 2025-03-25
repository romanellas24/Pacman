package canvas;

import utils.Config;
import utils.Coordinates;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class TileDrawer extends JPanel {
    private final HashMap<Coordinates, Tile> tiles;
    private char[][] frame = null;

    public TileDrawer() {
        tiles = new HashMap<>();
        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++)
            for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++)
                tiles.put(new Coordinates(col, row), new Tile(col, row));

    }

    private Tile handleTile(int col, int row, char symbol) {
        switch (symbol) {
            case 'P':
                return new PlayerTile(col, row);
            default:
                return new Tile(col, row);
        }
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++)
            for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++) {
                if (tiles.get(new Coordinates(col, row)) != null)
                    tiles.get(new Coordinates(col, row)).draw(g);
            }
    }

    public void draw() {
        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++)
            for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++) {
                synchronized (tiles) {
                    tiles.replace(new Coordinates(col, row), new Tile(col, row));
                    if (frame != null && frame[row][col] != ' ')
                        tiles.replace(new Coordinates(col, row), handleTile(col, row, frame[row][col]));
                }
            }

    }

    public void sendFrame(char[][] frame) {
        this.frame = frame;
    }
}
