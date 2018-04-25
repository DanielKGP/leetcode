class Solution {
    public boolean isUgly(int num) {
        if(num <= 0) return false;
        int n = num;
        while(n>0){
            if(n%2 == 0){
                n = n/2;
            }
            else if(n%3 ==0){
                n = n/3;
            }
            else if(n%5 ==0){
                n = n/5;
            }
            else if(n==1)
                return true;
            else
                return false;
        }
        return true;
    }
}
