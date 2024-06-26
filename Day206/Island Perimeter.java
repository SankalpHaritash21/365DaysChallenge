class Solution {
    int[] DIR = new int[]{0, 1, 0, -1, 0};
    public int islandPerimeter(int[][] grid) {
        int row = grid.length, col = grid[0].length, perimeter = 0;
        for (int r = 0; r < row; ++r) {
            for (int c = 0; c < col; ++c) {
                if (grid[r][c] == 0) continue; // Skip water cell
                perimeter += 4;
                for (int i = 0; i < 4; ++i) {
                    int nr = r + DIR[i], nc = c + DIR[i+1];
                    if (nr < 0 || nr == row || nc < 0 || nc == col || grid[nr][nc] == 0) continue;
                    perimeter -= 1;
                }
            }
        }
        return perimeter;
    }
}