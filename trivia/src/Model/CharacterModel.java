package Model;

public class CharacterModel {

    int row;
    int col;

    public CharacterModel (int initialRow, int initialCol) {
        this.row = initialRow;
        this.col = initialCol;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void moveUp() {
        if (row> 0)
        row--;
    }

    public void moveDown() {
        if (row < 4) {
            row++;
        }
    }

    public void moveLeft() {
        if(col > 0)
        col--;
    }

    public void moveRight() {
        if(col < 4)
        col++;
    }
}

