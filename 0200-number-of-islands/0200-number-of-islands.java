class Solution {
    static int rows; 
    static int cols;

    public int numIslands(char[][] grid) {
  rows = grid.length;
        cols = grid[0].length;
        int island = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {
                    island++;
                    find(grid, i, j);
                }
            }
        }
        return island;
    }

    static void find(char[][] grid, int i, int j) {
        if (i < 0 || i >= rows || j < 0 || j >= cols)
            return;

        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        find(grid, i - 1, j);
        find(grid, i + 1, j);
        find(grid, i, j - 1);
        find(grid, i, j + 1);
    }
}