class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<String>(),s,0);
        return list;
    }
    private void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
        if(tempList.size()>0 && start >=s.length()) list.add(new ArrayList(tempList));
        else{
            for(int i=start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    if(start == i)
                        tempList.add(Character.toString(s.charAt(i)));
                    else
                        tempList.add(s.substring(start,i+1));
                    backtrack(list,tempList,s,i+1);
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }
    private boolean isPalindrome(String s,int start, int end){
        if(start == end) return true;
        while(start <end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
