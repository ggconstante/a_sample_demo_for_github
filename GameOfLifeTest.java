/*	count the array starting at 0..arrays are zero based index 

	Programmer: Gingrefel G. Constante
*/

import static org.junit.Assert.*;


import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void testConstructorAndGetters() {
		GameOfLife society = new GameOfLife(5, 8);
		assertEquals(5, society.numberOfRows());//this is for your rows
		assertEquals(8, society.numberOfColumns());//this is for your columns
		for (int r = 0; r < society.numberOfRows(); r++)
			for (int c = 0; c < society.numberOfColumns(); c++)
				assertFalse(society.cellAt(r, c));
	}
	@Test
	public void testGrowCellAtAndCellAt() {
		GameOfLife society = new GameOfLife(4, 4);
		society.growCellAt(1, 1);
		society.growCellAt(2, 2);
		society.growCellAt(3, 3);
		society.growCellAt(1, 3);
		society.growCellAt(2, 3);
		society.growCellAt(0, 3);

		assertTrue(society.cellAt(1, 1));
		assertTrue(society.cellAt(2, 2));
		assertTrue(society.cellAt(3, 3));
		assertTrue(society.cellAt(1, 3));
		assertTrue(society.cellAt(0, 3));
	}

	@Test
	public void testGrowCellAtAndCellAt1() {
		GameOfLife society = new GameOfLife(8, 8);
		society.growCellAt(0, 0);
		society.growCellAt(0, 1);
		society.growCellAt(0, 2);
		society.growCellAt(0, 3);
		society.growCellAt(0, 4);
		society.growCellAt(0, 5);
		society.growCellAt(0, 6);
		society.growCellAt(0, 7);
		society.growCellAt(1, 0);
		society.growCellAt(1, 1);
		society.growCellAt(1, 2);
		society.growCellAt(1, 3);
		society.growCellAt(1, 4);
		society.growCellAt(1, 5);
		society.growCellAt(1, 6);
		society.growCellAt(1, 7);
		society.growCellAt(1, 0);
		society.growCellAt(2, 0);
		society.growCellAt(2, 1);
		society.growCellAt(2, 2);
		society.growCellAt(2, 3);
		society.growCellAt(2, 4);
		society.growCellAt(2, 5);
		society.growCellAt(2, 6);
		society.growCellAt(2, 7);
		society.growCellAt(3, 0);
		society.growCellAt(3, 1);
		society.growCellAt(3, 2);
		society.growCellAt(3, 3);
		society.growCellAt(3, 4);
		society.growCellAt(3, 5);
		society.growCellAt(3, 6);
		society.growCellAt(3, 7);
		society.growCellAt(4, 0);
		society.growCellAt(4, 1);
		society.growCellAt(4, 2);
		society.growCellAt(4, 3);
		society.growCellAt(4, 4);
		society.growCellAt(4, 5);
		society.growCellAt(4, 6);
		society.growCellAt(4, 7);
		society.growCellAt(5, 0);
		society.growCellAt(5, 1);
		society.growCellAt(5, 2);
		society.growCellAt(5, 3);
		society.growCellAt(5, 4);
		society.growCellAt(5, 5);
		society.growCellAt(5, 6);
		society.growCellAt(5, 7);
		society.growCellAt(6, 0);
		society.growCellAt(6, 1);
		society.growCellAt(6, 2);
		society.growCellAt(6, 3);
		society.growCellAt(6, 4);
		society.growCellAt(6, 5);
		society.growCellAt(6, 6);
		society.growCellAt(6, 7);
		society.growCellAt(7, 0);
		society.growCellAt(7, 1);
		society.growCellAt(7, 2);
		society.growCellAt(7, 3);
		society.growCellAt(7, 4);
		society.growCellAt(7, 5);
		society.growCellAt(7, 6);
		society.growCellAt(7, 7);
		//society.growCellAt(9, 16);

		assertTrue(society.cellAt(0, 0));
		assertTrue(society.cellAt(0, 1));
		assertTrue(society.cellAt(0, 2));
		assertTrue(society.cellAt(0, 3));
		assertTrue(society.cellAt(0, 4));
		assertTrue(society.cellAt(0, 5));
		assertTrue(society.cellAt(0, 6));
		assertTrue(society.cellAt(0, 7));
		assertTrue(society.cellAt(1, 0));
		assertTrue(society.cellAt(1, 1));
		assertTrue(society.cellAt(1, 2));
		assertTrue(society.cellAt(1, 3));
		assertTrue(society.cellAt(1, 4));
		assertTrue(society.cellAt(1, 5));
		assertTrue(society.cellAt(1, 6));
		assertTrue(society.cellAt(1, 7));
		assertTrue(society.cellAt(2, 0));
		assertTrue(society.cellAt(2, 1));
		assertTrue(society.cellAt(2, 2));
		assertTrue(society.cellAt(2, 3));
		assertTrue(society.cellAt(2, 4));
		assertTrue(society.cellAt(2, 5));
		assertTrue(society.cellAt(2, 6));
		assertTrue(society.cellAt(2, 7));
		assertTrue(society.cellAt(3, 0));
		assertTrue(society.cellAt(3, 1));
		assertTrue(society.cellAt(3, 2));
		assertTrue(society.cellAt(3, 3));
		assertTrue(society.cellAt(3, 4));
		assertTrue(society.cellAt(3, 5));
		assertTrue(society.cellAt(3, 6));
		assertTrue(society.cellAt(3, 7));
		assertTrue(society.cellAt(4, 0));
		assertTrue(society.cellAt(4, 1));
		assertTrue(society.cellAt(4, 2));
		assertTrue(society.cellAt(4, 3));
		assertTrue(society.cellAt(4, 4));
		assertTrue(society.cellAt(4, 5));
		assertTrue(society.cellAt(4, 6));
		assertTrue(society.cellAt(4, 7));
		assertTrue(society.cellAt(5, 0));
		assertTrue(society.cellAt(5, 1));
		assertTrue(society.cellAt(5, 2));
		assertTrue(society.cellAt(5, 3));
		assertTrue(society.cellAt(5, 4));
		assertTrue(society.cellAt(5, 5));
		assertTrue(society.cellAt(5, 6));
		assertTrue(society.cellAt(5, 7));
		assertTrue(society.cellAt(6, 0));
		assertTrue(society.cellAt(6, 1));
		assertTrue(society.cellAt(6, 2));
		assertTrue(society.cellAt(6, 3));
		assertTrue(society.cellAt(6, 4));
		assertTrue(society.cellAt(6, 5));
		assertTrue(society.cellAt(6, 6));
		assertTrue(society.cellAt(6, 7));
		assertTrue(society.cellAt(7, 0));
		assertTrue(society.cellAt(7, 1));
		assertTrue(society.cellAt(7, 2));
		assertTrue(society.cellAt(7, 3));
		assertTrue(society.cellAt(7, 4));
		assertTrue(society.cellAt(7, 5));
		assertTrue(society.cellAt(7, 6));
		assertTrue(society.cellAt(7, 7));
		//assertFalse(society.cellAt(9, 16));

	}

	//test for neighborCount method
	@Test
	public void testNeighborsWrapping() {
		GameOfLife society = new GameOfLife(10, 16);
		society.growCellAt(3, 3);
		society.growCellAt(3, 4);
		society.growCellAt(3, 5);
		society.growCellAt(2, 4);
		society.growCellAt(9, 15);
		society.growCellAt(0, 0);
		society.growCellAt(0, 15);
		assertEquals(0, society.neighborCount(2, 1));
		assertEquals(1, society.neighborCount(2, 2));
		assertEquals(3, society.neighborCount(2, 3));
		assertEquals(3, society.neighborCount(2, 4));
		assertEquals(2, society.neighborCount(9, 15));
		assertEquals(3, society.neighborCount(9, 0));
		assertEquals(2, society.neighborCount(0, 15));
	}



	//test for toString method
	@Test
	public void testToString() {
		GameOfLife society = new GameOfLife(4, 14);
		society.growCellAt(1, 2);
		society.growCellAt(2, 3);
		society.growCellAt(3, 4);
		System.out.println(society.toString());
	}

	//test for update method
	@Test
	public void testUpdate() {
		GameOfLife society = new GameOfLife(5, 5);

		society.growCellAt(2, 1);
		society.growCellAt(2, 2);
		society.growCellAt(2, 3);


		society.update();

		assertTrue(society.cellAt(1, 2));
		assertTrue(society.cellAt(2, 2));
		assertTrue(society.cellAt(3, 2));
		assertFalse(society.cellAt(2, 1));
		assertFalse(society.cellAt(2, 3));

	}
	@Test
	public void testUpdate1() {
		GameOfLife society = new GameOfLife(5, 5);

		society.growCellAt(1, 0);
		society.growCellAt(0, 1);
		society.growCellAt(1, 1);
		society.growCellAt(2,1);


		society.update();

		assertTrue(society.cellAt(1, 2));
	}
	@Test
	public void testUpdate2() {
		GameOfLife society = new GameOfLife(5, 5);

		society.growCellAt(1, 0);
		society.growCellAt(2, 0);
		society.growCellAt(1, 1);
		society.growCellAt(1,2);
		society.growCellAt(2, 2);

		society.update();
	}
}

