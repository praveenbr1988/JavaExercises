package leetcodePractice;

import java.util.*;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(prices));
    }


    public static int bestTime(int[] prices) {

        int i=0;
        int lo=prices[0], hi=prices[0], profit=0;
        int n=prices.length;

        while(i<n-1){
            while(i<n-1 && prices[i]>=prices[i+1]){
                i+=1;
            }
            lo=prices[i];

            while(i<n-1 && prices[i]<=prices[i+1]){
                i+=1;
            }
            hi=prices[i];

            profit+= hi-lo;

        }
        return profit;



    }
}

