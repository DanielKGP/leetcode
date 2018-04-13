class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Integer> S = helper(s);
        Map<Character,Integer> T = helper(t);
        if(S.equals(T))
            return true;
        else
            return false;

    }

    private Map<Character,Integer> helper(String temp){
        Map<Character, Integer> counts = new HashMap<Character,Integer>();
        for(int i=0; i<temp.length();i++){
            if(!counts.containsKey(temp.charAt(i))){
                counts.put(temp.charAt(i),1);
            }
            else{
                counts.put(temp.charAt(i),counts.get(temp.charAt(i))+1);
            }

        }
        return counts;
    }
}
