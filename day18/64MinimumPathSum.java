class Solution {
    public int minPathSum(int[][] grid) {
        int x = grid[0].length;
        int y = grid.length;
        int[][] sum = new int[y][x];
        sum[0][0] = grid[0][0];
        for(int i =1;i<y;i++){
            sum[i][0] = sum[i-1][0]+grid[i][0];
        }
        for(int j=1;j<x;j++){
            sum[0][j] = sum[0][j-1]+grid[0][j];
        }
        for(int i=1;i<y;i++){
            for(int j=1;j<x;j++){
                sum[i][j] = Math.min(sum[i-1][j],sum[i][j-1]) + grid[i][j];
            }
        }
        return sum[y-1][x-1];
    }
}
