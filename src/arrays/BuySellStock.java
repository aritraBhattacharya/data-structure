package arrays;

public class BuySellStock {
    public int maxProfit(int[] prices) {
        // for each day, check whats min before then calculate the profit if the stock is sold that day
        int maxProfit=0;
        int min = prices[0];
        for(int i=0;i<prices.length; i++){
            int profit = prices[i]-min;
            if(maxProfit<profit) maxProfit=profit;

            if(prices[i]<min) min = prices[i];
        }
        return maxProfit;
    }
}
