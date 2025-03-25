package canvas;

import utils.Config;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class TileDrawer extends JPanel {
    private final LinkedList<Tile> tiles;
    private char[][] frame = null;

    public TileDrawer() {
        tiles = new LinkedList<>();
        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++)
            for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++)
                synchronized (tiles) {
                    tiles.add(new Tile(col, row));
                }

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
        for (Tile tile : tiles) {
            tile.draw(g);
        }
    }

    public void draw() {
        for (int row = 0; row < Config.TILE_HEIGHT_LENGTH; row++)
            for (int col = 0; col < Config.TILE_WIDTH_LENGTH; col++) {
                synchronized (tiles) {
                    tiles.add(new Tile(col, row));
                    if (frame != null && frame[row][col] != ' ')
                        tiles.add(handleTile(col, row, frame[row][col]));
                }
            }

    }

    public void sendFrame(char[][] frame) {
        this.frame = frame;
    }
}
