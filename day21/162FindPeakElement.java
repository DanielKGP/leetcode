class Solution {
    public int findPeakElement(int[] nums) {
        int prev = Integer.MIN_VALUE;
        int n =nums.length-1;
        if(n == 0) return 0;
        if(n == 1){
            if(nums[1] > nums[0])
                return 1;
            else
                return 0;
        }
        for(int i=0; i<n; i++){
            if((nums[i] > nums[i+1]) && nums[i]>prev)
                return i;
            prev = nums[i];
        }
        return n;
    }
}
