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
