class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length ==0) return false;
        int x = matrix[0].length;
        int y = matrix.length;
        for(int i=0;i<y;i++){
            for(int j=0;j<x;j++){
                if(matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
