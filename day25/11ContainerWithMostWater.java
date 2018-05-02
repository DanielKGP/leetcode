class Solution {
    public int maxArea(int[] height) {
        int low =0;
        int high =height.length-1;
        int maxArea = 0;
        while(low<high){
            maxArea = Math.max(maxArea, Math.min(height[low],height[high])*(high-low));
            if(height[high]>height[low]){
                low++;
            }
            else
                high--;

        }
        return maxArea;
    }
}
