package backtracking.nqueens;

public class NQueens {
	
	private final int N;
	private int[][] board;
	
	public NQueens(int N) {
		this.N = N;
		board = new int[N][N]; // init'd to all 0s
	}
		
	private void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(" " + board[i][j] + " "); 
            }
            System.out.println();
        }
    }
	
	/**
	 * Check if a Queen can be placed in the current spot safely. We only 
	 * consider the safety from the top/down, left/right
	 * and upper-left/lower-left since we build up the solution from left
	 * to right.
	 * @param row row
	 * @param col column
	 * @return true if can place a queen safely in the spot board[row][col]
	 */
	private boolean canPlaceQueen(int row, int col) {
		
		// check up/down
		for (int i = 0; i < N; i++) {
			if (board[i][col] == 1) {
				return false;
			}
		}
		
		// check left/right
		for (int i = 0; i < N; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}
		
		// check upper left diag
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		
		// check lower left diag
		for (int i = row, j = col; i < N && j >= 0; i++, j--) {
			if (board[i][j] == 1) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * Recursively employs backtracking to solve the n queens problem
	 * by constantly adding queens to each successful column unless it is not
	 * possible.
	 * @param col
	 * @return true if a configuration works
	 */
	private boolean solver(int col) {
		
		// base case: we solved the problem
		if (col >= N) {
			return true;
		}
		
		// try placing Queen on each row of given col
		for (int i = 0; i < N; i++) {
			if (canPlaceQueen(i, col)) {
				board[i][col] = 1;
				
				// recursively place remaining queens
				if (solver(col + 1)) {
					return true;
				}
				
				// backtracked
				board[i][col] = 0;
			}
		}
		
		return false;
	}
	
	/**
	 * Solve the n queens problem by calling helpers
	 */
	public void solve() {
		if (solver(0)) {
			printBoard();
		} else {
			System.out.println("Solution for " + N + " Queens problem does not exist.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		System.out.println(" N = 4\n");
		NQueens fourbyfour = new NQueens(4);
		fourbyfour.solve();
		System.out.println("--------------------------------------------------");
		
		System.out.println("--------------------------------------------------");
		System.out.println(" N = 2\n");
		NQueens twobytwo = new NQueens(2);
		twobytwo.solve();
		System.out.println("--------------------------------------------------");
		
		System.out.println("--------------------------------------------------");
		System.out.println(" N = 8\n");
		NQueens eight = new NQueens(8);
		eight.solve();
		System.out.println("--------------------------------------------------");
		
		System.out.println("--------------------------------------------------");
		System.out.println(" N = 16\n");
		NQueens sixteen = new NQueens(16);
		sixteen.solve();
		System.out.println("--------------------------------------------------");
	}

}
