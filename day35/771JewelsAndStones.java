class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        List<Character> list = new ArrayList<Character>();
        for (char j: J.toCharArray())
            list.add(j);
        for (char s: S.toCharArray())
            if (list.contains(s))
                res++;
        return res;
    }
}
