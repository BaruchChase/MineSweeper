public class GameBoard {
	Cell[] board;
	int boardSize;
	int height;
	int length;
	int mineNumber;

	public GameBoard() {
		setHeightLengthAndMines(GameDifficulty.EASY);
		this.boardSize = this.height * this.length;
		this.board = new Cell[this.boardSize];
		populate(this.length,this.height);
	}

	private void populate(int length, int height) {
		// fill the simulated 2D array with some values
		for (int row = 0; row < length; row++) {
			for (int col = 0; col < height; col++) {
				this.board[row * height + col] = new Cell();
			}
		}
	}

// function to get the value at (row, col) in the simulated 2D array (found with chatgpt)
		public Cell getValue(Cell[] board, int row, int col, int height) {
			return board[row * height + col];
		}

// function to set the value at (row, col) in the simulated 2D array (found with chatgpt)
		public void setValue(Cell[] board, int row, int col, int height, Cell cell) {
			board[row * height + col] = cell;
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
			this.height = 14;
			this.length = 18;
			this.mineNumber = 40;
		}
		else if (gameDifficulty == GameDifficulty.HARD) {
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

}
