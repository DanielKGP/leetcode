class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
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
        return list.get(list.size()-1);
    }

}
//only O(k) extra space

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> List = new ArrayList<Integer>();
        List<Integer> tempList = new ArrayList<Integer>();
        for(int i=0;i<=rowIndex;i++){
            if(i<2){
                tempList.add(1);
            }
            else if(i>=2){
                List.add(1);
                for(int j=0; j<tempList.size()-1;j++){
                    List.add(tempList.get(j)+tempList.get(j+1));
                }
                List.add(1);
                Update(tempList,List);
            }
        }
        return tempList;
    }
    private void Update(List<Integer> tempList, List<Integer> List){
        tempList.clear();
        for(int i=0;i<List.size();i++){
            tempList.add(List.get(i));
        }
        List.clear();
    }

}
