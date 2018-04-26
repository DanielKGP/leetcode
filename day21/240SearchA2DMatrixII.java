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
        int i=0;
        int j=x-1;
        while(i<y && j>=0){
            if(matrix[i][j] ==target) return true;
            else if(matrix[i][j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}
