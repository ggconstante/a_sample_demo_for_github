/**
 * Programmer: Gingrefel G.Constante
 *
 * Date: 01/19/2013
 *
 * This class has all needed methods as stubs. Comments explain each method.
 *
 */
public class GameOfLife {

	//these are my private instance variables 

	private int rowCount;
	private int colCount;
	private int  [][]gameGrid;

	/**
	 * Write the constructor so it takes two integer arguments to represent the
	 * number of rows and columns in the game of life. The constructor creates a
	 * society with no cells but space to store rows*cols cells.
	 *
	 * @param rows
	 *            The height of the grid that shows the cells.
	 * @param cols
	 *            The width of the grid that shows the cells.
	 */


	public GameOfLife(int rows, int cols) {

		gameGrid = new int [rows][cols];//arrayCell represents the number of rows and columns in the game of life
		rowCount = rows;
		colCount = cols;
	}

	/**
	 * Return the number of rows, which can be indexed from 0..numberOfRows()-1.
	 *
	 * @return The height of the society.
	 */
	public int numberOfRows() {
		return rowCount;
	}

	/**
	 * The number of columns, which can be indexed from 0..numberOfColumns()-1.
	 *
	 * @return The width of the society.
	 */
	public int numberOfColumns() {
		return colCount;
	}

	/**
	 * Place a new cell in the society. Precondition: row and col are in range.
	 *
	 * @param row
	 *            The row to grow the cell.
	 * @param col
	 *            The column to grow the cell.
	 */
	public void growCellAt(int row, int col) {
		// Complete this method
		gameGrid[row][col] = 1;
	}

	/**
	 * Return true if there is a cell at the given row and column. Return
	 * false if there is none at the specified location.
	 *
	 * @param row
	 *            The row to check.
	 * @param col
	 *            The column to check.
	 * @return True if there is a cell at the given row or false if none
	 */
	public boolean cellAt(int row, int col) {
		if(gameGrid[row][col] == 1) {// this statement represents a live cell in a given row and column.
			return true;//live cell
		}else{
			return false;//no cell
		}
	}


	/**
	 * Return one big string of cells to represent the current state of the
	 * society of cells (see output below where '.' represents an empty space
	 * and 'O' is a live cell. There is no need to test toString. Simply use it
	 * to visually inspect if needed. Here is one sample output from toString:
	 *
	 * GameOfLife society = new GameOfLife(4, 14); society.growCellAt(1, 2);
	 * society.growCellAt(2, 3); society.growCellAt(3, 4);
	 * System.out.println(society.toString());
	 *
	 * Output 
	 * .............. 
	 * ..O........... 
	 * ...O.......... 
	 * ....O.........
	 *
	 * @return A textual representation of this society of cells.
	 */
	@Override
	public String toString() {
		String countCell = "";
		for ( int row = 0; row < gameGrid.length; row++){
			for ( int column = 0; column < gameGrid[0].length; column++){
				if(gameGrid[row][column] == 1) //this represents a live cell or exist
					countCell = countCell + "0";  
				else{
					countCell = countCell + ".";//this will create little dots if there is no live cell...
				}

			}
			countCell = countCell + "\n"; //creates a new line and moves down in the array
		}

		return countCell;
	}

	/**
	 * Count the neighbors around the given location. Use wraparound. A cell in
	 * row 0 has neighbors in the last row if a cell is in the same column, or
	 * the column to the left or right. In this example, cell 0,5 has two
	 * neighbors in the last row, cell 2,8 has four neighbors, cell 2,0 has four
	 * neighbors, cell 1,0 has three neighbors. The cell at 3,8 has 3 neighbors.
	 * The potential location for a cell at 4,8 would have three neighbors.
	 *
	 * .....O..O
	 * O........
	 * O.......O
	 * O.......O
	 * ....O.O..
	 *
	 *
	 * The return values should always be in the range of 0 through 8.
	 *
	 * @return The number of neighbors around any cell using wrap around.
	 */
	public int neighborCount(int row, int col) {//these are your current positions
		int neighborCell = 0;
		//array is zero based index

		//down one or row down one
		if(cellAt((row + 1) % rowCount, col))   //lets say our arrayCell is arrayCell(4,4)
			neighborCell++;						// row here is your current cell(this is where you start and put your cell) and you add + 1 
												//lets say row is 1 then it is 1+1 = 2 
												//then 2 % 4(rowCount is 4) = 2
												//then your row is 2 and column 1
		
		//row up one
		if(cellAt((row + rowCount - 1) % rowCount , col))
			neighborCell++;

		//column right or column + 1
		if(cellAt(row, (col + 1)% colCount))
			neighborCell++;

		//column left or column -1
		if(cellAt(row,(col + colCount -1)% colCount))
			neighborCell++;

		//row up one and column right one
		if(cellAt((row + rowCount - 1) % rowCount,(col + 1)% colCount ))
			neighborCell++;

		//row down one and column right 
		if(cellAt((row + 1) % rowCount,(col + 1)% colCount)) 
			neighborCell++;

		//row down one and column left
		if(cellAt((row + 1) % rowCount,(col + colCount -1)% colCount)) 
			neighborCell++;

		//row up one and column left
		if(cellAt((row + rowCount - 1) % rowCount, (col + colCount -1)% colCount))
			neighborCell++;

		return neighborCell;

	}

	/**
	 * Update the state to represent the next society. Typically, some cells
	 * will die off while others are born.
	 */
	public void update() {
		// Complete this method

		int [][]tempTable = new int [numberOfRows()][numberOfColumns()];

		for ( int r = 0; r < numberOfRows(); r++ ){
			for (int c = 0; c < numberOfColumns(); c++){
				if(neighborCount(r,c) == 3){//if there is exactly three
					if(gameGrid[r][c] == 0)//cell is born
						tempTable[r][c]  = 1;//then you add one to your tempTable	
				}

				if((neighborCount(r,c) == 2) || (neighborCount(r,c) == 3)){//if there is two or three
					if(gameGrid[r][c] == 1)//this is your existing cell
						tempTable[r][c] = 1;//then the cell remains
				}

				if((neighborCount(r,c) == 0) || (neighborCount(r,c) == 1)){//if there were two neighbors
					if(gameGrid[r][c] == 0)//if there is no cell
						tempTable[r][c] = 0;//a cell dies
				}

				if((neighborCount(r,c) > 3)){//if there is more than three
					if(gameGrid[r][c] == 1)//if there is no cell
						tempTable[r][c] = 0;//a cell dies
				}

			}//end of column for loop
		}//end of row for loop
		gameGrid = tempTable;
	} //end of update  			
}

