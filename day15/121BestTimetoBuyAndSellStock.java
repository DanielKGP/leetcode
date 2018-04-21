class Solution {
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice = prices[i];
            }
            if((prices[i]-minprice)>maxprice){
                maxprice = prices[i]-minprice;
            }
        }
        return maxprice;

    }
}
