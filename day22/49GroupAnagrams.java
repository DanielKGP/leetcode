import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public ArrayList<ArrayList<String>> groupAnagrams(String[] strs) {
        ArrayList<ArrayList<String>> list = new ArrayList();
        ArrayList<String> str = new ArrayList<String>();
        for(int i=0;i<strs.length;i++){
            str.add(strs[i]);
        }
        backtrack(list, new ArrayList<String>(), str);
        return list;
    }
    private void backtrack(ArrayList<ArrayList<String>> list, ArrayList<String> tempList, ArrayList<String> str){
        if(str.size() == 0 ) return;
        else{
            String temp = str.get(0);
            tempList.add(temp);
            str.remove(temp);
            int i =0;
            while(str.size() >0){
                if(i >= str.size()) break;
                if(isAnagram(str.get(i),tempList.get(0))){
                    String t = str.get(i);
                    tempList.add(t);
                    str.remove(t);
                }
                else i++;
            }
            list.add(new ArrayList(tempList));
            tempList.clear();
        }
        backtrack(list,tempList,str);
    }

    private boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> S = helper(s);
        HashMap<Character,Integer> T = helper(t);
        if(S.equals(T))
            return true;
        else
            return false;

    }

    private HashMap<Character,Integer> helper(String temp){
        HashMap<Character, Integer> counts = new HashMap<Character,Integer>();
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
    public static void main(String[] args){
        String[] a = {"","",""};
        ArrayList<ArrayList<String>> list = new ArrayList();
        Solution t = new Solution();
        list = t.groupAnagrams(a);
        for(int i=0;i<list.size();i++){
          for(int j=0;j<list.get(i).size();j++){
            System.out.print(list.get(i).get(j));
            System.out.println("|||");
          }
          System.out.println("...");
        }
    }
}

// 最后一个测试用例超过了time limit
