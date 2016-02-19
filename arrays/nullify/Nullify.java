package arrays.nullify;

/**
 * Q: If an entry in an M x N matrix is 0, set the row/col to zero as well. 
 * @author igorpogorelskiy
 */
public class Nullify {
	
	private int[][] matrix;
	private int rows;
	private int cols;
	private boolean[] rowZeros;
	private boolean[] colZeros;
	
	public Nullify(int[][] matrix) {
		this.matrix = matrix;
		this.rows = matrix.length;
		this.cols = matrix[0].length;
		rowZeros = new boolean[rows];
		colZeros = new boolean[cols];
	}
	
	/**
	 * Solution: We keep boolean flags of which indices should be flagged
	 * as nullified rows and columns and then make another pass over the
	 * rows and cols boolean flags in order to find those rows/cols to nullify.
	 */
	public void nullify() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					rowZeros[i] = true;
					colZeros[j] = true;
				}
			}
		}
		
		for (int i = 0; i < rows; i++) {
			if (rowZeros[i]) {
				nullifyRow(i);
			}
		}
		
		for (int i = 0; i < cols; i++) {
			if (colZeros[i]) {
				nullifyCol(i);
			}
		}
		
		
	}
	
	private void nullifyRow(int row) {
		for (int i = 0; i < cols; i++) {
			matrix[row][i] = 0;
		}
	}
	
	private void nullifyCol(int col) {
		for (int i = 0; i < rows; i++) {
			matrix[i][col] = 0;
		}
	}
}
