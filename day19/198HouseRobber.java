class Solution {
    public int rob(int[] nums) {
        int preNo = 0;
        int preYes = 0;
        for(int i=0;i<nums.length;i++){
            int currYes = nums[i]+preNo;
            preNo = Math.max(preYes, preNo);
            preYes = currYes;
        }
        return Math.max(preNo,preYes);
    }
}
