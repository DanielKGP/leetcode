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
