class Solution {
    public int maxProfit(int[] prices) {
    
        int min = Integer.MAX_VALUE;
        int max = 0;
        int profit = 0;
        
        for (int i = 0; i<prices.length-1; i++){
            max = 0;
            //min 업데이트 안되면 continue
            if (prices[i]<min){
                min = prices[i];
            }else{
                continue;
            }
            
            for (int j = i+1; j<prices.length; j++ ){
                if(min<prices[j] && prices[j]>max){
                    max = prices[j];
                }
            }
            
            if(profit<(max-min)){
                profit = (max-min);
            }
        }
        
        return profit;
        
    }
}