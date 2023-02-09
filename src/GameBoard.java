public class GameBoard {
	Cell [] board;
	int boardSize;
	int height;
	int length;
	int mineNumber;

	public GameBoard() {
		setHeightLengthAndMines(GameDifficulty.EASY);
		this.boardSize = this.height * this.length;
		this.board = new Cell[this.boardSize];
	}

	public GameBoard(GameDifficulty gameDifficulty) {
		setHeightLengthAndMines(gameDifficulty);
		this.boardSize = this.height * this.length;
		this.board = new Cell[this.boardSize];
	}

	private void setHeightLengthAndMines(GameDifficulty gameDifficulty) {
		if (gameDifficulty == GameDifficulty.EASY) {
			this.height = 8;
			this.length = 10;
			this.mineNumber = 10;
		}
		else if (gameDifficulty == GameDifficulty.MEDIUM) {
			//todo fix with correct numbers
			this.height = 14;
			this.length = 18;
			this.mineNumber = 40;
		}
		else if (gameDifficulty == GameDifficulty.HARD) {
			//todo fix with correct numbers
			this.height = 20;
			this.length = 24;
			this.mineNumber = 99;
		}
	}

	public int getHeight() {
		return this.height;
	}

	public int getLength() {
		return this.length;
	}

	public int getMineNumber() {
		return this.mineNumber;
	}

	/*
	todo find equation to access the data in a single array as if it were a 2d array
	 */
}
