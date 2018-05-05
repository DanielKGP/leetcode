class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || x%10 ==0 && x!=0) return false;
        int reverthalf =0;
        while(x>reverthalf){
            reverthalf = reverthalf*10 + x%10;
            x=x/10;
        }
        return x == reverthalf || x == reverthalf/10;
    }
}
