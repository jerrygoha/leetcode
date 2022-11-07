class Solution {
    public int maxProfit(int[] prices) {
    
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int tempProfit = 0;
        
        for (int i = 0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            
            tempProfit = prices[i] - min;
            if(maxProfit < tempProfit){
                maxProfit = tempProfit;
            }
            
        }
        
        return maxProfit;
        
    }
}