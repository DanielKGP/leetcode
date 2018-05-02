class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length/2;
        int res = 0;
        for(int i=0;i<n;i++){
            res += nums[2*i];
        }
        return res;
    }
}
