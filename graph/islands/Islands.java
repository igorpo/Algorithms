package graph.islands;

public class Islands {
	/**
     * @param grid a boolean 2D matrix
     * @return an integer
     */
    public int numIslands(boolean[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        final int ROW = grid.length;
        final int COL = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[ROW][COL];
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
               if (grid[i][j] == true && !visited[i][j]) {
                    islands++;
                    dfs(visited, i, j, grid);
                } 
            }
        }
        return islands;
    }
    
    private void dfs(boolean[][] visited, int i, int j, boolean[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || !grid[i][j]) {
            return;
        }
        visited[i][j] = true;
        dfs(visited, i - 1, j, grid);
        dfs(visited, i, j - 1, grid);
        dfs(visited, i + 1, j, grid);
        dfs(visited, i, j + 1, grid);
    }
}
