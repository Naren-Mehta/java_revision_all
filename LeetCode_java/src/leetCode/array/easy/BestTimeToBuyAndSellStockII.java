//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

package leetCode.array.easy;

public class BestTimeToBuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }
}
