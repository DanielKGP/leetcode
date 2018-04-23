class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}


class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid =(low+high)/2;
            if(nums[high]<nums[mid]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return nums[high];
    }
}
