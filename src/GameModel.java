package src;

import java.util.Random;

public class GameModel {
    GameBoard gameBoard = new GameBoard();

    public void setUpMines(){
        //loop through the array with a random number connoting chance of mine
        //if higher than 25%, mine, continue, if less, mine
        int amountOfMines = gameBoard.getMineNumber();
        Random rand = new Random();
        while(amountOfMines != 0){
            int place = rand.nextInt(gameBoard.boardSize);
            //if place is empty, then make it a bomb
            //then mines--;
        }
    }
}