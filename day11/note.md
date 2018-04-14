## Two Sum II - Input array is sorted


Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

### solution one

第一种是暴力搜索，18test case 通过了17个

	class Solution {
	    public int[] twoSum(int[] numbers, int target) {
	        int index1 = 0;
	        int index2 = 0;
	        for(int i=0;i<numbers.length;i++){
	            for(int j=i+1;j<numbers.length;j++){
	                if(numbers[i]+numbers[j] == target){
	                    index1 = i+1;
	                    index2 = j+1;
	                }
	            }
	        }
	        int[] ans = new int[2];
	        ans[0] = index1;
	        ans[1] = index2;
	        return ans;
	
	    }
	}
	
	
### solution two

算法导论中做过，前提是array是sorted的。


	class Solution {
	    public int[] twoSum(int[] numbers, int target) {
	        int[] ans = new int[2];
	        if(ans == null || ans.length <2) return ans;
	        int left = 0;
	        int right = numbers.length -1;
	        while(left<right){
	            int v = numbers[right] + numbers[left];
	            if(v == target){
	                ans[0] = left+1;
	                ans[1] = right+1;
	                break;
	            }
	            else if(v > target)
	                right--;
	            else if(v <target)
	                left++;
	        }
	        return ans;
	
	    }
	}
	
	
	
## Contains Duplicate

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

### solution one
利用List，最后一个testcase不能通过，会超多time limit

	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        List<Integer> counts = new ArrayList<Integer>();
	        for(int i=0; i<nums.length; i++){
	            if(!counts.contains(nums[i])){
	                counts.add(nums[i]);
	            }
	        }
	        if(counts.size() == nums.length)
	            return false;
	        else
	            return true;
	    }
	
	}


而用HashSet则不会出现这种问题，算法是一样的

	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        Set<Integer> counts = new HashSet<Integer>(nums.length);
	        for(int i=0; i<nums.length; i++){
	            if(!counts.contains(nums[i])){
	                counts.add(nums[i]);
	            }
	            else
	                return true;
	        }
	        return false;
	    }
	
	}
	
### solution two
利用数组排序后的特点，非常精妙

	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        for(int i=0; i<nums.length-1; i++){
	            if(nums[i] == nums[i+1])
	                return true;
	        }
	        return false;
	    }
	
	}