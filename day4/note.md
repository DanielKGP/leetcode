## Move Zeroes

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.


### solution one

设置一个参数记录当前数组的坐标，在遍历数组的时候，判断数组中的数是否为0，不为0则将坐标对应的数组的数更新为当前的数字，并将坐标后移。因为数组是从前往后遍历的，坐标也是从0开始的，所以不用担心原数组的数据被新数据覆盖而丢失。

	class Solution {
	    public void moveZeroes(int[] nums) {
	        if(nums == null || nums.length == 0) return;
	        
	        int i = 0;
	        for(int num: nums){
	            if(num != 0){
	                nums[i++] = num;
	            }
	        }
	        while(i<nums.length){
	            nums(i++) = 0;
	        }
	        
	    }
	}
