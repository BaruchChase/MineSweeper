package src;

import java.util.Random;

public class GameModel {
    GameBoard gameBoard = new GameBoard();

    public void setUpMines(){
        //loop through the array with a random number connoting chance of mine
        //if higher than 25%, mine, continue, if less, mine
        int amountOfMines = gameBoard.getMineNumber();
        Random rand = new Random();
        for (int i = 0; i < gameBoard.boardSize; i++) {
            int mine = rand.nextInt(4);
            if(mine == 1){
                //todo Cell= Mine
            }
        }

    }
}
/*
while(amountOfMines != 0){
            int place = rand.nextInt(gameBoard.boardSize);
            //if place is empty, then make it a bomb
            //then mines--;
        }
 */