package boardgame;

public class Position {
	// é uma classe da camada de tabueiro e representa uma posiçao no tabuleiro, ela vai ter linha e coluna
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	
	public String toString() {
		return row + ", " + column;
	}

}
