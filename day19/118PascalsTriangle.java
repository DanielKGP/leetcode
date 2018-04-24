class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++){
            if(i<2){
                tempList.add(1);
                list.add(new ArrayList(tempList));
            }
            else if(i>=2){
                tempList.clear();
                tempList.add(1);
                for(int j=0; j<list.get(i-1).size()-1;j++){
                    tempList.add(list.get(i-1).get(j)+list.get(i-1).get(j+1));
                }
                tempList.add(1);
                list.add(new ArrayList(tempList));
            }
        }
        return list;
    }
}
