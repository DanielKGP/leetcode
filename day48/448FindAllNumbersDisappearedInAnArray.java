class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        if(nums.length == 0) return list;
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        
        int j =0;
        int i =1;
        while(i<= max && j<nums.length){
            if(i == nums[j]){
                i++;
                j++;
            }else if(i>nums[j]){
                j++;
            }else if(i<nums[j]){
                list.add(i);
                i++;
            }
        }
        for(int k=max+1;k<=nums.length;k++){
            list.add(k);
        }
        
        return list;
    }
}