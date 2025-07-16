public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Max profit = " + calculateMaxProfit(prices));
    }

    public static int calculateMaxProfit(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        int sellingPrice = 0; 
        for(int i = 0; i < prices.length; i++) {
            sellingPrice = prices[i];
            if(buyPrice < sellingPrice) {
                int profit = sellingPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}