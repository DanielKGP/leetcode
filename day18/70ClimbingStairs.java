// beyond time limited

class Solution {
    public int climbStairs(int n) {
        List<List<Integer>> list = new ArrayList();
        backtrack(list, n, new ArrayList<Integer>());
        return list.size();
    }
    private void backtrack(List<List<Integer>> list,int remain, List<Integer> tempList){
        if(remain < 0) return;
        if(remain == 0) list.add(new ArrayList(tempList));
        else{
            for(int i=1;i<=2;i++){
                tempList.add(i);
                backtrack(list,remain-i,tempList);
                tempList.remove(tempList.size()-1);
            }
        }
    }
}


//dp
class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int[] dp = new int[n];
        dp[0]=1;
        dp[1]=2;
        for(int i=2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }
}
