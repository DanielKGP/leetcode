class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<Integer>(),1,k,n);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList,int start,int k,int n){
        if(tempList.size() > k) return;
        else if(tempList.size()==k && sum(tempList) == n){
            list.add(new ArrayList(tempList));
            return;
        }
        else{
            for(int i=start;i<=9;i++){
                tempList.add(i);
                backtrack(list,tempList,i+1,k,n);
                tempList.remove(tempList.size()-1);
            }
        }
    }

    private int sum(List<Integer> t){
        int sum = 0;
        for(int i:t){
            sum += i;
        }
        return sum;
    }
}
