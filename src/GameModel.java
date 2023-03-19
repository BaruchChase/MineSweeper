import java.util.Random;

public class GameModel {
    GameBoard gameBoard = new GameBoard();
    boolean isFirstMove = true;

    public void setUpMines(){
        //loop through the array with a random number connoting chance of mine
        //25% chance of a cell being a mine (until all mines are out)
        int totalNumberOfMines = gameBoard.getMineNumber();
        Random rand = new Random();

        //make sure all the mines are placed by restarting the loop if there are still mines
        while(totalNumberOfMines != 0) {
            for (int i = 0; i < gameBoard.boardSize; i++) {
                int mine = rand.nextInt(4);

                /*
                checks for 3 things:
                1. if the random int is a mine
                2. making sure it's not being placed on a mine
                3. making sure it's not being placed on the first cell clicked, which is now uncovered
                 */
                if ( (mine == 0) && (gameBoard.board[i].getCellVal() != 9) && (!gameBoard.board[i].getState().equals(Cell.CellState.UNCOVERED))) {

                    //9 indicates a bomb because that is a number that can't appear
                    gameBoard.board[i].setCellVal(9);
                    totalNumberOfMines--;
                }
            }
        }

    }

    public void MakeMove(int row, int col){
        gameBoard.getValue(row,col).setState(Cell.CellState.UNCOVERED);
        if(isFirstMove){
            firstMove();
        }

    }

    private void firstMove() {
        setUpMines();
        isFirstMove = false;
    }

    // todo add function to prevent first clicked cell becoming a mine
    // this means first click cell is logged and then the method tests to see if current cell === starter if not then
    // proceed with the random number check
    // todo method to handle cell clicks which reads the neighboring cells and the sets the current cell val equal to its surroundings
}