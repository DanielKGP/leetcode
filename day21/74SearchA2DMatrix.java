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


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length ==0) return false;
        int x = matrix[0].length;
        int y = matrix.length;
        int tag = 0;
        for(int i=0;i<y;i++){
            if(matrix[i][x-1] == target)
                return true;
            if(matrix[i][x-1] > target){
                tag = i;
                break;
            }
        }
        for(int i=0;i<y-1;i++){
            if(matrix[i][x-1] == target || matrix[i+1][x-1] == target)
                return true;
            else if(matrix[i][x-1] < target && matrix[i+1][x-1] > target){
                tag = i+1;
                break;
            }
        }
        for(int j=0;j<x;j++){
            if(matrix[tag][j] == target)
                return true;
        }
        return false;
    }
}
