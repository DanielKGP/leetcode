import  java.util.ArrayList;
import  java.util.Arrays;
class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        DeleteCopy(list, nums);
        int[] temp = new int[list.size()];
        for(int i=0;i<list.size();i++) temp[i] = list.get(i);
        Arrays.sort(temp);
        return LCS(nums, temp);
    }
    private int LCS(int[] x, int[] y){
        int n = x.length;
        int m = y.length;
        int[][] len = new int[m+1][n+1];
        for(int i=0;i<n;i++){
            len[0][i] = 0;
        }
        for(int i=0;i<m;i++){
            len[i][0] = 0;
        }
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(x[j-1] == y[i-1]){
                    len[i][j] = len[i-1][j-1] +1;
                }
                else if(len[i][j-1] > len[i-1][j])
                    len[i][j] = len[i][j-1];
                else
                    len[i][j] = len[i-1][j];
            }
        }
        return len[m][n];
    }
    private void DeleteCopy(ArrayList<Integer> list, int[] temp){
        for(int i=0;i<temp.length;i++){
            if(!list.contains(temp[i])) list.add(temp[i]);
        }
    }
    public static void main(String[] args){
        Solution t = new Solution();
        int[] a = {2,2};
        System.out.println(t.lengthOfLIS(a));
    }
}


//Time Limited Exceeded
/*
class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        DeleteCopy(list, nums);
        int[] temp = new int[list.size()];
        for(int i=0;i<list.size();i++) temp[i] = list.get(i);
        Arrays.sort(temp);
        return LCS(nums, temp, 0, 0);
    }
    private int LCS(int[] x, int[] y, int i, int j){
        if(i == x.length || j == y.length) return 0;
        if(x[i] == y[j])
            return LCS(x,y,i+1,j+1)+1;
        else
            return Math.max(LCS(x,y,i+1,j), LCS(x,y,i,j+1));
    }
    private void DeleteCopy(ArrayList<Integer> list, int[] temp){
        for(int i=0;i<temp.length;i++){
            if(!list.contains(temp[i])) list.add(temp[i]);
        }
    }
}
*/
