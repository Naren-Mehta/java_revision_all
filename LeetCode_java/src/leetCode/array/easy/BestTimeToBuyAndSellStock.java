//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

package leetCode.array.easy;

public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
                min = Math.min(min, prices[i]);
                profit = Math.max(profit, prices[i]-min);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }
}
