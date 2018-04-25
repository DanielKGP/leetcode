public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        List<Integer> list = new ArrayList<Integer>();
        while(n!=0){
            list.add(n%2);
            n = n/2;
        }
        for(int i=0;i<list.size();i++){
            if(list.contains(1)) count++;
        }
        return count;
    }
}
