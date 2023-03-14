import java.util.Random;

public class GameModel {
    GameBoard gameBoard = new GameBoard();

    public void setUpMines(){
        //loop through the array with a random number connoting chance of mine
        //25% chance of a cell being a mine
        int amountOfMines = gameBoard.getMineNumber();
        Random rand = new Random();
        //make sure all the mines are placed by restarting the loop if there are still mines
        while(amountOfMines != 0) {
            for (int i = 0; i < gameBoard.boardSize; i++) {
                int mine = rand.nextInt(4);
                //if this is a second round of placement, make sure it's not being placed in the same spot.
                if (mine == 1 && gameBoard.board[i].getCellVal() != 9) {
                    //A 9 indicates a bomb because that is a number that can't appear
                    gameBoard.board[i].setCellVal(9);
                    amountOfMines--;
                }
            }
        }

    }
}