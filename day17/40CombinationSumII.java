class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<Integer>(), candidates, 0, target);
        return list;

    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList,int[] nums, int start, int remain){
        if(remain < 0) return;
        if(remain == 0) list.add(new ArrayList(tempList));
        for(int i=start; i<nums.length; i++){
            if(i> start && nums[i] == nums[i-1]) continue;
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1,remain-nums[i]);
            tempList.remove(tempList.size()-1);
        }
    }
}
