package day8;

public class BestTimetoBuyandSellStock {
    class Solution {
        public int maxProfit(int[] prices) {
            int low = prices[0];
            int maxi=0;
            for(int i=0; i<prices.length;i++){
                if(prices[i]<low) low = prices[i];
                if(prices[i]-low>maxi) maxi = prices[i]-low;
            }   
            return maxi;
    
        }
    }
}
