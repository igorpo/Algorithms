package arrays.rotate;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotateTest {

	@SuppressWarnings("deprecation")
	@Test
	public void fourxfour() {
		int[][] pixels = 
			{	
				{ 1,   2,    3,    4}, 
				{ 5,   6,    7,    8}, 
				{ 9,  10,   11,   12}, 
				{13,  14,   15,   16}	
			};
		int[][] rotated = 
			{
				{13,   9,    5,    1},
				{14,  10,    6,    2},
				{15,  11,    7,    3},
				{16,  12,    8,    4}
			};
		Rotate r = new Rotate(pixels);
		r.rotateClockwise90();
		assertEquals(rotated, pixels);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void twoxtwo() {
		int[][] pixels = 
			{	
				{ 1, 2}, 
				{ 5, 6}	
			};
		int[][] rotated = 
			{
				{5, 1},
				{6, 2}
			};
		Rotate r = new Rotate(pixels);
		r.rotateClockwise90();
		assertEquals(rotated, pixels);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void sixbysix() {
		int[][] pixels = 
			{	
				{1,   2,  3,  4,  5,  6},
				{7,   8,  9, 10, 11, 12},
				{13, 14, 15, 16, 17, 18},
				{19, 20, 21, 22, 23, 24},
				{25, 26, 27, 28, 29, 30},
				{31, 32, 33, 34, 35, 36}
			};
		int[][] rotated = 
			{
				{31, 25, 19,  13, 7,  1},
				{32, 26, 20,  14, 8,  2},
				{33, 27, 21,  15, 9,  3},
				{34, 28, 22,  16, 10, 4},
				{35, 29, 23,  17, 11, 5},
				{36, 30, 24,  18, 12, 6}
			};
		Rotate r = new Rotate(pixels);
		r.rotateClockwise90();
		assertEquals(rotated, pixels);
	}

}
