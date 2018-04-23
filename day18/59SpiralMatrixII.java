class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans =new int[n][n];
        int left=0;
        int top=0;
        int right = n-1;
        int down = n-1;
        int count =1;
        while(left<=right){
            for(int i=left; i<=right; i++){
                ans[top][i] = count++;
            }
            top++;
            for(int j=top; j<=down; j++){
                ans[j][right] = count++;
            }
            right--;
            for(int i=right; i>= left; i--){
                ans[down][i] = count++;
            }
            down--;
            for(int j=down; j>=top; j--){
                ans[j][left] = count++;
            }
            left++;
        }
        return ans;
    }
}
