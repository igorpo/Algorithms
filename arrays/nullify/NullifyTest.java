package arrays.nullify;

import static org.junit.Assert.*;

import org.junit.Test;

public class NullifyTest {

	@SuppressWarnings("deprecation")
	@Test
	public void simpleTest() {
		int[][] matrix = 
			{
				{1, 0, 2, 4, 1},
				{0, 1, 1, 3, 2},
				{1, 3, 4, 5, 2},
			};
		int[][] nullified = 
			{
				{0, 0, 0, 0, 0},
				{0, 0, 0, 0, 0},
				{0, 0, 4, 5, 2}
			};
		Nullify n = new Nullify(matrix);
		n.nullify();
		assertEquals(nullified, matrix);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void noZerosTest() {
		int[][] matrix = 
			{
				{1, 1, 2, 4, 1},
				{1, 1, 1, 3, 2},
				{1, 3, 4, 5, 2},
			};
		int[][] nullified = 
			{
				{1, 1, 2, 4, 1},
				{1, 1, 1, 3, 2},
				{1, 3, 4, 5, 2},
			};
		Nullify n = new Nullify(matrix);
		n.nullify();
		assertEquals(nullified, matrix);
	}
	
	


}
