public class main {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Cell cell = new Cell(3, Cell.CellState.COVERED);
		System.out.println(cell.cellVal);
		System.out.println(cell.getCellVal());
		System.out.println(cell.state);
		cell.setState(Cell.CellState.UNCOVERED);
		System.out.println(cell.state);
	}
}
