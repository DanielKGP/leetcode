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
