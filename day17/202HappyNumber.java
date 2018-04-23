class Solution {
    public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(true){
            x = cal(x);
            if(x==1) return true;
            y = cal(cal(y));
            if(y==1) return true;

            if(x==y) return false;
        }
    }
    private int cal(int n){
        int temp = 0;
        while(n>0){
            temp += (n%10)*(n%10);
            n = n/10;
        }
        return temp;
    }
}
