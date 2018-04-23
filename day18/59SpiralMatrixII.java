import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length==0) return list;

        int left=0;
        int top=0;
        int right=matrix[0].length-1;
        int down=matrix.length-1;

        while(left<=right && top<= down){
            for(int i=left; i<= right; i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<= down;j++){
                list.add(matrix[j][right]);
            }
            right--;
            for(int i=right; i>=left;i--){
                list.add(matrix[down][i]);
            }
            down--;
            for(int j=down; j>=top; j--){
                list.add(matrix[j][left]);
            }
            left++;
        }
        return list;
    }

    public static void main(String[] args) {
      Solution t = new Solution();
      int[][] temp = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
      //deffer from the answer in the LeetCode
      System.out.println(t.spiralOrder(temp));

    }
}
