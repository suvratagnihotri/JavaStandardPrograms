package com.java.StandardPrograms;

public class StockMaxProfit {
    public int getMaxProfit(int []price,int start,int end){
        if(end<=start){
            return 0;
        }
        int profit = 0;
        for(int i =start; i<end; i++){

            for(int j = i+1; j<=end;j++){
                if(price[j]>price[i]){
                    int currentProfit = price[j] - price[i] 
                    +getMaxProfit(price, start, i-1)
                    +getMaxProfit(price, j+1, end);

                    profit = Math.max(profit, currentProfit);
                }
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] array = {100,180,260,310,40,535,695};
        System.out.println(new StockMaxProfit().getMaxProfit(array, 0, array.length-1));
    }
}
