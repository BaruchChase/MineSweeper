package src;

public class Cell {

	/*
	This class represents the smallest component in the minesweeper game
	 */

	// cellVal may be a number between 0 and 9 inclusive, where 9 represents a mine
	int cellVal;
	enum CellState {COVERED, UNCOVERED, FLAGGED};
	CellState state;

	public Cell() {
		cellVal = 0;
		state = CellState.COVERED;
	}

	//
	public Cell(int specificVal, CellState specificState) {
		this.cellVal = specificVal;
		this.state = specificState;
	}

	public CellState getState() {
		return this.state;
	}

	public int getCellVal() {
		return this.cellVal;
	}

	public void setState(CellState newState) {
		this.state = newState;
	}

	public void setCellVal(int newCellVal) {
		this.cellVal = newCellVal;
	}

	public String toString() {
		return "Cell with a value of " + this.cellVal + " and a state of " + this.state;
	}
}
