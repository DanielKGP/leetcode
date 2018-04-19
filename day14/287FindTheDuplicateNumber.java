class Solution {
    public int findDuplicate(int[] nums) {
        int ans =0;
        Arrays.sort(nums);
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) {
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length > 0){
            int slow = nums[0];
            int fast = nums[nums[0]];
            while(slow != fast){
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while(fast != slow){
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;

        }
        return -1;
    }
}
