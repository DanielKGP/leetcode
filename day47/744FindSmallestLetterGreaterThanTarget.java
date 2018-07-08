class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;

        int low =0;
        int high = n;
        while(low<high){
            int mid = low+(high-low)/2;
            if(letters[mid]>target)
                high = mid;
            else
                low =mid+1;

        }
        return letters[low%n];
    }
}
