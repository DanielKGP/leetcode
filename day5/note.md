## Product of Array Except Self

Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it __without division__ and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

__Follow up:__
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)

### solution one
两层循环暴力计算，时间复杂度为O(n^2)

	class Solution {
	    public int[] productExceptSelf(int[] nums) {
	        int pos = 0;
	        int[] tempNums = new int[nums.length];
	        for(int num : nums){
	            int temp = 1;
	            for(int i=0; i < nums.length;i++){
	                if(i!= pos){
	                    temp = temp * nums[i];
	                }
	            }
	            tempNums[pos++] = temp;
	        }
	        return tempNums;
	    }
	
	    public static void main(String[] args){
	        Solution t = new Solution();
	        int[] nums = {1,2,3,4};
	        for(int j :nums){
	          System.out.println(j);
	        }
	        int[] temp =  t.productExceptSelf(nums);
	        for(int num : temp){
	          System.out.println(num);
	        }
	    }
	}
	
	
### solution two

计算数组当前坐标外的乘积，并且时间复杂度为O(n)

可将计算分成两部分：

1. 先计算坐标左边的乘积和，并存入res[]数组中，每个坐标数都有对应的左边和，

2. 再计算右边的乘积和，最后相乘，便可获得想要的值。



		class Solution {
		     public int[] productExceptSelf(int[] nums) {
		        int n = nums.length;
		        int[] res = new int[n];
		        res[0] = 1;
		        for (int i = 1; i < n; i++) {
		            res[i] = res[i - 1] * nums[i - 1];
		        }
		        int right = 1;
		        for (int i = n - 1; i >= 0; i--) {
		            res[i] *= right;
		            right *= nums[i];
		        }
		        return res;
		    }
		}
		


## Binary Tree Inorder Traversal