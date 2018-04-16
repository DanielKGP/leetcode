class Solution {
	    public int missingNumber(int[] nums) {
	        int ans = 0;
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i=0;i<nums.length;i++){
	            list.add(nums[i]);
	        }
	        for(int i=0;i<=nums.length;i++){
	            if(!list.contains(i))
	                ans = i;
	        }
	        return ans;
	    }
	}


class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[nums.length-1] != nums.length) {
            return nums.length;
        }
        else if (nums[0] != 0) {
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        return -1;
    }
}
