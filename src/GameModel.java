import java.util.Random;

public class GameModel {
    GameBoard gameBoard = new GameBoard();

    public void setUpMines(){
        //loop through the array with a random number connoting chance of mine
        //25% chance of a cell being a mine (until all mines are out)
        int totalNumberOfMines = gameBoard.getMineNumber();
        Random rand = new Random();

        //make sure all the mines are placed by restarting the loop if there are still mines
        while(totalNumberOfMines != 0) {
            for (int i = 0; i < gameBoard.boardSize; i++) {
                int mine = rand.nextInt(4);

                //if this is a second round of placement, make sure it's not being placed in the same spot.
                if (mine == 0 && gameBoard.board[i].getCellVal() != 9) {

                    //9 indicates a bomb because that is a number that can't appear
                    gameBoard.board[i].setCellVal(9);
                    totalNumberOfMines--;
                }
            }
        }

    }

    // todo add function to prevent first clicked cell becoming a mine
    // this means first click cell is logged and then the method tests to see if current cell === starter if not then
    // proceed with the random number check
    // todo method to handle cell clicks which reads the neighboring cells and the sets the current cell val equal to its surroundings
}