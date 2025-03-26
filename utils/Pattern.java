package utils;

public class Pattern {
    private int width;
    private int height;
    private char[][] pattern;

    public Pattern(int width, int height, char[][] pattern) {
        this.width = width;
        this.height = height;
        this.pattern = pattern;
    }

    public void rotate90degrees() {
        char[][] tmp = new char[height][width];
        for (int row = 0; row < height; row++)
            for (int col = 0; col < width; col++)
                tmp[col][row] = pattern[col][row];

        for (int i = 0; i < height; i++)
            copyRowIntoColumn(i, tmp, this.pattern);
    }

    private void copyRowIntoColumn(int row_index, char[][] src, char[][] dest) {
        for (int iterator = 0; iterator < width; iterator++)
            dest[iterator][(width - 1) - row_index] = src[row_index][iterator];
    }


}
