class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet();
        Set repeated = new HashSet();
        for(int i=0;i+9<s.length();i++){
            String temp = s.substring(i,i+10);
            if(!seen.add(temp))
                repeated.add(temp);
        }
        return new ArrayList(repeated);
    }
}
