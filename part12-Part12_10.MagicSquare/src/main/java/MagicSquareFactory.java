public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {
        
        MagicSquare square = new MagicSquare(size);
        int number = 1;
        int row = 0;
        int col = size / 2;
        int currRow;
        int currCol;

        while (number <= size * size) {
            // place number in the current cell
            square.placeValue(col, row, number);
            number++;
            
            // move up and to the right
            currRow = row - 1;
            currCol = col + 1;
            
            // wrap around the top edge to the bottom
            if (currRow < 0) {
                currRow = size - 1;
            }
            
            // wrap around the right edge to the left
            if (currCol == size) {
                currCol = 0;
            }
            
            // if the cell is already filled or if we're at an edge, move down
            if (square.readValue(currCol, currRow) != 0) {
                row++;
                // if moving down goes off the bottom, warp to the top
                if (row == size) {
                    row = 0;
                }
            } else {
                // if the cell is not filled, take the next position we calculated
                row = currRow;
                col = currCol;
            }
        }

        return square;
    }
}